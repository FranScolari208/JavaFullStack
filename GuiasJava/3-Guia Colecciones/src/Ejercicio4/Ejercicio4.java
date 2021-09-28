package Ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
 • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
* 
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Character validacion = 's';
        
        List<Pelicula> listaDePeliculas = new ArrayList();
        PeliculaService peliculaServi = new PeliculaService();
        Pelicula pelicula;
        
        while (validacion == 's'){
            pelicula = peliculaServi.crearPelicula();
            listaDePeliculas.add(pelicula);
            
            System.out.println("INGRESE UNA OPCION:");
            System.out.println("S PARA INGRESAR NUEVA PELICULA");
            System.out.println("N PARA SALIR");
            validacion = leer.next().charAt(0);
            System.out.println(" ");
        }
        System.out.println("--------------TODAS LAS PELICULAS-------------------");
        peliculaServi.mostrarPeliculas(listaDePeliculas);
        System.out.println("--------------PELICULAS LARGAS-----------------------");
        peliculaServi.mostrarPeliculasLargas(listaDePeliculas);
        System.out.println("----------PELICULAS DE MAYOR A MENOR-----------------");
        peliculaServi.mostrarPeliculasOrdenadasPorDuracionMayorMenor(listaDePeliculas);
        System.out.println("----------PELICULAS DE MENOR A MAYOR-----------------");
        peliculaServi.mostrarPeliculasOrdenadasPorDuracionMenorMayor(listaDePeliculas);
        System.out.println("------PELICULAS ORDENADAS ALFABETICAMENTE------------");
        peliculaServi.mostrarPeliculasOrdenadasAlfabeticamente(listaDePeliculas);
        System.out.println("----------PELICULAS ORDENADAS POR DIRECTOR------------");
        peliculaServi.mostrarPeliculasOrdenadasPorDirector(listaDePeliculas);
    }
    
}
