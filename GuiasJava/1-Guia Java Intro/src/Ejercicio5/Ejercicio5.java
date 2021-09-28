package Ejercicio5;

import java.util.Scanner;

/**
Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        float grados;
        float farenheit;
        
        System.out.println("Ingrese una cantidad de grados centigrados");
        grados = leer.nextFloat();
        
        farenheit = 32 + ((grados * 9)/ 5);
        
        System.out.println("La cantidad de grados celcius ingresada son "+farenheit+" grados Farenheit");
        
    }
    
}
