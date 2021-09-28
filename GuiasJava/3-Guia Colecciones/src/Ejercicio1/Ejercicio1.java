package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        List<String> perros = new ArrayList();
        int i = 1;
        Character validacion = 'a';
        
        System.out.println("BIENVENIDO AL ARRAY DE PERROS");
        
        while (validacion == 'a'){
            System.out.println("INGRESE UNA RAZA DE PERRO");
            String nuevoPerro = leer.next();
            perros.add(nuevoPerro);
            
            System.out.println("INGRESE UNA OPCION:");
            System.out.println("OPCION (A) NUEVO PERRO");
            System.out.println("OPCION (B) SALIR");
            validacion = leer.next().charAt(0);
            System.out.println(" ");
        }
 
        System.out.println("LOS PERROS INGRESADOS SON LOS SIGUIENTES: ");
        for (String todosLosPerros : perros){
            
            System.out.println(i+")"+" "+todosLosPerros.toUpperCase());
            
            i++;
        }
    }
    
}
