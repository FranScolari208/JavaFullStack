package Ejercicio1;

public class Libro {
    private Integer isbn; 
    private String titulo; 
    private String autor; 
    private Integer paginas; 

 public Libro (Integer isbn, String titulo, String autor, Integer paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
 
 public Libro() {

    }
    
 public void llenarLibro(Integer isbn, String titulo, String autor, Integer paginas) {

        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
 public void mostrarLibro() {

        System.out.println("El ISBN del libro es: " + isbn);
        System.out.println("El titulo del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("La cantidad de paginas del libro son: " + paginas);

    }
}