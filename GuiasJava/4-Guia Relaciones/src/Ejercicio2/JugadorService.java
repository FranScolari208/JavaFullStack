/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class JugadorService {
    RevolverService revolverServi = new RevolverService();
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Jugador crearJugador(Integer i){
        Jugador jugador = new Jugador();
        jugador.setId(i+1);
        System.out.println("INGRESE EL NOMBRE DEL JUGADOR");
        jugador.setNombre(leer.next());
        jugador.setMojado(false);   
        return jugador;
    }

    
    public Boolean estaMojado(Jugador jugador){
        return jugador.getMojado();
    }
    
}
