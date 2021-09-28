
package Ejercicio3;

import java.util.Scanner;

/**
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nombre;
      
        System.out.println("Ingrese su nombre");
        nombre = scan.next();
        
        System.out.println("Su nombre es "+nombre);
        
        
    }
    
}
