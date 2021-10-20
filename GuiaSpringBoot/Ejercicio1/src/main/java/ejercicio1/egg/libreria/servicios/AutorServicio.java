package ejercicio1.egg.libreria.servicios;

import ejercicio1.egg.libreria.entidades.Autor;
import ejercicio1.egg.libreria.repositorios.AutorRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutorServicio {
    
    @Autowired
    private AutorRepositorio repositorio;
    
    @Transactional
    public void crearAutor(String nombre){
        Autor autor = new Autor();
        
        autor.setNombre(nombre);
        autor.setAlta(true);
        
        repositorio.save(autor);
    }
    
    @Transactional(readOnly = true)
    public List<Autor> obtenerAutores(){
        return repositorio.findAll();
    }
}

