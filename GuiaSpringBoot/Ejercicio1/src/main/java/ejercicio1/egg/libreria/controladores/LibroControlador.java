package ejercicio1.egg.libreria.controladores;

import ejercicio1.egg.libreria.entidades.Autor;
import ejercicio1.egg.libreria.entidades.Editorial;
import ejercicio1.egg.libreria.entidades.Libro;
import ejercicio1.egg.libreria.servicios.AutorServicio;
import ejercicio1.egg.libreria.servicios.EditorialServicio;
import ejercicio1.egg.libreria.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/libros")
public class LibroControlador {
    
    @Autowired
    private LibroServicio libroServicio;
    
    @Autowired
    private AutorServicio autorServicio;
    
    @Autowired
    private EditorialServicio editorialServicio;
    
    @GetMapping
    public ModelAndView mostrarTodos(){
        ModelAndView mav = new ModelAndView("libros");
        mav.addObject("libros", libroServicio.obtenerLibros());  
        return mav;
    }
    
    @GetMapping("/crear")
    public ModelAndView crearLibro(){
        ModelAndView mav = new ModelAndView("ingresoLibro");
        mav.addObject("autores", autorServicio.obtenerAutores());
        mav.addObject("editoriales", editorialServicio.obtenerEditoriales());
        mav.addObject("libro", new Libro());
        mav.addObject("title", "Crear Libro");
        mav.addObject("action", "guardar");     
        return mav;
    }
    
    @PostMapping("/guardar")
    public RedirectView guardar(@RequestParam String titulo, @RequestParam Integer anio, @RequestParam Integer ejemplares, @RequestParam Integer ejemplaresPrestados, @RequestParam("autor") Long idAutor, @RequestParam("editorial") Long idEditorial){
        libroServicio.crearLibro(titulo, anio, ejemplares, ejemplaresPrestados, idAutor, idEditorial);
        return new RedirectView("/libros");
    }

    @PostMapping("/eliminar/{id}")
    public RedirectView eliminar(@PathVariable Long id){
        libroServicio.eliminar(id);
        return new RedirectView("/libros");
    }
}
