package ejercicio1.egg.libreria.servicios;

import ejercicio1.egg.libreria.entidades.Autor;
import ejercicio1.egg.libreria.entidades.Usuario;
import ejercicio1.egg.libreria.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

@Service
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private BCryptPasswordEncoder encoder;

    private final String MENSAJE = "El username ingresado no existe %s";

    @Transactional
    public void crearUsuario(String username, String nombre, String apellido, String correo, String clave){
        Usuario user = new Usuario();

        user.setUsername(username);
        user.setNombre(nombre);
        user.setApellido(apellido);
        user.setCorreo(correo);
        user.setClave(encoder.encode(clave)); //Aca se encripta la clave

        usuarioRepositorio.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepositorio.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(String.format(MENSAJE, username)));

        return new User(usuario.getUsername(), usuario.getClave(), Collections.emptyList());
    }
}

