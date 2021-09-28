package jdbc.menu;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import jdbc.excepcion.MiExcepcion;
import jdbc.servicio.CasasService;
import jdbc.servicio.ClientesService;
import jdbc.servicio.ComentariosService;
import jdbc.servicio.EstanciasService;
import jdbc.servicio.FamiliasService;


public class MenuEstancias {
    private Scanner leer;
    private CasasService casaService;
    private ClientesService clienteService;
    private ComentariosService comentarioService;
    private EstanciasService estanciaService;
    private FamiliasService familiaService;
    private int seleccion;
    private int salida;

    public MenuEstancias() {
        leer = new Scanner(System.in).useDelimiter("\n");
        casaService = new CasasService();
        clienteService = new ClientesService();
        comentarioService = new ComentariosService();
        estanciaService = new EstanciasService();
        familiaService = new FamiliasService();
        seleccion = 0;
        salida = 11;
    }
    
    public void interfaz() throws MiExcepcion{
        do{
            try{
                
            
        System.out.println("****************************************************************************************************");
        System.out.println("***********************      ¡BIENVENIDO A LA APLICACION DE ESTANCIAS!      ************************");
        System.out.println("****************************************************************************************************");
        System.out.println("*******************************       SELECCIONE UNA OPCION       **********************************");
        System.out.println("****************************************************************************************************");
        System.out.println("** 1)Listar familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años             *");
        System.out.println("** 2)Listar las casas disponibles entre el 01/08/2020 y el 31/08/2020 en Reino Unido               *");
        System.out.println("** 3)Listar todas aquellas familias cuya dirección de mail sea de Hotmail                          *");
        System.out.println("** 4)Listar aquellas casas disponibles a partir de una fecha dada y un número de días específico   *");
        System.out.println("** 5)Listar todos los clientes que en algún momento realizaron una estancia y los datos de la casa *");
        System.out.println("** 6)Listar todas las estancias que han sido reservadas por un cliente                             *");
        System.out.println("** 7)Mostrar las casas del reino unido con sus precios actualizados por inflacion                  *");
        System.out.println("** 8)Listar la cantidad de casas que hay en los diferentes paises                                  *");
        System.out.println("** 9)Listar las casas del Reino Unido en las cuales digan que son limpias en sus comentarios       *");
        System.out.println("** 10)Insertar nueva estancia                                                                      *");
        System.out.println("** 11)Salir                                                                                        *");
        System.out.println("****************************************************************************************************");
        System.out.println("****************************************************************************************************");
        seleccion = leer.nextInt();
        
        switch(seleccion){
            case 1:
                familiaService.imprimirFamiliasDeAlMenosTresHijos();
                break;
            case 2:
                casaService.casasDisponiblesEnReinoUnido();
                break;
            case 3:
                familiaService.imprimirFamiliasConHotmail();
                break;
            case 4:
                pedirFechasYDiasEspecificos();
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7: 
                casaService.imprimirCasasConPreciosActualizados();
                break;
            case 8:
                casaService.imprimirCasasPorPais();
                break;
            case 9: 
                casaService.imprimirCasasConComentariosPositivos();
                break;
            case 10:
                ingresarEstancia();
                estanciaService.imprimirEstancias();
                break;
            case 11:
                System.out.println("****************************************************************************************************");
                System.out.println("************************************   SESION FINALIZADA   *****************************************");
                System.out.println("****************************************************************************************************");
                break;
            default: 
                System.out.println("La opcion seleccionada no es valida");
            }
        } catch (InputMismatchException e) {
            System.out.println("No se admiten caracteres");
            leer.next();
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }       
        }while (seleccion != salida);
 
    }

    private void ingresarEstancia() throws MiExcepcion{
        try {
            Integer validarCliente = 2;
            Integer validarCasa = 3;
            String nombreCliente;
            
            Integer idEstancia = estanciaService.obtenerProximoIdEstancia() + 1;

            System.out.println("Ingrese su id de cliente");
            Integer idCliente = leer.nextInt();
            
            if(estanciaService.comprobarSiExiste(validarCliente, idCliente)){
                nombreCliente = estanciaService.obtenerNombreDeCliente(idCliente);
 
            }else{
                System.out.println("Ingrese su nombre ");
                nombreCliente = leer.next();
            }

            System.out.println("Ingrese el id de la casa a alquilar ");
            Integer idCasa = leer.nextInt();
            
            if(!estanciaService.comprobarSiExiste(validarCasa, idCasa)){
                throw new MiExcepcion("La casa no existe");
            }
            
            System.out.println("Ingrese la fecha de entrada DD/MM/YYYY");
            String fechaEntradaAConvertir = leer.next();
            Date fechaEntrada = convertirFecha(fechaEntradaAConvertir);
            
            System.out.println("Ingrese la fecha de salida DD/MM/YYYY");
            String fechaSalidaAConvertir = leer.next();
            Date fechaSalida = convertirFecha(fechaSalidaAConvertir);
            
            if(!estanciaService.fechasValidas(fechaEntrada, fechaSalida, idCasa)){
                throw new MiExcepcion("No se puede reservar en ese rango de fechas");
            }

            estanciaService.crearEstancia(idEstancia, idCliente, idCasa, nombreCliente, fechaEntrada, fechaSalida);
        
        }catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }
    
    public Date convertirFecha(String fecha){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date testDate = null;
        String date = fecha;
        try{
            testDate = df.parse(date);
        } catch (Exception e){ System.out.println("invalid format");}
        return testDate;
    }
    
    public void pedirFechasYDiasEspecificos()throws MiExcepcion{
       try {
            System.out.println("Ingrese la fecha de consulta DD/MM/YYYY");
            String fechaAConvertir = leer.next();
            Date fechaEntrada = convertirFechaSQL(fechaAConvertir);
            
            System.out.println("Ingrese cantidad de dias para ver disponibilidad");
            Integer dias = leer.nextInt();
            
            //VER ESTO DE COMO SUMAR LOS DIAS A LA FECHA DE ENTRADA
            Instant instant = fechaEntrada.toInstant();
            Instant fechaSalida = instant.plus(dias, ChronoUnit.DAYS);
            System.out.println("FECHA ENTRADA:::> "+fechaEntrada);
            System.out.println("DIASSSS::> "+dias);
            System.out.println("FECHA SALIDAA::>"+fechaSalida);            

        }catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } 
    }
    
    public Date convertirFechaSQL(String fechaAConvertir)throws MiExcepcion{
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date testDate = null;
        java.sql.Date fecha = null;
        String date = fechaAConvertir;
        try{
            testDate = df.parse(date);
            fecha = new java.sql.Date(testDate.getTime());
        } catch (Exception e){ 
            System.out.println("invalid format");
        }
        return fecha;
    }
        
        
}
