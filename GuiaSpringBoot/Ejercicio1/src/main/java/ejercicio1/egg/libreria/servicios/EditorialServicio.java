package ejercicio1.egg.libreria.servicios;

import ejercicio1.egg.libreria.entidades.Autor;
import ejercicio1.egg.libreria.entidades.Editorial;
import ejercicio1.egg.libreria.repositorios.EditorialRepositorio;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EditorialServicio {
    
    @Autowired
    private EditorialRepositorio repositorio;
    
    @Transactional
    public void crearEditorial(String nombre) throws Exception{
        Editorial editorial = new Editorial();
        validarEditorial(nombre.toLowerCase());
        editorial.setNombre(nombre);
        editorial.setAlta(true);
        
        repositorio.save(editorial);
    }
    
    @Transactional
    public void modificar(Long id, String nombre) throws Exception{
        validarEditorial(nombre.toLowerCase());
        repositorio.modificar(id, nombre);
    }
    
    @Transactional(readOnly = true)
    public List<Editorial> obtenerEditoriales(){
        return repositorio.obtenerEditorialesHabilitadas();
    }
    
    @Transactional(readOnly = true)
    public Editorial buscarPorId(Long id){
        Optional<Editorial> editorialOpcional = repositorio.findById(id);
        return editorialOpcional.orElse(null);
    }

    @Transactional
    public List<Editorial> obtenerEditorialesDeshabilitadas(){
        return repositorio.obtenerDeshabilitadas();
    }

    @Transactional
    public void deshabilitar(Long id) {
        repositorio.deshabilitarEditorial(id);
    }

    @Transactional
    public void habilitar(Long id) {
        repositorio.habilitarEditorial(id);
    }

    public void validarEditorial(String nombre) throws Exception{
        if(nombre == null || nombre.trim().isEmpty()){
            throw new Exception("EL NOMBRE DE LA EDITORIAL ES OBLIGATORIO");
        }

        if(repositorio.buscarEditorialPorNombre(nombre) != null){
            throw new Exception("YA EXISTE LA EDITORIAL CON ESE NOMBRE");
        }
    }
}
