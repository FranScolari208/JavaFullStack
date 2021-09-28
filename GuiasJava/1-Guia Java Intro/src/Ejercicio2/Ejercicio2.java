package Ejercicio2;

import java.util.Scanner;

/**
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero1;
        int numero2;
        
        System.out.println("Ingrese su primer numero");
        numero1 = scan.nextInt();
        System.out.println("Ingrese su segundo numero");
        numero2 = scan.nextInt();
        
        int suma = numero1 + numero2;
        
        System.out.println("La suma de "+numero1+" y "+numero2+" da como resultado: "+suma);
        
        
    }
    
}
