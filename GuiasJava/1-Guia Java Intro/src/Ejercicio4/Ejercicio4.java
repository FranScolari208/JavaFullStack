package Ejercicio4;

import java.util.Scanner;
/**
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String frase;
        String mayuscula;
        String minuscula;
        
        System.out.println("Ingrese una Frase");
        frase = leer.next();
        
        mayuscula = frase.toUpperCase();
        minuscula = frase.toLowerCase();
        
        System.out.println("Su frase ingresada en mayusculas es: "+ mayuscula);
        System.out.println("Su frase ingresada en minusculas es: "+ minuscula);
                
    }
    
}
