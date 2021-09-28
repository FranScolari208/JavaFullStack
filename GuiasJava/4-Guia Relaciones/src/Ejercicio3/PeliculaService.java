/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

public class PeliculaService {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    public Pelicula crearPelicula(){
        Pelicula pelicula = new Pelicula();
        System.out.println("INGRESE EL TITULO DE LA PELICULA");
        pelicula.setTitulo(leer.next());
        System.out.println("INGRESE LA DURACION DE LA PELICULA");
        pelicula.setDuracion(leer.nextInt());
        System.out.println("INGRESE LA EDAD MINIMA DE LA PELICULA");
        pelicula.setEdadMinima(leer.nextInt());
        System.out.println("INGRESE EL NOMBRE DEL DIRECTOR DE LA PELICULA");
        pelicula.setDirector(leer.next());
        return pelicula;
    }
}
