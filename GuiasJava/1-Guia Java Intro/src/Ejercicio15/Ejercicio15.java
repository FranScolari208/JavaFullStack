package Ejercicio15;

import java.util.Scanner;

/**
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        
        int opcion;
        int validacion = 0;
        int numero1;
        int numero2;
        System.out.println("Ingrese un valor");
        numero1 = leer.nextInt();
        System.out.println("Ingrese otro valor");
        numero2 = leer.nextInt();
        do{
            System.out.println("-------------MENU----------------");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("ELIJA UNA OPCION:");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1: 
                    suma(numero1, numero2);
                    break;       
                case 2:
                    resta(numero1, numero2);
                    break;
                case 3:
                    multipliplicacion(numero1, numero2);
                    break;
                case 4:
                    division(numero1, numero2);
                    break;
                default:
                    validacion = 1;
            }
        }while (validacion == 0);
    }

    public static void suma(int numero1, int numero2) {
        int sumaNumeros;
        
        sumaNumeros = numero1 + numero2;
        System.out.println("El resultado de la suma es: "+sumaNumeros);
    }

    public static void resta(int numero1, int numero2) {
        int restaNumeros;
        
        restaNumeros = numero1 - numero2;
        System.out.println("El resultado de la resta es: "+restaNumeros);
    }

    public static void multipliplicacion(int numero1, int numero2) {
        int multipNumeros;
        
        multipNumeros = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion es: "+multipNumeros);
    }

    public static void division(int numero1, int numero2) {
       float diviNumeros;
       
       diviNumeros = numero1 / numero2;
       System.out.println("El resultado de la division es: "+diviNumeros);
    }


    
    
}
