package Ejercicio12;

import java.util.Date;
import java.util.Scanner;

/**
Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:

• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
public class PersonaService {
    public Persona crearPersona() {
 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona persona = new Persona();
    
    System.out.println("Ingrese el nombre de la persona");
    String nombre = leer.next();
    
    persona.setNombre(nombre);
    
    System.out.println("Ingrese el dia");
    int dia = leer.nextInt();
        
    System.out.println("Ingrese el mes");
    int mes = leer.nextInt();
        
    System.out.println("Ingrese el año");
    int anio = leer.nextInt();
        
    Date fecha = new Date(anio-1900, mes-1, dia); // guardo los datos en un Date (clase) 
    
    persona.setFechaDeNacimiento(fecha); // los seteo como atributo de la clase

    
    return persona;

    }
    
    public int obtenerEdad(Persona persona){
        Date fechaActual = new Date();
            
       int edad = fechaActual.getYear()- persona.getFechaDeNacimiento().getYear();
       return edad;
    }
    
    public void mostrarPersona(Persona persona){
        
        System.out.println("nombre: "+persona.getNombre());
        System.out.println("Fecha de nacimiento: "+persona.getFechaDeNacimiento());

    }
    
    public boolean menorQue(Persona persona, int edad){
        
        
        if (edad > obtenerEdad(persona)){
            return true;
        }else return false;
    } 
}
