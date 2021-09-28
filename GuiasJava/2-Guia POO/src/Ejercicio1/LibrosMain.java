package Ejercicio1;

import java.util.Scanner;

/**
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */

public class LibrosMain {
    
     public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro libro1 = new Libro();
         
        System.out.println("Ingrese el ISBN del libro");
        int isbn = leer.nextInt();

        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.next();

        System.out.println("Ingrese el autor del libro");
        String autor = leer.next();

        System.out.println("Ingrese la cantidad de paginas del libro");
        int paginas = leer.nextInt();

        libro1.llenarLibro(isbn, titulo, autor, paginas);

        libro1.mostrarLibro();
    }
    
}
