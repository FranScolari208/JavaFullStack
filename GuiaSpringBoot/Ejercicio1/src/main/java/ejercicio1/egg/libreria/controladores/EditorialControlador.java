package ejercicio1.egg.libreria.controladores;

import ejercicio1.egg.libreria.entidades.Editorial;
import ejercicio1.egg.libreria.servicios.EditorialServicio;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/editoriales")
public class EditorialControlador {
    
    @Autowired
    private EditorialServicio editorialServicio;
    
    @GetMapping
    public ModelAndView mostrarTodos(HttpServletRequest request){
        Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);
        ModelAndView mav = new ModelAndView("editoriales");
        
        if (flashMap != null) {
            mav.addObject("exito", flashMap.get("exito-name"));
            mav.addObject("error", flashMap.get("error-name"));
        }
        
        mav.addObject("editoriales", editorialServicio.obtenerEditoriales());  
        return mav;
    }
    
    @GetMapping("/crear")
    public ModelAndView crearEditorial(){
        ModelAndView mav = new ModelAndView("ingresoEditorial");
        mav.addObject("editorial", new Editorial());
        mav.addObject("title", "Crear Editorial");
        mav.addObject("action", "guardar");     
        return mav;
    }
    
    @PostMapping("/guardar")
    public RedirectView guardar(@RequestParam String nombre) throws Exception{
        editorialServicio.crearEditorial(nombre);
        return new RedirectView("/editoriales");
    }

    @PostMapping("/deshabilitar/{id}")
    public RedirectView deshabilitar(@PathVariable Long id) {
        editorialServicio.deshabilitar(id);
        return new RedirectView("/editoriales");
    }

    @PostMapping("/habilitar/{id}")
    public RedirectView habilitar(@PathVariable Long id) {
        editorialServicio.habilitar(id);
        return new RedirectView("/editoriales/deshabilitadas");
    }

    @GetMapping("/editar/{id}")
    public ModelAndView editarEditorial(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView("ingresoEditorial");
        mav.addObject("editorial", editorialServicio.buscarPorId(id));
        mav.addObject("title", "Editar Editorial");
        mav.addObject("action", "modificar");
        return mav;
    }

    @PostMapping("/modificar")
    public RedirectView modificar(@RequestParam Long id, @RequestParam String nombre) throws Exception{
        editorialServicio.modificar(id, nombre);
        return new RedirectView("/editoriales");
    }

    @GetMapping("/deshabilitadas")
    public ModelAndView mostrarDeshabilitados(HttpServletRequest request){
        Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);
        ModelAndView mav = new ModelAndView("editorialesDeshabilitadas");

        if (flashMap != null) {
            mav.addObject("exito", flashMap.get("exito-name"));
            mav.addObject("error", flashMap.get("error-name"));
        }

        mav.addObject("editoriales", editorialServicio.obtenerEditorialesDeshabilitadas());
        return mav;
    }
}
