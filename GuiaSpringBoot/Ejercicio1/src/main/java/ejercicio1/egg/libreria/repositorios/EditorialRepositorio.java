package ejercicio1.egg.libreria.repositorios;


import ejercicio1.egg.libreria.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepositorio extends JpaRepository <Editorial, Long>{
    
}
