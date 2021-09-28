package Ejercicio11;

import java.util.Scanner;

/**
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        String palabra;
        
        System.out.println("Ingrese una palabra de 8 caracteres");
        palabra = leer.next();
        
        String primerLetra = palabra.substring(0, 1);
        
        if ( primerLetra.equals("A")) {
            System.out.println("CORRECTOO");
        }else System.out.println("INCORRECTOO");
    }
    
}
