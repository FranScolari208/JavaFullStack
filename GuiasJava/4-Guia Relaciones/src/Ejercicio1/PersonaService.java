package Ejercicio1;

import java.util.Scanner;

/**
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
public class PersonaService {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Persona persona = new Persona(); //-------> Instancio a la persona
        PerroService perroService = new PerroService(); //--------> Instancio al perro
        System.out.println("INGRESE EL NOMBRE DE LA PERSONA");
        persona.setNombre(leer.next());
        System.out.println("INGRESE EL APELLIDO DE LA PERSONA");
        persona.setApellido(leer.next());
        System.out.println("INGRESE LA EDAD DE LA PERSONA");
        persona.setEdad(leer.nextInt());
        System.out.println("INGRESE EL DOCUMENTO DE LA PERSONA");
        persona.setDocumento(leer.nextInt());
        Perro perro = perroService.crearPerro(); //-----> Creo al perro
        persona.setPerroAdoptado(perro);   //--------> Se lo agrego a la persona
        
        return persona; //---------> Persona creada!
    }
    
}
