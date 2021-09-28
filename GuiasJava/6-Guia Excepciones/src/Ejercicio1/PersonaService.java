package Ejercicio1;

import java.util.Scanner;

/**
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el
código con una cláusula try-catch para probar la nueva excepción que debe ser
controlada.
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
    
    public int calcularICM(Persona persona)throws Exception{
    Float ism;
    ism = (persona.getPeso()) / (persona.getAltura() * persona.getAltura());
    System.out.println(ism); 
    
    if (ism <= 20){
        return -1;
    }else if ((ism>20) && (ism<25)){
        return 0;
    }else return 1;
    }
    
    public boolean esMayorDeEdad(Persona persona)throws Exception{
   
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
