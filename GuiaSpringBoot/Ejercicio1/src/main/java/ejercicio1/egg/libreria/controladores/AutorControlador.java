package ejercicio1.egg.libreria.controladores;

import ejercicio1.egg.libreria.entidades.Autor;
import ejercicio1.egg.libreria.servicios.AutorServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@Controller
@RequestMapping("/autores")
public class AutorControlador {
    
    @Autowired
    private AutorServicio autorServicio;
    
    @GetMapping("/todos")
    public ModelAndView mostrarAutores(){
        ModelAndView mav = new ModelAndView("autores-lista");
        List<Autor> autores = autorServicio.obtenerAutores();
        mav.addObject("autores", autores);
        
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
    
    @PostMapping("/guardar")
    public RedirectView guardar(@RequestParam Long id, @RequestParam String nombre, @RequestParam String apellido){
        autorServicio.crearAutor(id, nombre, apellido);
        return new RedirectView("/autores");
    }
    
//    @GetMapping("/editar")
//    public ModelAndView editarAutor
}
