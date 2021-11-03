package ejercicio1.egg.libreria.repositorios;


import ejercicio1.egg.libreria.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepositorio extends JpaRepository <Autor, Long>{

    @Query("SELECT a FROM Autor a WHERE a.alta = 1")
    List<Autor> obtenerHabilitados();

    @Modifying
    @Query("UPDATE Autor a SET a.nombre = :nombre, a.apellido = :apellido WHERE a.id = :id")
    void modificar(@Param("id") Long id, @Param("nombre") String nombre, @Param("apellido") String apellido);

    @Query("SELECT a FROM Autor a WHERE a.alta = 0")
    List<Autor> obtenerDeshabilitados();

    @Modifying
    @Query("UPDATE Autor a SET a.alta = 0 WHERE a.id = :id")
    void deshabilitarAutor(@Param("id") Long id);

    @Modifying
    @Query("UPDATE Autor a SET a.alta = 1 WHERE a.id = :id")
    void habilitarAutor(@Param("id") Long id);
}
