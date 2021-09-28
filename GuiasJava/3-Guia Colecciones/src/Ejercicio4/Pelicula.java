package Ejercicio4;

import java.util.Comparator;

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
public class Pelicula {
    private String titulo;
    private String director;
    private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    
    public static Comparator<Pelicula> compararDuracionMayorMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            return pelicula2.getDuracion().compareTo(pelicula1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> compararDuracionMenorMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            return pelicula1.getDuracion().compareTo(pelicula2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> compararTituloAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            return pelicula1.getTitulo().compareTo(pelicula2.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> compararDirectorAlfabeticamente = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2){
            return pelicula1.getDirector().compareTo(pelicula2.getDirector());
        }
    };
    
    
}
