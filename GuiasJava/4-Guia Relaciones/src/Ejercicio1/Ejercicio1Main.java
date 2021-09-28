package Ejercicio1;
/**
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
public class Ejercicio1Main {
    public static void main(String[] args) {
        
        
        PersonaService personaServi1 = new PersonaService();
        PersonaService personaServi2 = new PersonaService();
        
        Adopcion adopcion1 = new Adopcion();
        Adopcion adopcion2 = new Adopcion();
        Persona persona1;
        Persona persona2;
        
        persona1 = personaServi1.crearPersona();
        persona2 = personaServi2.crearPersona();

        
        System.out.println(adopcion1.generarAdopcion(persona1).toString());
        System.out.println(adopcion2.generarAdopcion(persona2).toString());
    }
    
}
