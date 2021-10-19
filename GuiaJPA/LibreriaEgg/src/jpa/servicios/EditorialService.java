package jpa.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import jpa.entidades.Editorial;
import jpa.excepcion.MiExcepcion;
import jpa.persistencia.EditorialDAO;


public class EditorialService {
    private EditorialDAO editorialDAO;

  
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public EditorialService() {
        editorialDAO = new EditorialDAO();
        
    }
    
    public Editorial crearEditorial()throws MiExcepcion{
        Editorial editorial = new Editorial();
        Long id;
        try{
           do{
            id = Long.parseLong(generarID());
            } while (editorialDAO.buscarEditorialPorID(id) != null);
        
        System.out.println("INGRESE EL NOMBRE DE LA EDITORIAL");
        String nombre = leer.next();
        if(nombre == null){
            return null;
        }
        editorial.setId(id);
        editorial.setNombre(nombre);
        editorial.setAlta(true);
        editorialDAO.guardarEditorial(editorial);
        
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN INTRODUCIR LA EDITORIAL");
 
        }
        
        return editorial;
    }
    
    public static String generarID() {
        return UUID.randomUUID().toString()
                .replaceAll("[^0-9]", "")
                .substring(0, 13);
    }
    public Editorial buscarEditorialPorNombre(String nombreEditorial) throws MiExcepcion{
        List<Editorial> editoriales = new ArrayList();
        Editorial editorial;
        try{
           editoriales = editorialDAO.buscarEditorialPorNombreDeEditorial(nombreEditorial);
           
           if(editoriales.isEmpty()){
               System.out.println("NO HAY EDITORIALES CON ESE NOMBRE");
               System.out.println("DESEA INGRESAR UNA EDITORIAL NUEVA? S/N");
               Character opcion = leer.next().charAt(0);
               if(opcion == 's'){
                   editorial = crearEditorial();
                   editoriales.add(editorial);
                   if(editorial == null){
                       throw new Exception("ERROR EN INTRODUCIR LA EDITORIAL LUEGO DE INTENTAR CREARLA");
                   }
               }else{
                   throw new Exception("LA EDITORIAL ES OBLIGATORIA");
               }
           }else{
               imprimirEditoriales(editoriales);
               System.out.println("INGRESE EL ID DE LA EDITORIAL");
               Long id = leer.nextLong();
               editorial = buscarEditorialPorID(id);
               if(editorial == null){
                  throw new Exception("ERROR EN INTRODUCIR LA EDITORIAL LUEGO DE BUSCARLA POR CODIGO");
               }
           }
           
        return editorial;   
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN INTRODUCIR LA EDITORIAL"); 
        }    
   
    }
    
    public void imprimirEditoriales(List<Editorial> editoriales) throws MiExcepcion {
        try {

            if (editoriales.isEmpty()) {
                System.out.println("NO EXISTEN EDITORIALES");
            } else {
                    System.out.println(" ");
                    System.out.println("********************************************************************");
                    System.out.println("**********************      EDITORIALES     ************************");
                    System.out.println("********************************************************************");
                    System.out.printf("%-25s%-30s%-25s\n", "ID EDITORIAL", "NOMBRE EDITORIAL", "ALTA");
                for (int i = 0; i < editoriales.size(); i++) {                
                    System.out.printf("%-25d%-30s%-25b\n", editoriales.get(i).getId(), editoriales.get(i).getNombre(), editoriales.get(i).getAlta());                 
                }
                
                System.out.println("********************************************************************");
                System.out.println("********************************************************************");
            }
                    
                    System.out.println(" ");
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN IMPRIMIR LAS EDITORIALES");
        }
    }
    
    
    public Editorial buscarEditorialPorID(Long id)throws MiExcepcion{
        Editorial editorial = null;
        try{
           
            editorial = editorialDAO.buscarEditorialPorID(id); 
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN INTRODUCIR LA EDITORIAL");
        }  
        
        return editorial;
    }
    
    public List<Editorial> obtenerEditoriales() throws MiExcepcion{
        try{
        List<Editorial> editoriales = new ArrayList();
        editoriales = editorialDAO.obtenerTodasLasEditoriales();
  
        return editoriales;
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN OBTENER EDITORIALES");
        }
    }
    
    public void modificarEditorial()throws MiExcepcion{
        try{
        List<Editorial> editoriales = obtenerEditoriales();
        imprimirEditoriales(editoriales);
        System.out.println("INTRODUZCA ID DE LA EDITORIAL A MODIFICAR");
        Integer id = leer.nextInt();
        Long idEditorial = id.longValue();
        Editorial editorial = editorialDAO.buscarEditorialPorID(idEditorial);
        if(editorial== null){
            throw new MiExcepcion("NO HAY EDITORIAL CON ESE ID");
        }else{
            System.out.println("INGRESE EL NUEVO NOMBRE DE LA EDITORIAL");
            String nuevoNombre = leer.next();                       
            editorial.setNombre(nuevoNombre);
            editorialDAO.modificarEditorial(editorial);
        }
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR AL MODIFICAR EDITORIAL");
        }
    }
    
    public List<Editorial> buscarEditoriales(String nombreEditorial)throws MiExcepcion{
        try{
        List<Editorial> editoriales = editorialDAO.buscarEditorialPorNombreDeEditorial(nombreEditorial);
           
        return editoriales;   
        }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN BUSCAR LA EDITORIAL"); 
        }            
        
    }
    
    public void eliminarEditorial()throws MiExcepcion{
        try{
            Editorial editorial;
            List<Editorial> editoriales = obtenerEditoriales();
            imprimirEditoriales(editoriales);
            System.out.println("INTRUDUZCA ID DE EDITORIAL A ELIMINAR");
            Long id = leer.nextLong();
            editorial = editorialDAO.buscarEditorialPorID(id);
            if(editorial==null){
                System.out.println("NO EXISTE EDITORIAL CON ESE ID");
            }else{
                editorial.setAlta(false);
                editorialDAO.modificarEditorial(editorial);
                
            }
            
        }catch (Exception e) {
            throw new MiExcepcion("ERROR EN BUSCAR LA EDITORIAL"); 
        }
    }
}
