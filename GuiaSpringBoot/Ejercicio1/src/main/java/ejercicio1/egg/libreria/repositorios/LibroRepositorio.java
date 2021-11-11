package ejercicio1.egg.libreria.repositorios;

import ejercicio1.egg.libreria.entidades.Libro;
import ejercicio1.egg.libreria.entidades.Autor;
import ejercicio1.egg.libreria.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends JpaRepository <Libro, Long>{

    @Modifying
    @Query("UPDATE Libro l SET l.titulo = :titulo, l.anio = :anio, l.ejemplares = :ejemplares, l.ejemplaresPrestados = :ejemplaresPrestados, l.autor = :autor, l.editorial = :editorial WHERE l.isbn = :isbn")
    void modificar(@Param("isbn") Long isbn, @Param("titulo") String titulo, @Param("anio") Integer anio, @Param("ejemplares") Integer ejemplares, @Param("ejemplaresPrestados") Integer ejemplaresPrestados, @Param("autor") Autor autor, @Param("editorial") Editorial editorial);

    @Query("SELECT l FROM Libro l WHERE l.titulo = :titulo")
    Libro buscarLibroPorTitulo(@Param("titulo") String titulo);
}
