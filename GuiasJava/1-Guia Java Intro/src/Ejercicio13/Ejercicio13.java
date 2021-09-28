package Ejercicio13;

import java.util.Scanner;

/**
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
       Scanner leer =new Scanner(System.in).useDelimiter("\n");
        
        int nota;
        
        do  {
            System.out.println("Ingrese una nota entre 0 y 10");
            nota = leer.nextInt();
        } while ((nota > 10) || (nota < 0));
    }
    
}
