package ejercicio1.egg.libreria.repositorios;


import ejercicio1.egg.libreria.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends JpaRepository <Autor, Long>{
    @Modifying
    @Query("UPDATE Autor a SET a.nombre = :nombre, a.apellido = :apellido WHERE a.id = :id")
    void modificar(@Param("id") Long id, @Param("nombre") String nombre, @Param("apellido") String apellido);
}
