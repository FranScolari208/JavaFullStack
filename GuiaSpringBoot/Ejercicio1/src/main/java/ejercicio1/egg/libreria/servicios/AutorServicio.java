package ejercicio1.egg.libreria.servicios;


import ejercicio1.egg.libreria.entidades.Autor;
import ejercicio1.egg.libreria.repositorios.AutorRepositorio;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutorServicio {
    
    @Autowired
    private AutorRepositorio repositorio;
    
    @Transactional
    public void crearAutor(String nombre, String apellido) throws Exception{
        Autor autor = new Autor();
        validarNombreDelAutor(nombre.toLowerCase(), apellido.toLowerCase());
        autor.setNombre(nombre);
        autor.setApellido(apellido);
        autor.setAlta(true);
        
        repositorio.save(autor);
    }
    
    @Transactional
    public void modificar(Long id, String nombre, String apellido) throws Exception{
        validarNombreDelAutor(nombre.toLowerCase(), apellido.toLowerCase());
        repositorio.modificar(id, nombre, apellido);
    }
    
    @Transactional(readOnly = true)
    public List<Autor> obtenerAutores(){
        return repositorio.obtenerHabilitados();
    }
    
    @Transactional(readOnly = true)
    public Autor buscarPorId(Long id){
        Optional<Autor> autorOpcional = repositorio.findById(id);
        return autorOpcional.orElse(null);
    }

    @Transactional
    public List<Autor> obtenerAutoresDeshabilitados(){
        return repositorio.obtenerDeshabilitados();
    }

    @Transactional
    public void deshabilitar(Long id) {
        repositorio.deshabilitarAutor(id);
    }

    @Transactional
    public void habilitar(Long id) {
        repositorio.habilitarAutor(id);
    }

    public void validarNombreDelAutor(String nombre, String apellido) throws Exception{
        if(nombre == null || nombre.trim().isEmpty()){
            throw new Exception("EL NOMBRE DEL AUTOR ES OBLIGATORIO");
        }

        if(apellido == null || apellido.trim().isEmpty()){
            throw new Exception("EL APELLIDO DEL AUTOR ES OBLIGATORIO");
        }

        if(repositorio.buscarAutorPorNombre(nombre, apellido) != null){
            throw new Exception("YA EXISTE UN AUTOR CON ESE NOMBRE Y APELLIDO");
        }
    }
}

