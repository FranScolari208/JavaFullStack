package ejercicio1.egg.libreria.servicios;

import ejercicio1.egg.libreria.entidades.Autor;
import ejercicio1.egg.libreria.entidades.Editorial;
import ejercicio1.egg.libreria.entidades.Libro;
import ejercicio1.egg.libreria.repositorios.AutorRepositorio;
import ejercicio1.egg.libreria.repositorios.EditorialRepositorio;
import ejercicio1.egg.libreria.repositorios.LibroRepositorio;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class LibroServicio {
    
    @Autowired
    private LibroRepositorio libroRepositorio;
    
    @Autowired
    private AutorRepositorio autorRepositorio;
    
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
    @Transactional
    public void crearLibro(String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Long idAutor, Long idEditorial) throws Exception{
        Libro libro = new Libro();

        validarDatosDelLibro(titulo.toLowerCase(), anio, ejemplares, ejemplaresPrestados);
        Integer ejemplaresRestantes = ejemplares - ejemplaresPrestados;
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(ejemplaresRestantes);
        libro.setAutor(autorRepositorio.findById(idAutor).orElse(null));
        libro.setEditorial(editorialRepositorio.findById(idEditorial).orElse(null));
        libro.setAlta(true);
        
        libroRepositorio.save(libro);
    }
    
    @Transactional
    public void modificar(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Autor autor, Editorial editorial) throws Exception{
        validarDatosDelLibro(titulo, anio, ejemplares, ejemplaresPrestados);
        libroRepositorio.modificar(isbn, titulo, anio, ejemplares, ejemplaresPrestados, autor,  editorial);
    }
    
    @Transactional(readOnly = true)
    public List<Libro> obtenerLibros(){
        return libroRepositorio.findAll();
    }
    
    @Transactional(readOnly = true)
    public Libro buscarPorIsbn(Long isbn){
        Optional<Libro> libroOpcional = libroRepositorio.findById(isbn);
        return libroOpcional.orElse(null);
    }

    @Transactional
    public void eliminar(Long id){
        libroRepositorio.deleteById(id);
    }

    public void validarDatosDelLibro(String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados) throws Exception{

        if(titulo == null || titulo.trim().isEmpty()){
            throw new Exception("EL TITULO DEL LIBRO ES OBLIGATORIO");
        }

        if(libroRepositorio.buscarLibroPorTitulo(titulo) != null){
            throw new Exception("YA EXISTE UN LIBRO CON ESE TITULO");
        }

        if(ejemplares == 0 || ejemplares == null){
            throw new Exception("LA CANTIDAD DE EJEMPLARES NO PUEDE SER CERO");
        }

        if(ejemplares < 0 || ejemplaresPrestados < 0){
            throw new Exception("NO SE ADMITEN EJEMPLARES NEGATIVOS");
        }

        if(ejemplaresPrestados > ejemplares){
            throw new Exception("LA CANTIDAD DE EJEMPLARES PRESTADOS NO PUEDE SER SUPERIOR");
        }

        Calendar cal = Calendar.getInstance();

        if(anio > cal.get(Calendar.YEAR)){
            throw new Exception("EL AÑO DEL LIBRO NO PUEDE SER MAYOR AL ACTUAL");
        }

        Integer contador = 0;
        while(anio != 0){
            anio = anio/10;
            contador ++;
        }

        if(contador != 4){
            throw new Exception("EL AÑO DEBE TENER 4 CIFRAS");
        }


    }
}
