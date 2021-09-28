package Ejercicio7;

import java.util.Scanner;

/**
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
     
     System.out.println("Ingrese el nombre de la persona");
     String nombre = leer.next();
     System.out.println("Ingrese la edad de la persona");
     Integer edad = leer.nextInt();
     System.out.println("Ingrese el sexo de la persona: H para hombre, M para mujer y O para otro");
     Character sexo = leer.next().charAt(0);
     System.out.println("Ingrese el peso de la persona");
     Integer peso = leer.nextInt();
     System.out.println("Ingrese la altura de la persona");
     Float altura = leer.nextFloat();
    
    Persona persona = new Persona();
    
    persona.setNombre(nombre);
    persona.setEdad(edad);
    persona.setSexo(sexo);
    persona.setPeso(peso);
    persona.setAltura(altura);
    
    return persona;

    }
    
    public int calcularICM(Persona persona){
    Float ism; 
    ism = (persona.getPeso()) / (persona.getAltura() * persona.getAltura());
    System.out.println(ism); 
    
    if (ism <= 20){
        return -1;
    }else if ((ism>20) && (ism<25)){
        return 0;
    }else return 1;
    }
    
    public boolean esMayorDeEdad(Persona persona){
        if(persona.getEdad()>=18){
            return true;
        }else return false;
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println(" ");
        System.out.println("nombre: "+persona.getNombre());
        System.out.println("edad: "+persona.getEdad());
        System.out.println("sexo: "+persona.getSexo());
        System.out.println("peso: "+persona.getPeso());
        System.out.println("altura: "+persona.getAltura());
        System.out.println(" ");
        
    }
    
}
