package jdbc.servicio;

import java.util.List;
import jdbc.entidad.Casas;
import jdbc.excepcion.MiExcepcion;
import jdbc.persistencia.CasasDAO;


public class CasasService {
    private CasasDAO casaDAO;

    public CasasService() {
        casaDAO = new CasasDAO();
    }
    
    
    public void casasDisponiblesEnReinoUnido() throws MiExcepcion{
        System.out.println("");
        System.out.println("");
        try {
            List<Casas> casas = casaDAO.obtenerCasasDisponibles();
            

            if (casas.isEmpty()) {
                throw new MiExcepcion("No existen casas");
            } else {
                System.out.println("***************************************************************************************************************************************************************************************");
                System.out.println("************************************************************************************   LISTA DE CASAS    ******************************************************************************");
                System.out.println("***************************************************************************************************************************************************************************************");
                System.out.println();
                System.out.printf("%-10s%-17s%-10s%-10s%-15s%-17s%-15s%-15s%-18s%-18s%-23s%-15s\n", "ID CASA", "CALLE DE CASA", "NUMERO", "C.P", "CIUDAD", "PAIS", "FECHA DESDE", "FECHA HASTA", "TIEMPO MINIMO", "TIEMPO MAXIMO", "PRECIO HABITACION", "TIPO DE CASA");
                casas.forEach(casa -> System.out.printf("%-10d%-17s%-10d%-10s%-15s%-17s%-15tD%-15tD%-18d%-18d%-23f%-15s\n", casa.getIdCasa(), casa.getCalle(), casa.getNumeroCasa(), casa.getCodigoPostal(), casa.getCiudad(), casa.getPais(), casa.getFechaDesde(), casa.getFechaHasta(), casa.getTiempoMinimo(), casa.getTiempoMaximo(), casa.getPrecioHabitacion(), casa.getTipoDeCasa()));
                System.out.println();
            }
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
        System.out.println("***************************************************************************************************************************************************************************************");
        System.out.println("***************************************************************************************************************************************************************************************");
        System.out.println("");
        System.out.println("");
    }
    
    public void imprimirCasasConPreciosActualizados() throws MiExcepcion{
        System.out.println("");
        System.out.println("");
        try {
            List<Casas> casas = casaDAO.obtenerCasasConPreciosActualizados();
            

            if (casas.isEmpty()) {
                throw new MiExcepcion("No existen casas");
            } else {
                System.out.println("***************************************************************************************************************************************************************************************");
                System.out.println("************************************************************************************   LISTA DE CASAS    ******************************************************************************");
                System.out.println("***************************************************************************************************************************************************************************************");
                System.out.println();
                System.out.printf("%-10s%-17s%-10s%-10s%-15s%-17s%-15s%-15s%-18s%-18s%-23s%-15s\n", "ID CASA", "CALLE DE CASA", "NUMERO", "C.P", "CIUDAD", "PAIS", "FECHA DESDE", "FECHA HASTA", "TIEMPO MINIMO", "TIEMPO MAXIMO", "PRECIO HABITACION", "TIPO DE CASA");
                casas.forEach(casa -> System.out.printf("%-10d%-17s%-10d%-10s%-15s%-17s%-15tD%-15tD%-18d%-18d%-23f%-15s\n", casa.getIdCasa(), casa.getCalle(), casa.getNumeroCasa(), casa.getCodigoPostal(), casa.getCiudad(), casa.getPais(), casa.getFechaDesde(), casa.getFechaHasta(), casa.getTiempoMinimo(), casa.getTiempoMaximo(), casa.getPrecioHabitacion()*1.05, casa.getTipoDeCasa()));
                System.out.println();
            }
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
        System.out.println("***************************************************************************************************************************************************************************************");
        System.out.println("***************************************************************************************************************************************************************************************");
        System.out.println("");
        System.out.println("");
    
    }
    
    public void imprimirCasasPorPais() throws MiExcepcion{
        System.out.println("");
        System.out.println("");
        try {
            List<Casas> casas = casaDAO.obtenerCasasPorPais();
            

            if (casas.isEmpty()) {
                throw new MiExcepcion("No existen casas");
            } else {
                System.out.println("*******************************************************");
                System.out.println("***************   LISTA DE CASAS    *******************");
                System.out.println("*******************************************************");
                System.out.println();
                System.out.printf("%-25s%-25s\n", "CANTIDAD DE CASAS", "PAIS");
                casas.forEach(casa -> System.out.printf("%-25d%-25s\n", casa.getIdCasa(), casa.getPais()));
                System.out.println();
            }
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        System.out.println("");
        System.out.println("");
    }
    
    public void imprimirCasasConComentariosPositivos() throws MiExcepcion{
        System.out.println("");
        System.out.println("");
        try {
            List<Casas> casas = casaDAO.obtenerCasasConComentariosPositivos();
            

            if (casas.isEmpty()) {
                throw new MiExcepcion("No existen casas");
            } else {
                System.out.println("***************************************************************************************************************************************************************************************");
                System.out.println("************************************************************************************   LISTA DE CASAS    ******************************************************************************");
                System.out.println("***************************************************************************************************************************************************************************************");
                System.out.println();
                System.out.printf("%-10s%-17s%-10s%-10s%-15s%-17s%-15s%-15s%-18s%-18s%-23s%-15s\n", "ID CASA", "CALLE DE CASA", "NUMERO", "C.P", "CIUDAD", "PAIS", "FECHA DESDE", "FECHA HASTA", "TIEMPO MINIMO", "TIEMPO MAXIMO", "PRECIO HABITACION", "TIPO DE CASA");
                casas.forEach(casa -> System.out.printf("%-10d%-17s%-10d%-10s%-15s%-17s%-15tD%-15tD%-18d%-18d%-23f%-15s\n", casa.getIdCasa(), casa.getCalle(), casa.getNumeroCasa(), casa.getCodigoPostal(), casa.getCiudad(), casa.getPais(), casa.getFechaDesde(), casa.getFechaHasta(), casa.getTiempoMinimo(), casa.getTiempoMaximo(), casa.getPrecioHabitacion(), casa.getTipoDeCasa()));
                System.out.println();
            }
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
        System.out.println("***************************************************************************************************************************************************************************************");
        System.out.println("***************************************************************************************************************************************************************************************");
        System.out.println("");
        System.out.println("");
    }
}
