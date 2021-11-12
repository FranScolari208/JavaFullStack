package ejercicio1.egg.libreria.repositorios;

import ejercicio1.egg.libreria.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, String> {

    Optional<Usuario> findByUsername(String username);

}
