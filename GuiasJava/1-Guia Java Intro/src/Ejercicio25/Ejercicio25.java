package Ejercicio25;

import java.util.Random;

/**
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la
muestre ordenada por sus columnas.
 */
public class Ejercicio25 {
     public static void main(String[] args) {
         
         int i;
         int j;
         int matriz[][] = new int [4][4];
         
         for (i=0; i<4; i++){
             for (j=0; j<4; j++){
                 matriz[i][j]= new Random().nextInt(20);
                 System.out.print("["+matriz[i][j]+"] ");
             }
             System.out.println("");
         }
         System.out.println("");
         

        for (j=0; j<4; j++){
          System.out.print((j+1)+"° columna: ");
            for (i=0; i<4; i++){
              System.out.print(matriz[i][j]+" ");
            }
              System.out.println("");
        }
             
    }
     
    
}

    
