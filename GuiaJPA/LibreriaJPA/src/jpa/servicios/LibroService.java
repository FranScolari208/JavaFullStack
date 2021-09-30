package jpa.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import jpa.entidades.Autor;
import jpa.entidades.Editorial;
import jpa.entidades.Libro;
import jpa.excepcion.MiExcepcion;
import jpa.persistencia.LibroDAO;


public class LibroService {
    private LibroDAO libroDAO;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public LibroService() {
        libroDAO = new LibroDAO();

    }
    
    public void insertarLibro() throws MiExcepcion, MiExcepcion{
        EditorialService editorialService = new EditorialService();
        AutorService autorService = new AutorService();
        
        try{
            //ISBN
            Long isbn;
            do {
                isbn = Long.parseLong(generarIsbn());
            } while (libroDAO.buscarLibroPorIsbn(isbn) != null);
            if(isbn == null){
                throw new Exception("EL ISBN ES OBLIGATORIO");
            }
            
            //Titulo
            System.out.println("INGRESE EL TITULO DEL LIBRO");
            String titulo = leer.next();
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception("EL TITULO DEL LIBRO ES OBLIGATORIO");
            }
            
            //Año
            System.out.println("INGRESE EL AÑO DEL LIBRO");
            Integer anio = leer.nextInt();
            if (anio == null) {
                throw new Exception("EL AÑO DEL LIBRO ES OBLIGATORIO");
            }
            
            //Cantidad de ejemplares
            System.out.println("INGRESE LA CANTIDAD DE EJEMPLARES");
            Integer ejemplares = leer.nextInt();
            if (ejemplares == null) {
                throw new Exception("LOS EJEMPLARES SON OBLIGATORIOS");
            }
            
            //Ejemplares prestados
            System.out.println("INGRESE LA CANTIDAD DE EJEMPLARES PRESTADOS");
            Integer ejemplaresPrestados = leer.nextInt();
            if (ejemplaresPrestados == null || ejemplaresPrestados > ejemplares) {
                throw new Exception("EJEMPLARES PRESTADOS NO DISPONIBLES O NO INSERTADOS");
            }
            
            //Ejemplares restantes
            Integer ejemplaresRestantes = ejemplares - ejemplaresPrestados;
            
            //Editorial
            System.out.println("INGRESE EL NOMBRE DE LA EDITORIAL DEL LIBRO");
            String nombreEditorial = leer.next();
            Editorial editorial = editorialService.buscarEditorialPorNombre(nombreEditorial);
            if(editorial == null){
                throw new Exception("LA EDITORIAL ES OBLIGATORIA");
            }
            
            //Autor
            System.out.println("INGRESE EL NOMBRE DEL AUTOR DEL LIBRO");
            String nombreAutor = leer.next();
            List<Autor> autores = autorService.buscarAutorPorNombre(nombreAutor);
            Autor autor;
            if(autores.isEmpty()){
               System.out.println("NO HAY AUTORES CON ESE NOMBRE");
               System.out.println("DESEA INGRESAR UN AUTOR NUEVO? S/N");
               Character opcion = leer.next().charAt(0);
               if(opcion == 's'){
                   autor = autorService.crearAutor();
                
            }else{
                   throw new Exception("EL AUTOR ES OBLIGATORIO");
                 }
            }else{
               System.out.println("INGRESE EL ID DEL AUTOR");
               Long id = leer.nextLong();
               autor = autorService.buscarAutorPorID(id);
               if(autor == null){
                  throw new Exception("ERROR EN INTRODUCIR AL AUTOR LUEGO DE BUSCARLO POR CODIGO");
               }
           }
            
            Libro libro = new Libro();
            
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setEditorial(editorial);
            libro.setAutor(autor);
            libro.setAlta(true);

            libroDAO.guardarLibro(libro);
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN INTRODUCIR EL LIBRO");
        }
    }
    
    public static String generarIsbn() {
        return UUID.randomUUID().toString()
                .replaceAll("[^0-9]", "")
                .substring(0, 13);
    }
    
    public List<Libro> obtenerLibros()throws MiExcepcion{
        try{
        List<Libro> libros = new ArrayList();
        libros = libroDAO.obtenerTodosLosLibros();
        return libros;
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN OBTENER LOS LIBROS");
        }
    }
    
    public void imprimirLibros(List<Libro> libros)throws MiExcepcion{
        try{
            if (libros.isEmpty()) {
                System.out.println("NO EXISTEN LIBROS");
            } else {
                    System.out.println(" ");
                    System.out.println("*********************************************************************************************************************************************************");
                    System.out.println("********************************************************************      LIBROS     ********************************************************************");
                    System.out.println("*********************************************************************************************************************************************************");
                    System.out.println("*                                                                                                                                                       *");
                    System.out.printf("%-15s%-20s%-10s%-20s%-20s%-20s%-20s%-20s%-10s\n", "ISBN", "TITULO LIBRO", "AÑO", "EJEMPLARES", "PRESTADOS", "RESTANTES", "AUTOR", "EDITORIAL", "ALTA");
                for (int i = 0; i < libros.size(); i++) {
                    AutorService autorService = new AutorService();
                    EditorialService editorialService = new EditorialService();
                    Long id = libros.get(i).getAutor().getId();
                    Long idEditorial = libros.get(i).getEditorial().getId();
                    String nombreAutor = autorService.buscarAutorPorID(id).getNombre();
                    String nombreEditorial = editorialService.buscarEditorialPorID(idEditorial).getNombre();
                    System.out.printf("%-15d%-20s%-10s%-20s%-20s%-20s%-20s%-20s%-10s\n", libros.get(i).getIsbn(), libros.get(i).getTitulo(), libros.get(i).getAnio(), libros.get(i).getEjemplares(), libros.get(i).getEjemplaresPrestados(), libros.get(i).getEjemplaresRestantes(), nombreAutor, nombreEditorial, libros.get(i).getAlta());                 
                }
            }
                    System.out.println("*                                                                                                                                                       *");
                    System.out.println("*********************************************************************************************************************************************************");
                    System.out.println("*********************************************************************************************************************************************************");
                    System.out.println(" ");
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN IMPRIMIR LOS LIBROS");
        }
    }
    
    public Libro obtenerLibroPorID(Long isbn)throws MiExcepcion{
        try{
            Libro libro = libroDAO.buscarLibroPorIsbn(isbn);
            if(libro.equals(null)){
                throw new Exception("NO EXISTE EL LIBRO CON ESE ISBN");
            }
            return libro;
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN OBTENER EL LIBRO");
        }
    }
    
    public List<Libro> obtenerLibrosPorTitulo(String titulo)throws MiExcepcion{
        try{
            List<Libro> libro = libroDAO.buscarLibrosPorTitulo(titulo);
            if(libro.equals(null)){
                throw new Exception("NO EXISTE EL LIBRO CON ESE NOMBRE");
            }
            return libro;
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN OBTENER EL LIBRO");
        }
    }
    
    public List<Libro> obtenerLibroPorNombreDeAutor(String nombre)throws MiExcepcion{
        try{
        List<Libro> libros = libroDAO.buscarLibrosPorAutor(nombre);
        return libros;
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN OBTENER LOS LIBROS");
        }
    }
}
 
