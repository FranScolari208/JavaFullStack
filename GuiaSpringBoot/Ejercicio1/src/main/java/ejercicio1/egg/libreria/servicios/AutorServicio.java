package ejercicio1.egg.libreria.servicios;


import ejercicio1.egg.libreria.entidades.Autor;
import ejercicio1.egg.libreria.repositorios.AutorRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutorServicio {
    
    @Autowired
    private AutorRepositorio repositorio;
    
    @Transactional
    public void crearAutor(String nombre, String apellido){
        Autor autor = new Autor();
        
        autor.setNombre(nombre);
        autor.setApellido(apellido);
        autor.setAlta(true);
        
        repositorio.save(autor);
    }
    
    @Transactional
    public void modificar(Long id, String nombre, String apellido){
        repositorio.modificar(id, nombre, apellido);
    }
    
    @Transactional(readOnly = true)
    public List<Autor> obtenerAutores(){
        return repositorio.findAll();
    }
    
    @Transactional(readOnly = true)
    public Autor buscarPorId(Long id){
        Optional<Autor> autorOpcional = repositorio.findById(id);
        return autorOpcional.orElse(null);
    }
}

