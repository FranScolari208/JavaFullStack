package ejercicio1.egg.libreria.servicios;

import ejercicio1.egg.libreria.entidades.Editorial;
import ejercicio1.egg.libreria.repositorios.EditorialRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EditorialServicio {
    
    @Autowired
    private EditorialRepositorio repositorio;
    
    @Transactional
    public void crearEditorial(Long id, String nombre){
        Editorial editorial = new Editorial();
        
        editorial.setId(id);
        editorial.setNombre(nombre);
        editorial.setAlta(true);
        
        repositorio.save(editorial);
    }
    
    @Transactional
    public void modificar(Long id, String nombre){
        repositorio.modificar(id, nombre);
    }
    
    @Transactional(readOnly = true)
    public List<Editorial> obtenerEditoriales(){
        return repositorio.findAll();
    }
    
    @Transactional(readOnly = true)
    public Editorial buscarPorId(Long id){
        Optional<Editorial> editorialOpcional = repositorio.findById(id);
        return editorialOpcional.orElse(null);
    }
}
