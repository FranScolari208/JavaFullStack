package ejercicio1.egg.libreria.controladores;

import ejercicio1.egg.libreria.entidades.Autor;
import ejercicio1.egg.libreria.entidades.Editorial;
import ejercicio1.egg.libreria.entidades.Libro;
import ejercicio1.egg.libreria.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/libros")
public class LibroControlador {
    
    @Autowired
    private LibroServicio libroServicio;
    
    @GetMapping
    public ModelAndView mostrarTodos(){
        ModelAndView mav = new ModelAndView("libros");
        mav.addObject("libros", libroServicio.obtenerLibros());  
        return mav;
    }
    
    @GetMapping("/crear")
    public ModelAndView crearLibro(){
        ModelAndView mav = new ModelAndView("ingresoLibro");
        mav.addObject("libro", new Libro());
        mav.addObject("title", "Crear Libro");
        mav.addObject("action", "guardar");     
        return mav;
    }
    
    @PostMapping("/guardar")
    public RedirectView guardar(@RequestParam String titulo, @RequestParam Integer anio, @RequestParam Integer ejemplares, @RequestParam Integer ejemplaresPrestados, @RequestParam Long idAutor, @RequestParam Long idEditorial){
        libroServicio.crearLibro(titulo, anio, ejemplares, ejemplaresPrestados, idAutor, idEditorial);
        return new RedirectView("/libros");
    }
}
