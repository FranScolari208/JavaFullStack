package jpa.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import jpa.entidades.Editorial;
import jpa.excepcion.MiExcepcion;

public class EditorialDAO {
    private EntityManager em;
    
    public EditorialDAO() {
        em = Persistence
                .createEntityManagerFactory("LibreriaJPAPU")
                .createEntityManager();
    }

    public void guardarEditorial(Editorial editorial) throws MiExcepcion {
        try {
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw new MiExcepcion("ERROR AL GUARDAR LA EDITORIAL");
        }
    }

    public void modificarEditorial(Editorial editorial) throws MiExcepcion {
        try {
            em.getTransaction().begin();
            em.merge(editorial);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw new MiExcepcion("ERROR AL MODIFICAR LA EDITORIAL");
        }
    }

    public void eliminarEditorial(Editorial editorial) throws MiExcepcion {
        try {
            em.getTransaction().begin();
            em.remove(editorial);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw new MiExcepcion("ERROR AL ELIMINAR LA EDITORIAL");
        }
    }
    
    public Editorial buscarEditorialPorID(Long id) throws MiExcepcion{
        Editorial editorial;
        try {
            editorial = em.find(Editorial.class, id);
            return editorial;
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL BUSCAR EDITORIAL POR ISBN");
        }
        
    }
    
    public List<Editorial> obtenerTodasLasEditoriales()throws MiExcepcion{
        try {
            List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e", Editorial.class)
                    .getResultList();
            return editoriales;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL ENCONTRAR EDITORIALES");
        }
        
    }
    
    public List<Editorial> buscarEditorialPorNombreDeEditorial(String nombre) throws MiExcepcion {
        try {
            return em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE CONCAT('%', :nombre, '%')", Editorial.class)
                    .setParameter("nombre", nombre)
                    .getResultList();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL BUSCAR EDITORIAL POR NOMBRE");
        }
    }
}
