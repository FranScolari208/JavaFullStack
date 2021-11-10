package ejercicio1.egg.libreria.repositorios;


import ejercicio1.egg.libreria.entidades.Autor;
import ejercicio1.egg.libreria.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EditorialRepositorio extends JpaRepository <Editorial, Long>{

    @Modifying
    @Query("UPDATE Editorial e SET e.nombre = :nombre WHERE e.id = :id")
    void modificar(@Param("id") Long id, @Param("nombre") String nombre);

    @Query("SELECT e FROM Editorial e WHERE e.alta = 0")
    List<Editorial> obtenerDeshabilitadas();

    @Query("SELECT e FROM Editorial e WHERE e.alta = 1")
    List<Editorial> obtenerEditorialesHabilitadas();

    @Modifying
    @Query("UPDATE Editorial e SET e.alta = 0 WHERE e.id = :id")
    void deshabilitarEditorial(@Param("id") Long id);

    @Modifying
    @Query("UPDATE Editorial e SET e.alta = 1 WHERE e.id = :id")
    void habilitarEditorial(@Param("id") Long id);

    @Query("SELECT e FROM Editorial e WHERE e.nombre = :nombre")
    Editorial buscarEditorialPorNombre(@Param("nombre") String nombre);
}
