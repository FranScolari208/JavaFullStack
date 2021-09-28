package Ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;
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
 */


public class PeliculaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Pelicula crearPelicula() {
    Pelicula pelicula = new Pelicula();
      
    System.out.println("Ingrese el nombre de la pelicula");
    String nombre = leer.next();
    
    pelicula.setTitulo(nombre);
    
    System.out.println("Ingrese el nombre del director de la pelicula");
    String director = leer.next();
    
    pelicula.setDirector(director);
    
    System.out.println("Ingrese la duracion en minutos de la pelicula");
    Integer tiempo = leer.nextInt();
    
    pelicula.setDuracion(tiempo);
      
    return pelicula;

    }

    public void mostrarPeliculas(List<Pelicula> listaDePeliculas) {
        
         for(Pelicula pelicula : listaDePeliculas){
            System.out.println("Nombre: "+pelicula.getTitulo());
            System.out.println("Director: "+pelicula.getDirector());
            System.out.println("Duracion: "+pelicula.getDuracion());
            System.out.println("");
        }
    }
    
    public void mostrarPeliculasLargas(List<Pelicula> listaDePeliculas){
        Iterator<Pelicula> iterator = listaDePeliculas.iterator();
        List <Pelicula> listaDePeliculasLargas = new ArrayList();
        while(iterator.hasNext()){
            
            Pelicula peliculaActual = iterator.next(); // Obtengo el alumno actual
            Integer largoDePelicula = peliculaActual.getDuracion(); // obtengo el nombre del alumno actual
            
            if (largoDePelicula > 60){ // comparo el nombre del alumno actual con el nombre ingresado
                 
                listaDePeliculasLargas.add(peliculaActual);
                
            }
            
        }
        mostrarPeliculas(listaDePeliculasLargas);
    }
    
    public void mostrarPeliculasOrdenadasPorDuracionMayorMenor(List<Pelicula> listaDePeliculas) {
        listaDePeliculas.sort(Pelicula.compararDuracionMayorMenor);
        mostrarPeliculas(listaDePeliculas);
    }
    
    public void mostrarPeliculasOrdenadasPorDuracionMenorMayor(List<Pelicula> listaDePeliculas){
        listaDePeliculas.sort(Pelicula.compararDuracionMenorMayor);
        mostrarPeliculas(listaDePeliculas);
    }
    
    public void mostrarPeliculasOrdenadasAlfabeticamente(List<Pelicula> listaDePeliculas){
        listaDePeliculas.sort(Pelicula.compararTituloAlfabeticamente);
        mostrarPeliculas(listaDePeliculas);
    }
    
    public void mostrarPeliculasOrdenadasPorDirector(List<Pelicula> listaDePeliculas){
        listaDePeliculas.sort(Pelicula.compararDirectorAlfabeticamente);
        mostrarPeliculas(listaDePeliculas);
    }
}
