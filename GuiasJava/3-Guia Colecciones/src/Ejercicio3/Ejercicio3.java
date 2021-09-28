package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

    /**
     Crear una clase llamada Alumno que mantenga información sobre las notas de
    distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
    de tipo Integer con sus 3 notas.
    En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
    información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
    pregunta al usuario si quiere crear otro Alumno o no.
    Despues de ese bluce tendremos el siguiente método en la clase Alumno:
    Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
    su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
    método. Dentro del método se usará la lista notas para calcular el promedio final
    de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
    main.
     */
    public static void main(String[] args) {
       
        
        List<Alumno> listaDeAlumnos = new ArrayList();
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        AlumnoService alumnoServi = new AlumnoService();
        Alumno alumno;
        
        Character validacion = 's';
        while (validacion == 's'){
            alumno = alumnoServi.crearAlumno();
            listaDeAlumnos.add(alumno);
            
            System.out.println("INGRESE UNA OPCION:");
            System.out.println("S PARA INGRESAR NUEVO ALUMNO");
            System.out.println("N PARA SALIR");
            validacion = leer.next().charAt(0);
            System.out.println(" ");
        }
        
        alumnoServi.mostrarAlumnos(listaDeAlumnos);
        alumnoServi.notaFinal(listaDeAlumnos);
    }
    
    
}
