package ejercicio1.egg.libreria.controladores;

import ejercicio1.egg.libreria.entidades.Autor;
import ejercicio1.egg.libreria.servicios.AutorServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/autores")
public class AutorControlador {
    
    @Autowired
    private AutorServicio servicio;
    
    @GetMapping("/todos")
    public ModelAndView mostrarAutores(){
        ModelAndView mav = new ModelAndView("autores-lista");
        List<Autor> autores = servicio.obtenerAutores();
        mav.addObject("autores", autores);
        
        return mav;
    }
    
}
