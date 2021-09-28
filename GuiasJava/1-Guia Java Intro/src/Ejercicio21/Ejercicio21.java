package Ejercicio21;

import java.util.Scanner;

/**
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */

public class Ejercicio21 {
    public static void main(String[] args) {
        
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        
        int euros;
        String opcion;
        
        System.out.println("Ingrese una cantidad de euros");
        euros = leer.nextInt();
        System.out.println("-----------MONEDAS A CONVERTIR---------");
        System.out.println("YENES");
        System.out.println("DOLARES");
        System.out.println("LIBRAS");
        System.out.println("INGRESE MONEDA EN MINUSCULAS");
        opcion = leer.next();
        
        switch (opcion){
            case "yenes":
                convertirAYenes(euros);
            break;
            case "dolares":
                convertirADolares(euros);
            break;
            case "libras":
                convertirALibras(euros);
            break;
            default: System.out.println("SU MONEDA INGRESADA NO SE ENCUENTRA EN NUESTRO SISTEMA");
                        
        }
          
    }

    private static void convertirAYenes(int euros) {
        double yenes;
        yenes = euros * 129.852;
        System.out.println("Yenes: "+yenes);
        
    }

    private static void convertirADolares(int euros) {
        double dolares;
        dolares = euros * 1.28611;
        System.out.println("U$D "+dolares);
    }

    private static void convertirALibras(int euros) {
        double libras;
        libras = euros * 0.86;
        System.out.println("Libras: "+libras);
    }
    
}
