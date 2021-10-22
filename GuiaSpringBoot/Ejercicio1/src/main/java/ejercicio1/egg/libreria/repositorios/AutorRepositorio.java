package ejercicio1.egg.libreria.repositorios;


import ejercicio1.egg.libreria.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends JpaRepository <Autor, Long>{
    
}
