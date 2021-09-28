package Ejercicio9;

import java.util.Scanner;

/**
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
         Scanner leer =new Scanner(System.in).useDelimiter("\n");
       
       String frase;
       String eureka = "eureka";
       System.out.println("Ingrese una frase");
       frase = leer.next();
       
       if (frase.equals(eureka)){
           System.out.println("CORRECTOOO");
           
       }else System.out.println("INCORRECTOO");
    }
    
}
