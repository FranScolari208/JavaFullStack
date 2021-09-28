package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

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
* 
Ejemplo de una colección como atributo: ColeccionAtributo
 */
public class AlumnoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Alumno crearAlumno() {
        
    int i = 0;
    Alumno alumno = new Alumno();
   
    
    System.out.println("Ingrese el nombre del alumno");
    String nombre = leer.next();
    
    alumno.setNombre(nombre);
    List<Integer> notas = new ArrayList();
    
    while (i<=2){
            System.out.println("Ingrese una nota");
            Integer nota = leer.nextInt();
            notas.add(nota);
            i++;
            
        }
    
    alumno.setNotasAlumno(notas);
        
    return alumno;

    }
    
    public void mostrarAlumnos( List<Alumno> listaDeAlumnos){

        for(Alumno alumno : listaDeAlumnos){
            System.out.print("Nombre: "+alumno.getNombre()+", Notas: "+alumno.getNotasAlumno());
            
//            for (int i = 0; i < alumno.getNotasAlumno().size(); i++) { 
//                System.out.print("Nota "+(i+1)+": "+alumno.getNotasAlumno().get(i) + ", ");
//            }
            System.out.println("");
        }
        
        
    }
    
    public void notaFinal(List<Alumno> listaDeAlumnos){
        
        Iterator<Alumno> iterator = listaDeAlumnos.iterator();
        Integer contador = 0;
        System.out.println("Ingrese el nombre del alumno");
        String nombre = leer.next();
        Boolean validacion = false;
        while(iterator.hasNext()){
            
            Alumno alumnoActual = iterator.next(); // Obtengo el alumno actual
            String nombreDelAlumno = alumnoActual.getNombre(); // obtengo el nombre del alumno actual
            
            if (nombreDelAlumno.equals(nombre)){ // comparo el nombre del alumno actual con el nombre ingresado
                for(Integer nota : alumnoActual.getNotasAlumno()){// OBTENGO LA LISTA DE NOTAS VER QUE HACER
                     contador = contador + nota; // contador de las notas
                     validacion = true;
                } 
                
                Double promedio = (double)contador / 3 ; // saco el promedio de las notas dividiendolo por 3
                
                System.out.println("El promedio de las notas del alumno es: "+promedio);
            }
            
            if (validacion == false){
                System.out.println("El alumno ingresado no se encuentra en la base de datos");
            }

        }
        
    }
   
}
