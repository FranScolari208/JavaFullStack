package Ejercicio7;

import java.util.Scanner;

/**
Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int numero1;
        int numero2;
        
        System.out.println("Ingrese el primer numero Entero");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero Entero");
        numero2 = leer.nextInt();
        
        if (numero1 > numero2){
              System.out.println("El numero "+ numero1 + " es mayor que el numero "+ numero2);
        }else if (numero1 == numero2){
              System.out.println("El numero "+ numero1 + " es igual que el numero "+ numero2);
        }else System.out.println("El numero "+ numero2 + " es mayor que el numero "+ numero1);
                    }
        
    }
    

