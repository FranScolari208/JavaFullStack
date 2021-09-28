package Ejercicio6;

import java.util.Scanner;
/**
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int numero;
        int doble;
        int triple;
        double raiz;
        
        System.out.println("Ingrese un numero entero");
        numero = leer.nextInt();
        
        doble = numero * 2;
        triple = numero * 3;
        raiz = Math.sqrt(numero);
        
        System.out.println("El doble de "+numero+ " es: "+doble);
        System.out.println("El triple de "+numero+ " es: "+triple);
        System.out.println("La raiz de "+numero+ " es: "+raiz);
        
    }
    
}
