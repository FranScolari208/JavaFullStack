/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.egg.libreria.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class PrincipalControler {
    
     @GetMapping("/home")
    public ModelAndView inicio(){
        return new ModelAndView("index");
    }
}
