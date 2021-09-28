package jdbc.servicio;

import java.util.Date;
import java.util.List;
import jdbc.entidad.Estancias;
import jdbc.excepcion.MiExcepcion;
import jdbc.persistencia.EstanciasDAO;

public class EstanciasService {
    private EstanciasDAO estanciasDAO;

    public EstanciasService() {
        estanciasDAO = new EstanciasDAO();
    }
    
    public void imprimirEstancias()throws MiExcepcion{
        System.out.println("");
        System.out.println("");
        try {
            List<Estancias> estancias = estanciasDAO.obtenerEstancias();
            

            if (estancias.isEmpty()) {
                throw new MiExcepcion("No existen estancias");
            } else {
                System.out.println("**************************************************************************************************************");
                System.out.println("******************************************   LISTA DE ESTANCIAS    *******************************************");
                System.out.println("**************************************************************************************************************");
                System.out.println("");
                System.out.printf("%-15s%-15s%-15s%-30s%-20s%-20s\n", "ID ESTANCIA", "ID CLIENTE", "ID CASA", "NOMBRE DEL HUESPED", "FECHA INICIO", "FECHA FIN");
                estancias.forEach(estancia -> System.out.printf("%-15d%-15d%-15d%-30s%-20tD%-20tD\n", estancia.getIdEstancia(), estancia.getIdCliente(), estancia.getIdCasa(), estancia.getNombreHuesped(), estancia.getFechaDesde(), estancia.getFechaHasta()));
                System.out.println();
            }
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
        System.out.println("**************************************************************************************************************");
        System.out.println("**************************************************************************************************************");
        System.out.println("");
        System.out.println("");
        
    }
    
    public void crearEstancia(Integer idEstancia, Integer idCliente, Integer idCasa, String nombreCliente, Date fechaEntrada, Date fechaSalida) throws MiExcepcion{
        try {
            
            if (idEstancia == null) {
                throw new MiExcepcion("El id de la estancia es obligatorio");
            }

            if(idCliente == null){
                throw new MiExcepcion("El id del cliente es obligatorio");
            }
       
            if(idCasa == null){
                throw new MiExcepcion("El id de la casa es obligatorio");
            }

            if (nombreCliente == null || nombreCliente.trim().isEmpty()) {
                throw new MiExcepcion("El nombre es obligatorio");
            }
            
            if(fechaEntrada == null){
                throw new MiExcepcion("La fecha de entrada es obligatoria");
            }
       
            if(fechaSalida == null){
                throw new MiExcepcion("La facha de salida es obligatoria");
            }

            Estancias estancia = new Estancias();

            estancia.setIdEstancia(idEstancia);
            estancia.setIdCliente(idCliente);
            estancia.setIdCasa(idCasa);
            estancia.setNombreHuesped(nombreCliente);
            estancia.setFechaDesde(fechaEntrada);
            estancia.setFechaHasta(fechaSalida);

            estanciasDAO.ingresarEstancia(estancia);
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }
    
    public Boolean comprobarSiExiste(Integer opcion, Integer id) throws MiExcepcion{
        try{
        switch(opcion){
            case 2:
                return estanciasDAO.verSiExisteCliente(id);
            default:
                return estanciasDAO.verSiExisteCasa(id);
        }
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }
    
    public String obtenerNombreDeCliente(Integer idCliente) throws MiExcepcion{
        return estanciasDAO.obtenerNombre(idCliente);
    }
    
    public Integer obtenerProximoIdEstancia() throws MiExcepcion{
        return estanciasDAO.obtenerProximaEstancia();
    }
    
    public Boolean fechasValidas(Date fechaEntrada, Date fechaSalida, Integer idCasa) throws MiExcepcion{
        
        int diasDeEstadia = (int) ((fechaSalida.getTime() - fechaEntrada.getTime()) / 86400000);
        
        return estanciasDAO.validarFechasDeReserva(fechaEntrada, fechaSalida, diasDeEstadia, idCasa);
            
    }

}
    
    

