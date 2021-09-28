package jpa.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import jpa.entidades.Autor;
import jpa.excepcion.MiExcepcion;
import jpa.persistencia.AutorDAO;

public class AutorService {
    private AutorDAO autorDAO;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public AutorService(){
        autorDAO = new AutorDAO();
    }
    
    public Autor crearAutor()throws MiExcepcion{
        Autor autor = new Autor();
        Long id;
        try{
           do{
            id = Long.parseLong(generarIdAutor());
            } while (autorDAO.buscarAutorPorIdDeAutor(id) != null);
        
        System.out.println("INGRESE EL NOMBRE DEL AUTOR");
        String nombre = leer.next();
        if(nombre==null){
            return null;
        }
        autor.setId(id);
        autor.setNombre(nombre);
        autor.setAlta(true);
        autorDAO.guardarAutor(autor);
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN INTRODUCIR AL AUTOR");
 
        }
        
        return autor;
    }
    
    public static String generarIdAutor() {
        return UUID.randomUUID().toString()
                .replaceAll("[^0-9]", "")
                .substring(0, 13);
    }
    
    public Autor buscarAutorPorNombre(String nombreAutor) throws MiExcepcion{
        List<Autor> autores = new ArrayList();
        Autor autor;
        try{
           autores = autorDAO.buscarAutorPorSuNombre(nombreAutor);
           
           if(autores.isEmpty()){
               return null;
           }else{
               imprimirAutores(autores);
               System.out.println("INGRESE EL ID DEL AUTOR");
               Long id = leer.nextLong();
               autor = buscarAutorPorID(id);
               if(autor == null){
                  throw new Exception("ERROR EN INTRODUCIR AL AUTOR LUEGO DE BUSCARLO POR CODIGO");
               }
           }
           
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN INTRODUCIR AL AUTOR");
 
        }    
        return autor;
        
    }
    
    public List<Autor> obtenerAutores()throws MiExcepcion{
        List<Autor> autores = new ArrayList();
        autores = autorDAO.obtenerTodosLosAutores();
  
        return autores;
    }
    
    public void imprimirAutores(List<Autor> autores) throws MiExcepcion {
        try {
            

            if (autores.isEmpty()) {
                System.out.println("NO EXISTEN AUTORES");
            } else {
                System.out.println(" ");
                System.out.println("********************************************************************");
                System.out.println("************************      AUTORES     **************************");
                System.out.println("********************************************************************");
                System.out.printf("%-25s%-30s%-25s\n", "ID AUTOR", "NOMBRE AUTOR", "ALTA");
                for (int i = 0; i < autores.size(); i++) {
                    System.out.printf("%-25d%-30s%-25b\n", autores.get(i).getId(), autores.get(i).getNombre(), autores.get(i).getAlta());
                }
                System.out.println("********************************************************************");
                System.out.println("********************************************************************");
                System.out.println(" ");
            }
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN INTRODUCIR AL AUTOR");
        }  
    }
    
    
    public Autor buscarAutorPorID(Long id)throws MiExcepcion{
        Autor autor = null;
        try{
           
            autor = autorDAO.buscarAutorPorIdDeAutor(id); 
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN INTRODUCIR AL AUTOR");
        }  
        
        return autor;
    }
    
}
