package Ejercicio10;

import java.util.Scanner;

/**
Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
public class Ejercicio10 {
     public static void main(String[] args) {
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        String palabra;
        
        System.out.println("Ingrese una palabra de 8 caracteres");
        palabra = leer.next();
        if (palabra.length() == 8) {
            System.out.println("CORRECTOO");
        }else System.out.println("INCORRECTOO");
         
        
    }
    
}
