/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class EspectadorService {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Espectador crearEspectador(){
        Espectador espectador = new Espectador();
        System.out.println("INGRESE EL NOMBRE DEL ESPECTADOR");
        espectador.setNombre(leer.next());
        System.out.println("INGRESE LA EDAD DEL ESPECTADOR");
        espectador.setEdad(leer.nextInt());
        System.out.println("INGRESE EL DINERO DISPONIBLE DEL ESPECTADOR");
        espectador.setDineroDisponible(leer.nextDouble());
              
        return espectador;
    }
}
