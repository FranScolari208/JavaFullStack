package jpa.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import jpa.entidades.Autor;
import jpa.excepcion.MiExcepcion;

public class AutorDAO {
    private EntityManager em;
    
    public AutorDAO() {
        em = Persistence
                .createEntityManagerFactory("LibreriaJPAPU")
                .createEntityManager();
    }

    public void guardarAutor(Autor autor) throws MiExcepcion {
        try {
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw new MiExcepcion("ERROR AL GUARDAR EL AUTOR");
        }
    }

    public void modificarAutor(Autor autor) throws MiExcepcion {
        try {
            em.getTransaction().begin();
            em.merge(autor);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw new MiExcepcion("ERROR AL MODIFICAR EL AUTOR");
        }
    }

    public void eliminarAutor(Autor autor) throws MiExcepcion {
        try {
            em.getTransaction().begin();
            em.remove(autor);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw new MiExcepcion("ERROR AL ELIMINAR EL AUTOR");
        }
    }
    
    public List<Autor> buscarAutorPorSuNombre(String nombre) throws MiExcepcion {
        try {
            return em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE CONCAT('%', :nombre, '%')", Autor.class)
                    .setParameter("nombre", nombre)
                    .getResultList();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL BUSCAR AUTOR POR NOMBRE");
        }
    }
    
    public Autor buscarAutorPorIdDeAutor(Long id) throws MiExcepcion{
        Autor autor;
        try {
            autor = em.find(Autor.class, id);
            return autor;
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL BUSCAR AUTOR POR ISBN");
        }
        
    }
    
    public List<Autor> obtenerTodosLosAutores()throws MiExcepcion{
        try {
            List<Autor> autores = em.createQuery("SELECT e FROM Autor e", Autor.class)
                    .getResultList();
            return autores;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL ENCONTRAR EDITORIALES");
        }
    }
}
