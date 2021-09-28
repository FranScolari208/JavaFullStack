package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    
    private String nombre;
    private List<Integer> notasAlumno = new ArrayList();
    
    
     public Alumno(String nombre, ArrayList<Integer> notasAlumno) {
        this.nombre = nombre;
        this.notasAlumno = notasAlumno;
        
     }
     
    public Alumno(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNotasAlumno() {
        return notasAlumno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotasAlumno(List<Integer> notasAlumno) {
        this.notasAlumno = notasAlumno;
    }
    
     

    
     
     

}


