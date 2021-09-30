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
        int salida = 4;
        
        try{
            do{
                System.out.println("************************************************************");
                System.out.println("**********      ¡BIENVENIDO A LA BIBLIOTECA!      **********");
                System.out.println("************************************************************");
                System.out.println("************       SELECCIONE UNA OPCION       *************");
                System.out.println("***              (1)    MENU AUTOR                       ***");
                System.out.println("***              (2)    MENU LIBRO                       ***");
                System.out.println("***              (3)   MENU EDITORIAL                    ***");
                System.out.println("***              (4)      SALIR                          ***");
                System.out.println("************************************************************");
                System.out.println("************************************************************");
                respuesta = leer.nextInt();
                
                switch(respuesta){
                    case 1: 
                        menuAutor();
                    break;
                    case 2:
                        menuLibro();
                    break;
                    case 3:
                        menuEditorial();
                        break;
                    case 4:
                        System.out.println("************************************************************");
                        System.out.println("******************   SESION FINALIZADA   *******************");
                        System.out.println("************************************************************");
                        break;
                    default:
                        System.out.println("************************************************************");
                        System.out.println("******     LA OPCION SELECCIONADA NO ES VALIDA      ********");
                        System.out.println("************************************************************");
                    
                }

            }while(respuesta != salida);
            }catch (MiExcepcion e){
            leer.nextLine();
            System.out.println(e.getMessage());
        }
    }
            
    public int menuAutor()throws MiExcepcion{
        int respuestaAutor = 0;
        int salidaAutor = 6;
        try{
            do{
                System.out.println("************************************************************");
                System.out.println("******************     ¡MENU AUTOR!      *******************");
                System.out.println("************************************************************");
                System.out.println("************       SELECCIONE UNA OPCION       *************");
                System.out.println("***             (1)    INGRESAR AUTOR                    ***");
                System.out.println("***             (2)    MODIFICAR AUTOR                   ***");
                System.out.println("***             (3)   IMPRIMIR AUTORES                   ***");
                System.out.println("***             (4) BUSCAR AUTOR POR NOMBRE              ***");
                System.out.println("***             (5)    ELIMINAR AUTOR                    ***");
                System.out.println("***             (6)        SALIR                         ***");
                System.out.println("************************************************************");
                System.out.println("************************************************************");
                respuestaAutor = leer.nextInt();
                
                switch(respuestaAutor){
                    case 1: 
                        autorService.crearAutor();
                    break;
                    case 2:

                    break;
                    case 3:
                        List<Autor> autores12 = autorService.obtenerAutores();
                        autorService.imprimirAutores(autores12);
                        break;
                    case 4:
                        List<Autor> autores = new ArrayList();
                        System.out.println("INGRESE EL NOMBRE DEL AUTOR A BUSCAR");
                        String nombre = leer.next();
                        autorService.buscarAutorPorNombre(nombre);
                        break;
                    case 5:

                        break;
                    case 6:
                        System.out.println("************************************************************");
                        System.out.println("********************   CERRANDO MENU   *********************");
                        System.out.println("************************************************************");
                        System.out.println("");
                        break;
                    default:
                        System.out.println("************************************************************");
                        System.out.println("******     LA OPCION SELECCIONADA NO ES VALIDA      ********");
                        System.out.println("************************************************************");
                    
                }
            }while(respuestaAutor != salidaAutor);
            }catch (MiExcepcion e){
            leer.nextLine();
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    public void menuLibro()throws MiExcepcion, Exception{
        int respuestaLibro = 0;
        int salidaLibro = 9;
        try{
            do{
                System.out.println("************************************************************");
                System.out.println("******************     ¡MENU LIBRO!      *******************");
                System.out.println("************************************************************");
                System.out.println("************       SELECCIONE UNA OPCION       *************");
                System.out.println("***            (1)     INGRESAR LIBRO                    ***");
                System.out.println("***            (2)     MODIFICAR LIBRO                   ***");
                System.out.println("***            (3)     IMPRIMIR LIBROS                   ***");
                System.out.println("***            (4)   BUSCAR LIBRO POR ISBN               ***");
                System.out.println("***            (5)   BUSCAR LIBRO POR AUTOR              ***");
                System.out.println("***            (6) BUSCAR LIBRO POR EDITORIAL            ***");
                System.out.println("***            (7)  BUSCAR LIBRO POR TITULO              ***");
                System.out.println("***            (8)     ELIMINAR LIBRO                    ***");
                System.out.println("***            (9)         SALIR                         ***");
                System.out.println("************************************************************");
                System.out.println("************************************************************");
                respuestaLibro = leer.nextInt();
                
                switch(respuestaLibro){
                    case 1: 
                        libroService.insertarLibro();
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        List<Libro> libros13 = libroService.obtenerLibros();
                        libroService.imprimirLibros(libros13);
                        break;
                    case 4:
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
                    case 5:
                        System.out.println("INGRESE EL NOMBRE DEL AUTOR PARA BUSCAR EL LIBRO");
                        String nombre = leer.next();
                        List<Libro> libros7 = libroService.obtenerLibroPorNombreDeAutor(nombre);
                        libroService.imprimirLibros(libros7);
                        break;
                    case 6:

                        break;
                    case 7:
                        System.out.println("INGRESE EL TITULO DEL LIBRO A BUSCAR");
                        String titulo = leer.next();
                        List<Libro> libros6 = libroService.obtenerLibrosPorTitulo(titulo);
                        if(libros6.equals(null)){
                            throw new Exception("NO EXISTE NINGUN LIBRO CON ESE NOMBRE");
                        }else{
                            libroService.imprimirLibros(libros6);
                        }
                        break;
                    case 8:
                        
                        break;    
                    case 9:
                        System.out.println("************************************************************");
                        System.out.println("********************   CERRANDO MENU   *********************");
                        System.out.println("************************************************************");
                        System.out.println("");
                        break;
                    default:
                        System.out.println("************************************************************");
                        System.out.println("******     LA OPCION SELECCIONADA NO ES VALIDA      ********");
                        System.out.println("************************************************************");
                    
                }

            }while(respuestaLibro != salidaLibro);
            }catch (MiExcepcion e){
            leer.nextLine();
            System.out.println(e.getMessage());
        }  
    }
    
    public void menuEditorial()throws MiExcepcion{
        int respuestaEditorial = 0;
        int salidaEditorial = 6;
        try{
            do{
                System.out.println("************************************************************");
                System.out.println("****************     ¡MENU EDITORIAL!      *****************");
                System.out.println("************************************************************");
                System.out.println("************       SELECCIONE UNA OPCION       *************");
                System.out.println("***          (1)     INGRESAR EDITORIAL                  ***");
                System.out.println("***          (2)     MODIFICAR EDITORIAL                 ***");
                System.out.println("***          (3)    IMPRIMIR EDITORIALES                 ***");
                System.out.println("***          (4) BUSCAR EDITORIAL POR NOMBRE             ***");
                System.out.println("***          (5)     ELIMINAR EDITORIAL                  ***");
                System.out.println("***          (6)           SALIR                         ***");
                System.out.println("************************************************************");
                System.out.println("************************************************************");
                respuestaEditorial = leer.nextInt();
                
                switch(respuestaEditorial){
                    case 1: 
                        editorialService.crearEditorial();
                    break;
                    case 2:
                        
                    break;
                    case 3:
                        List<Editorial> editoriales = editorialService.obtenerEditoriales();
                        editorialService.imprimirEditoriales(editoriales);
                        break;
                    case 4:

                        break;
                    case 5:
                        
                        break;
                    case 6:
                        System.out.println("************************************************************");
                        System.out.println("********************   CERRANDO MENU   *********************");
                        System.out.println("************************************************************");
                        System.out.println("");
                        break;
                    default:
                        System.out.println("************************************************************");
                        System.out.println("******     LA OPCION SELECCIONADA NO ES VALIDA      ********");
                        System.out.println("************************************************************");
                    
                }

            }while(respuestaEditorial != salidaEditorial);
            }catch (MiExcepcion e){
            leer.nextLine();
            System.out.println(e.getMessage());
        }  
    }
}



