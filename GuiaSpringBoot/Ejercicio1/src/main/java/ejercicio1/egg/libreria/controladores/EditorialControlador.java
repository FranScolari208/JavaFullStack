package ejercicio1.egg.libreria.controladores;

import ejercicio1.egg.libreria.entidades.Editorial;
import ejercicio1.egg.libreria.servicios.EditorialServicio;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public RedirectView guardar(@RequestParam String nombre){
        editorialServicio.crearEditorial(nombre);
        return new RedirectView("/editoriales");
    }
}
