package ejercicio1.egg.libreria.controladores;

import ejercicio1.egg.libreria.entidades.Usuario;
import ejercicio1.egg.libreria.servicios.UsuarioServicio;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Map;


@Controller
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/login")
    public ModelAndView login(@RequestParam(required = false) String error, @RequestParam(required = false) String logout, Principal principal){
        ModelAndView mav = new ModelAndView("login");
        if (error != null) {
            mav.addObject("error", "CORREO O CONTRASEÑA INCORRECTO");
        }
        if (logout != null) {
            mav.addObject("logout", "Sesión Finalizada");
        }
        if (principal != null) {
            LOGGER.info("Principal -> {}", principal.getName());
            mav.setViewName("redirect:/");
        }
        return mav;
    }

    @GetMapping("/signup")
    public ModelAndView signup(HttpServletRequest request, @RequestParam(required = false) String exito){
        ModelAndView mav = new ModelAndView("signup");
        Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);

        if (flashMap != null) {
            mav.addObject("error", flashMap.get("error"));
        }
        mav.addObject("usuario", new Usuario());
        mav.addObject("action", "registro");
        return mav;
    }

    @PostMapping("/registro")
    public RedirectView signup(@RequestParam String username, @RequestParam String nombre, @RequestParam String apellido, @RequestParam String correo, @RequestParam String clave, RedirectAttributes attributes, HttpServletRequest request) {
        RedirectView redirectView = new RedirectView("/login");

        try {
            usuarioServicio.crearUsuario(username, nombre, apellido, correo, clave);
            attributes.addFlashAttribute("exito", "SE HA REGISTRADO CON ÉXITO.");

        } catch (Exception e) {
            attributes.addFlashAttribute("error", e.getMessage());
            redirectView.setUrl("/signup");
        }
        return redirectView;
    }
}
