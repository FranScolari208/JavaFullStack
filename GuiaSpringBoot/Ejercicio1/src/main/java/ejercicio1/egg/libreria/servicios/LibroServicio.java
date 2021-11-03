package ejercicio1.egg.libreria.servicios;

import ejercicio1.egg.libreria.entidades.Autor;
import ejercicio1.egg.libreria.entidades.Editorial;
import ejercicio1.egg.libreria.entidades.Libro;
import ejercicio1.egg.libreria.repositorios.AutorRepositorio;
import ejercicio1.egg.libreria.repositorios.EditorialRepositorio;
import ejercicio1.egg.libreria.repositorios.LibroRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class LibroServicio {
    
    @Autowired
    private LibroRepositorio repositorio;
    
    @Autowired
    private AutorRepositorio autorRepositorio;
    
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
    @Transactional
    public void crearLibro(String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Long idAutor, Long idEditorial){
        Libro libro = new Libro();
        
        Integer ejemplaresRestantes = ejemplares - ejemplaresPrestados;
        
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(ejemplaresRestantes);
        libro.setAutor(autorRepositorio.findById(idAutor).orElse(null));
        libro.setEditorial(editorialRepositorio.findById(idEditorial).orElse(null));
        libro.setAlta(true);
        
        repositorio.save(libro);
    }
    
    @Transactional
    public void modificar(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes){
        repositorio.modificar(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes);
    }
    
    @Transactional(readOnly = true)
    public List<Libro> obtenerLibros(){
        return repositorio.findAll();
    }
    
    @Transactional(readOnly = true)
    public Libro buscarPorIsbn(Long isbn){
        Optional<Libro> libroOpcional = repositorio.findById(isbn);
        return libroOpcional.orElse(null);
    }

    @Transactional
    public void eliminar(Long id){
        repositorio.deleteById(id);
    }
}
