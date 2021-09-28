package jdbc.servicio;

import java.util.List;
import jdbc.entidad.Familias;
import jdbc.excepcion.MiExcepcion;
import jdbc.persistencia.FamiliasDAO;

public class FamiliasService {
    private FamiliasDAO familiaDAO;

    public FamiliasService() {
        familiaDAO = new FamiliasDAO();
    }
    
    public void imprimirFamiliasDeAlMenosTresHijos()throws MiExcepcion{
        System.out.println("");
        System.out.println("");
        try {
            List<Familias> familias = familiaDAO.obtenerFamiliasDeAlMenosTresHijos();
            

            if (familias.isEmpty()) {
                throw new MiExcepcion("No existen familias");
            } else {
                System.out.println("********************************************************************************************************************");
                System.out.println("*******************************************   LISTA DE FAMILIAS   **************************************************");
                System.out.println("********************************************************************************************************************");
                System.out.println();
                System.out.printf("%-10s%-15s%-20s%-20s%-10s%-30s%-8s\n", "ID", "NOMBRE", "EDAD MINIMA", "EDAD MAXIMA", "HIJOS", "EMAIL", "ID CASA");
                familias.forEach(familia -> System.out.printf("%-10d%-15s%-20d%-20d%-10d%-30s%-8d\n", familia.getIdFamilia(), familia.getNombre(), familia.getEdadMinima(), familia.getEdadMaxima(), familia.getNumeroHijos(), familia.getEmail(), familia.getIdCasaFamilia()));
                System.out.println();
            }
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
        System.out.println("********************************************************************************************************************");
        System.out.println("********************************************************************************************************************");
        System.out.println("");
        System.out.println("");
        
    }
    
    public void imprimirFamiliasConHotmail() throws MiExcepcion{
        System.out.println("");
        System.out.println("");
        try {
            List<Familias> familias = familiaDAO.obtenerFamiliasConHotmail();
            

            if (familias.isEmpty()) {
                throw new MiExcepcion("No existen familias");
            } else {
                System.out.println("********************************************************************************************************************");
                System.out.println("*******************************************   LISTA DE FAMILIAS   **************************************************");
                System.out.println("********************************************************************************************************************");
                System.out.println();
                System.out.printf("%-10s%-15s%-20s%-20s%-10s%-30s%-8s\n", "ID", "NOMBRE", "EDAD MINIMA", "EDAD MAXIMA", "HIJOS", "EMAIL", "ID CASA");
                familias.forEach(familia -> System.out.printf("%-10d%-15s%-20d%-20d%-10d%-30s%-8d\n", familia.getIdFamilia(), familia.getNombre(), familia.getEdadMinima(), familia.getEdadMaxima(), familia.getNumeroHijos(), familia.getEmail(), familia.getIdCasaFamilia()));
                System.out.println();
            }
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
        System.out.println("********************************************************************************************************************");
        System.out.println("********************************************************************************************************************");
        System.out.println("");
        System.out.println("");
        
    }
}
