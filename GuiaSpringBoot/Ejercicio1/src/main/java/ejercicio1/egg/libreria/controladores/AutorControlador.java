package ejercicio1.egg.libreria.controladores;

import ejercicio1.egg.libreria.entidades.Autor;
import ejercicio1.egg.libreria.servicios.AutorServicio;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/autores")
public class AutorControlador {
    
    @Autowired
    private AutorServicio autorServicio;
    
    @GetMapping
    public ModelAndView mostrarTodos(HttpServletRequest request){
        Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);   
        ModelAndView mav = new ModelAndView("autores");
        
        if (flashMap != null) {
            mav.addObject("exito", flashMap.get("exito-name"));
            mav.addObject("error", flashMap.get("error-name"));
        }
        
        mav.addObject("autores", autorServicio.obtenerAutores());  
        return mav;
    }
    
    @GetMapping("/crear")
    public ModelAndView crearAutor(){
        ModelAndView mav = new ModelAndView("ingresoAutor");
        mav.addObject("autor", new Autor());
        mav.addObject("title", "Crear Autor");
        mav.addObject("action", "guardar");     
        return mav;
    }

    @GetMapping("/editar/{id}")
    public ModelAndView editarAutor(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView("ingresoAutor");
        mav.addObject("autor", autorServicio.buscarPorId(id));
        mav.addObject("title", "Editar Autor");
        mav.addObject("action", "modificar");
        return mav;
    }

    @PostMapping("/modificar")
    public RedirectView modificar(@RequestParam Long id, @RequestParam String nombre, @RequestParam String apellido) throws Exception{
        autorServicio.modificar(id, nombre, apellido);
        return new RedirectView("/autores");
    }
    
    @PostMapping("/guardar")
    public RedirectView guardar(@RequestParam String nombre, @RequestParam String apellido) throws Exception{
        autorServicio.crearAutor(nombre, apellido);
        return new RedirectView("/autores");
    }

    @PostMapping("/deshabilitar/{id}")
    public RedirectView deshabilitar(@PathVariable Long id) {
        autorServicio.deshabilitar(id);
        return new RedirectView("/autores");
    }

    @PostMapping("/habilitar/{id}")
    public RedirectView habilitar(@PathVariable Long id) {
        autorServicio.habilitar(id);
        return new RedirectView("/autores/deshabilitados");
    }
    
    @GetMapping("/deshabilitados")
    public ModelAndView mostrarDeshabilitados(HttpServletRequest request){
        Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);
        ModelAndView mav = new ModelAndView("autoresDeshabilitados");

        if (flashMap != null) {
            mav.addObject("exito", flashMap.get("exito-name"));
            mav.addObject("error", flashMap.get("error-name"));
        }

        mav.addObject("autores", autorServicio.obtenerAutoresDeshabilitados());
        return mav;
    }
}
