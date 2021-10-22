package ejercicio1.egg.libreria.repositorios;


import ejercicio1.egg.libreria.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends JpaRepository <Libro, Long>{
    
}
