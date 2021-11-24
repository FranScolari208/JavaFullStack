package ejercicio1.egg.libreria.servicios;

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
    public void crearUsuario(String username, String nombre, String apellido, String correo, String clave)throws Exception{
        Usuario user = new Usuario();
        validarUsuario(username, nombre, apellido, correo);
        user.setUsername(username);
        user.setNombre(nombre);
        user.setApellido(apellido);
        user.setCorreo(correo);
        user.setClave(encoder.encode(clave)); //Aca se encripta la clave

        usuarioRepositorio.save(user);
    }
    public void validarUsuario(String username, String nombre, String apellido, String correo) throws Exception{
        if(username == null || username.trim().isEmpty()){
            throw new Exception("EL USERNAME ES OBLIGATORIO");
        }
        if(nombre == null || nombre.trim().isEmpty()){
            throw new Exception("EL NOMBRE DEL USUARIO ES OBLIGATORIO");
        }
        if(apellido == null || apellido.trim().isEmpty()){
            throw new Exception("EL APELLIDO DEL USUARIO ES OBLIGATORIO");
        }
        if(correo == null || correo.trim().isEmpty()){
            throw new Exception("EL CORREO ES OBLIGATORIO");
        }

        if(usuarioRepositorio.buscarUsuarioPorUsername(username) != null){
            throw new Exception("YA EXISTE UN USUARIO CON ESE USERNAME");
        }
        if(usuarioRepositorio.buscarSiYaSeUtilizaMail(correo) != null){
            throw new Exception("YA EXISTE UN USUARIO CON ESE CORREO");
        }
        if(usuarioRepositorio.buscarUsuarioPorNombreYApellido(nombre, apellido) != null){
            throw new Exception("YA EXISTE UN USUARIO CON ESE NOMBRE Y APELLIDO");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepositorio.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(String.format(MENSAJE, username)));

        return new User(usuario.getUsername(), usuario.getClave(), Collections.emptyList());
    }
}

