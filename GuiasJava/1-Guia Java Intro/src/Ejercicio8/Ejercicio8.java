package Ejercicio8;

import java.util.Scanner;

/*
 Crear un programa que dado un numero determine si es par o impar.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
       Scanner leer =new Scanner(System.in).useDelimiter("\n");
       
       int numero;
       
       System.out.println("Ingrese un numero");
       numero = leer.nextInt();
       
       if ((numero % 2)== 0){
        System.out.println("El numero que ingreso es par");
    }else System.out.println("El numero que ingreso es impar");
       
    }
    
}
