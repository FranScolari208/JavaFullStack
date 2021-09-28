package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4Main {
    public static void main(String[] args) {
        Integer desicion = 0;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("**************************************************");
        System.out.println("*******   BIENVENIDO AL ALQUILER 3000   **********");
        
        do{
            System.out.println("1) INGRESAR UN NUEVO ALQUILER");
            System.out.println("2) SALIR");
            desicion = leer.nextInt();
            if (desicion == 2){
                break;
            }else{
                Alquiler alquiler = new Alquiler();
                alquiler.crearAlquiler();
                Integer precio = alquiler.precioAlquiler();
                System.out.println(alquiler.toString());
                System.out.println("EL PRECIO TOTAL DEL ALQUILER ES DE: $"+precio);
                System.out.println("**************************************************");
                System.out.println("**************************************************");
            }
        System.out.println("");    
        }while (desicion != 2);
        
    }
    
}
