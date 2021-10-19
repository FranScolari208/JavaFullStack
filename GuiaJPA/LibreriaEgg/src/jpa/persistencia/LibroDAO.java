package jpa.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import jpa.entidades.Libro;
import jpa.excepcion.MiExcepcion;

public class LibroDAO {
    private EntityManager em;
    
    public LibroDAO() {
        em = Persistence
                .createEntityManagerFactory("LibreriaJPAPU")
                .createEntityManager();
    }

    public void guardarLibro(Libro libro) throws MiExcepcion {
        try {
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw new MiExcepcion("ERROR AL GUARDAR EL LIBRO");
        }
    }

    public void modificarLibro(Libro libro) throws MiExcepcion {
        try {
            em.getTransaction().begin();
            em.merge(libro);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw new MiExcepcion("ERROR AL MODIFICAR EL LIBRO");
        }
    }

    public void eliminarLibro(Libro libro) throws MiExcepcion {
        try {
            em.getTransaction().begin();
            em.remove(libro);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw new MiExcepcion("ERROR AL ELIMINAR EL LIBRO");
        }
    }
    
    public Libro buscarLibroPorIsbn(Long isbn) throws MiExcepcion {
        try {
            Libro libro = em.find(Libro.class, isbn);
            return libro;
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL BUSCAR LIBRO POR ISBN");
        }
    }
    
    public List<Libro> obtenerTodosLosLibros()throws MiExcepcion{
        
        try {
            List<Libro> libros = em.createQuery("SELECT e FROM Libro e", Libro.class)
                    .getResultList();
            return libros;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL ENCONTRAR LIBROS");
        }
    }
    
    public List<Libro> buscarLibrosPorTitulo(String titulo)throws MiExcepcion{
        try {
            List<Libro> libros = em.createQuery("SELECT e FROM Libro e WHERE e.titulo LIKE CONCAT('%', :titulo, '%')", Libro.class)
                    .setParameter("titulo", titulo)
                    .getResultList();
            return libros;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL ENCONTRAR LIBROS");
        }
    }
    
    public List<Libro> buscarLibrosPorAutor(String nombre) throws MiExcepcion{
        try{
            List<Libro> libros = em.createQuery("SELECT e FROM Libro e JOIN e.autor b WHERE b.nombre LIKE CONCAT('%', :nombreAutor, '%')", Libro.class)
                    .setParameter("nombreAutor", nombre)
                    .getResultList();
            return libros;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL ENCONTRAR LIBROS");
        }
    }
}
