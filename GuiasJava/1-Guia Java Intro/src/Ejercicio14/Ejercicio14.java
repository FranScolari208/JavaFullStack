package Ejercicio14;

import java.util.Scanner;

/**
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        
        int valorLimite;
        int valor;
        int contador = 0;
        
        System.out.println("Ingrese un valor limite Positivo");
        valorLimite = leer.nextInt();
        
        do {
            System.out.println("Ingrese un valor");
            valor = leer.nextInt();
            contador = contador + valor;
        } while (contador <= valorLimite);
        
         System.out.println("La suma de los valores ingresados ha superado el valor limite ingresado");
    }
    
}
