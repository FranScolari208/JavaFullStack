package jdbc.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jdbc.entidad.Casas;
import jdbc.entidad.Estancias;
import jdbc.excepcion.MiExcepcion;

public class EstanciasDAO extends DAO {
    
    public List<Estancias> obtenerEstancias() throws MiExcepcion{
        try {
            String sql = "SELECT * FROM estancias";

            consultarBase(sql);

            List<Estancias> estancias = new ArrayList<>();
            Estancias estancia = null;

            while (resultado.next()) {
                estancia = new Estancias();
                estancia.setIdEstancia(resultado.getInt(1));
                estancia.setIdCliente(resultado.getInt(2));
                estancia.setIdCasa(resultado.getInt(3));
                estancia.setNombreHuesped(resultado.getString(4));
                estancia.setFechaDesde(resultado.getDate(5));
                estancia.setFechaHasta(resultado.getDate(6));

   
                estancias.add(estancia);
            }

            return estancias;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener nombres de las estancias");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public void ingresarEstancia(Estancias estancia) throws MiExcepcion{
        try {
            if (estancia == null) {
                throw new MiExcepcion("La estancia marco error");
            }
            
            Date fecha1 = convertirFechas(estancia.getFechaDesde());
            Date fecha2 = convertirFechas(estancia.getFechaHasta());
                    
            
            String plantilla = "INSERT INTO estancias(id_estancia, id_cliente, id_casa, nombre_huesped, fecha_desde, fecha_hasta) "
                    + "VALUES(%d, %d, %d, '%s', '" + fecha1 + "', '"+fecha2+"' )";

            String sql = String.format(plantilla, estancia.getIdEstancia(), estancia.getIdCliente(), estancia.getIdCasa(), estancia.getNombreHuesped());

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new MiExcepcion("Error al guardar producto");
        }
    }
    
    public Date convertirFechas(Date fecha){  
        java.sql.Date date = new java.sql.Date(fecha.getTime());
        return date;
    }

    public Boolean verSiExisteCliente(Integer id)throws MiExcepcion{
        try {
            String sql = "SELECT * FROM clientes WHERE id_cliente = "+id;

            consultarBase(sql);
            
            Integer contador = 0;
            while (resultado.next()) {
                contador = contador + 1;
            }
            return contador>0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error en existencia de cliente");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public Boolean verSiExisteCasa(Integer id)throws MiExcepcion{
        try {
            String sql = "SELECT * FROM casas WHERE id_casa = "+id;

            consultarBase(sql);

            Integer contador = 0;
            while (resultado.next()) {
                contador = contador + 1;
            }
            return contador>0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error en existencia de casa");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public String obtenerNombre(Integer idCliente) throws MiExcepcion{
        
        try {
            String sql = "SELECT nombre FROM clientes WHERE id_cliente = "+idCliente;

            consultarBase(sql);
            String nombre = "";

            while (resultado.next()) {         
                nombre = resultado.getString(1);
            }
            return nombre;
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error en existencia de casa");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public Integer obtenerProximaEstancia()throws MiExcepcion{
        try {
            String sql = "SELECT id_estancia FROM estancias ORDER BY id_estancia DESC LIMIT 1";

            consultarBase(sql);
            Integer numero = 0;

            while (resultado.next()) {         
                numero = resultado.getInt(1);
            }
            return numero;
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error en existencia de casa");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public Boolean validarFechasDeReserva(Date fechaEntrada, Date fechaSalida, Integer diasDeEstadia, Integer idCasa) throws MiExcepcion{
        try {
            String sql = "SELECT * FROM casas WHERE id_casa ="+idCasa;
            consultarBase(sql);
            Casas casa = new Casas();

            while (resultado.next()) {
                casa.setFechaDesde(resultado.getDate(7));
                casa.setFechaHasta(resultado.getDate(8));
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
            }
            
            if(casa.getFechaDesde().before(fechaEntrada)&& fechaSalida.before(casa.getFechaHasta())){
                if(diasDeEstadia >= casa.getTiempoMinimo() && diasDeEstadia <= casa.getTiempoMaximo()){
                    return true;
                }else return false;     
            }else return false;
      
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error en existencia de casa");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
