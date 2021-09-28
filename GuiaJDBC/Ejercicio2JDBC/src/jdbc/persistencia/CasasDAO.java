package jdbc.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.entidad.Casas;
import jdbc.excepcion.MiExcepcion;

public class CasasDAO extends DAO{
    
    public List<Casas> obtenerCasasDisponibles() throws MiExcepcion{
        try {
            String sql = "SELECT * FROM casas WHERE fecha_desde <= '2020-08-01' AND fecha_hasta <= '2020-08-31' AND pais = 'Reino Unido'";

            consultarBase(sql);

            List<Casas> casas = new ArrayList<>();
            Casas casa = null;

            while (resultado.next()){
                casa = new Casas();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumeroCasa(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate(7));
                casa.setFechaHasta(resultado.getDate(8));
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getFloat(11));
                casa.setTipoDeCasa(resultado.getString(12));
                
          
               casas.add(casa);
            }

            return casas;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener nombres de las casas");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public List<Casas> obtenerCasasConPreciosActualizados() throws MiExcepcion{
        try {
            String sql = "SELECT * FROM casas WHERE pais = 'Reino Unido'";

            consultarBase(sql);

            List<Casas> casas = new ArrayList<>();
            Casas casa = null;

            while (resultado.next()){
                casa = new Casas();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumeroCasa(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate(7));
                casa.setFechaHasta(resultado.getDate(8));
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getFloat(11));
                casa.setTipoDeCasa(resultado.getString(12));
                
          
               casas.add(casa);
            }

            return casas;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener nombres de las casas");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
        
        public List<Casas> obtenerCasasPorPais() throws MiExcepcion{
            try {
            String sql = "SELECT count(id_casa), pais FROM casas GROUP BY pais";

            consultarBase(sql);

            List<Casas> casas = new ArrayList<>();
            Casas casa = null;

            while (resultado.next()){
                casa = new Casas();
                casa.setIdCasa(resultado.getInt(1));
                casa.setPais(resultado.getString(2));
                
               casas.add(casa);
            }

            return casas;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener nombres de las casas");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
        
        public List<Casas> obtenerCasasConComentariosPositivos() throws MiExcepcion{
            try {
            String sql = "SELECT * FROM casas c INNER JOIN comentarios h ON c.id_casa = h.id_casa WHERE h.comentario LIKE '%limpia%'";

            consultarBase(sql);

            List<Casas> casas = new ArrayList<>();
            Casas casa = null;

            while (resultado.next()){
                casa = new Casas();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumeroCasa(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate(7));
                casa.setFechaHasta(resultado.getDate(8));
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getFloat(11));
                casa.setTipoDeCasa(resultado.getString(12));
                
          
               casas.add(casa);
            }

            return casas;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener nombres de las casas");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
        }
        
    
}
