package Ejercicio20;

import java.util.Scanner;

/**
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        
        int numero;
        int i;
        int j;
        int matriz[] = new int [4];
        
        for(i=0; i<4; i++){
            do {
                System.out.println("Ingrese un valor para la posicion: "+i);
                numero = leer.nextInt();
            }while (numero>20);           
            matriz[i] = numero;            
        }
        
        for(i=0; i<4; i++){
           for (j=0; j<(matriz[i]+1); j++){
                if (j==0){
                 System.out.print(matriz[i]);
             }else System.out.print("*");
           } 
           System.out.println("");
        } 
        
        //System.out.println(numero1+"asteriscos");
        //System.out.println(numero2+"Ingrese una nota entre 0 y 10");
        //System.out.println(numero3+"Ingrese una nota entre 0 y 10");
        //System.out.println(numero4+"Ingrese una nota entre 0 y 10");
    }
    
}
