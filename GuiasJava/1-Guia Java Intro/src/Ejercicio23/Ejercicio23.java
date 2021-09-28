package Ejercicio23;

import java.util.Random;
import java.util.Scanner;

/**
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        
        int i;
        int matriz[] = new int [100];
        int numero;
        int contador = 0;
        int posicion = 0;
        
        for(i=0; i<100; i++){
            matriz[i]=new Random().nextInt(20);
        }
        
        System.out.println("Ingrese un numero entre 1 y 20");
        numero = leer.nextInt();
        
        for(i=0; i<100; i++){
            System.out.print("["+matriz[i]+"] ");
        }
        
        System.out.println("");
        
        for (i=0; i<100; i++){
            if (numero == matriz[i]){
                contador = contador + 1;
                System.out.println("Se encontro el numero "+numero+" en la posicion "+i);
            }
            
        }
        if(contador == 0){
            System.out.println("No se encontro el numero que ingreso en el vector");
        }
    }
    
}
