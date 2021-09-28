package jdbc.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.entidad.Familias;
import jdbc.excepcion.MiExcepcion;

public class FamiliasDAO extends DAO{
    
    public List<Familias> obtenerFamiliasDeAlMenosTresHijos() throws MiExcepcion {
        try {
            String sql = "SELECT * FROM familias WHERE num_hijos >= 3 AND edad_maxima < 10";

            consultarBase(sql);

            List<Familias> familias = new ArrayList<>();
            Familias familia = null;

            while (resultado.next()) {
                familia = new Familias();
                familia.setIdFamilia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdadMinima(resultado.getInt(3));
                familia.setEdadMaxima(resultado.getInt(4));
                familia.setNumeroHijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setIdCasaFamilia(resultado.getInt(7));
   
                familias.add(familia);
            }

            return familias;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener nombres de productos");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public List<Familias> obtenerFamiliasConHotmail() throws MiExcepcion{
        try {
            String sql = "SELECT * FROM familias WHERE email LIKE '%hotmail%'";

            consultarBase(sql);

            List<Familias> familias = new ArrayList<>();
            Familias familia = null;

            while (resultado.next()) {
                familia = new Familias();
                familia.setIdFamilia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdadMinima(resultado.getInt(3));
                familia.setEdadMaxima(resultado.getInt(4));
                familia.setNumeroHijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setIdCasaFamilia(resultado.getInt(7));
   
                familias.add(familia);
            }

            return familias;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener nombres de productos");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
