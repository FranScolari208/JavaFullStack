package jpa.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import jpa.entidades.Autor;
import jpa.entidades.Editorial;
import jpa.entidades.Libro;
import jpa.excepcion.MiExcepcion;
import jpa.servicios.AutorService;
import jpa.servicios.EditorialService;
import jpa.servicios.LibroService;

public class Menu {
    
    private Scanner leer;
    private LibroService libroService;
    private AutorService autorService;
    private EditorialService editorialService;
    
    public Menu() {
        leer = new Scanner(System.in).useDelimiter("\n");
        libroService = new LibroService();
        autorService = new AutorService();
        editorialService = new EditorialService();
    }
    
    public void interfaz() throws Exception{
        int respuesta = 0;
        int salida = 14;
        
        try{
        do{
        System.out.println("**************************************************************************************");
        System.out.println("***********************      ¡BIENVENIDO A LA BIBLIOTECA!      ***********************");
        System.out.println("**************************************************************************************");
        System.out.println("**************************       SELECCIONE UNA OPCION       *************************");
        System.out.println("**************************************************************************************");
        System.out.println("***   1)Insertar Autor                                                             ***");
        System.out.println("***   2)Insertar Libro                                                             ***");
        System.out.println("***   3)Insertar Editorial                                                         ***");
        System.out.println("***   4)Busqueda de un autor por nombre                                            ***");
        System.out.println("***   5)Busqueda de un libro por ISBN                                              ***");
        System.out.println("***   6)Busqueda de un libro por titulo                                            ***");
        System.out.println("***   7)Busqueda de un libro por nombre de Autor                                   ***");
        System.out.println("***   8)Búsqueda de un libro por nombre de Editorial                               ***");
        System.out.println("***   9)Eliminar Libro                                                             ***");
        System.out.println("***   10)Modificar Libro                                                           ***");
        System.out.println("***   11)Imprimir Editoriales                                                      ***");
        System.out.println("***   12)Imprimir Autores                                                          ***");
        System.out.println("***   13)Imprimir Libros                                                           ***");
        System.out.println("***   14)Salir                                                                     ***");
        System.out.println("**************************************************************************************");
        System.out.println("**************************************************************************************");
        System.out.println("**************************************************************************************");
        respuesta = leer.nextInt();
        
        switch(respuesta){
            case 1:
                autorService.crearAutor();
                break;
            case 2:
                libroService.insertarLibro();
                break;
            case 3:
                editorialService.crearEditorial();
                break;
            case 4:
                List<Autor> autores = new ArrayList();
                System.out.println("INGRESE EL NOMBRE DEL AUTOR A BUSCAR");
                String nombre = leer.next();
                autorService.buscarAutorPorNombre(nombre);
                autorService.imprimirAutores(autores);
                break;
            case 5:
                List<Libro> libros = new ArrayList();
                System.out.println("INGRESE EL ISBN DEL LIBRO A BUSCAR");
                Long isbn = leer.nextLong();
                Libro libro = libroService.obtenerLibroPorID(isbn);
                libros.add(libro);
                if(libro.equals(null)){
                    throw new Exception("NO EXISTE EL LIBRO CON ESE ISBN");
                }else{
                    libroService.imprimirLibros(libros);
                }
                break;
            case 6:
                System.out.println("INGRESE EL TITULO DEL LIBRO A BUSCAR");
                String titulo = leer.next();
                List<Libro> libros6 = libroService.obtenerLibrosPorTitulo(titulo);
                if(libros6.equals(null)){
                    throw new Exception("NO EXISTE NINGUN LIBRO CON ESE NOMBRE");
                }else{
                    libroService.imprimirLibros(libros6);
                }
                break;
            case 7: 

                break;
            case 8:

                break;
            case 9: 

                break;
            case 10:

                break;
            case 11:
                List<Editorial> editoriales = editorialService.obtenerEditoriales();
                editorialService.imprimirEditoriales(editoriales);
                break;
            case 12:
                List<Autor> autores12 = autorService.obtenerAutores();
                autorService.imprimirAutores(autores12);
                break;
            case 13:
                List<Libro> libros13 = libroService.obtenerLibros();
                libroService.imprimirLibros(libros13);
                
                break;
            case 14:
                System.out.println("**************************************************************************************");
                System.out.println("*****************************   SESION FINALIZADA   **********************************");
                System.out.println("**************************************************************************************");
                break;
            default: 
                System.out.println("La opcion seleccionada no es valida");
            }
            }while (respuesta != salida);
        } catch (MiExcepcion e) {
            leer.nextLine();
            System.out.println(e.getMessage());
        }       
      
    }
}


