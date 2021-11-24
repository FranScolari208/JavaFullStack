package ejercicio1.egg.libreria.repositorios;

import ejercicio1.egg.libreria.entidades.Autor;
import ejercicio1.egg.libreria.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, String> {

    Optional<Usuario> findByUsername(String username);

    @Query("SELECT u FROM Usuario u WHERE u.nombre = :nombre AND u.apellido = :apellido")
    Usuario buscarUsuarioPorNombreYApellido(@Param("nombre") String nombre, @Param("apellido") String apellido);

    @Query("SELECT u FROM Usuario u WHERE u.correo = :correo")
    Usuario buscarSiYaSeUtilizaMail(@Param("correo") String correo);

    @Query("SELECT u FROM Usuario u WHERE u.username = :username")
    Usuario buscarUsuarioPorUsername(@Param("username") String username);
}
