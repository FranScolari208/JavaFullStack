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
public class PerroService {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Perro crearPerro(){
        Perro perro = new Perro();
        System.out.println("INGRESE EL NOMBRE DEL PERRO");
        perro.setNombre(leer.next());
        System.out.println("INGRESE LA RAZA DEL PERRO");
        perro.setRaza(leer.next());
        System.out.println("INGRESE LA EDAD DEL PERRO");
        perro.setEdad(leer.nextInt());
        System.out.println("INGRESE EL TAMAÑO DEL PERRO");
        perro.setTamaño(leer.next());
        return perro;
        
    }
}
