package Ejercicio19;

import java.util.Scanner;

/**
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
   * * * *
   *     *
   *     *
   * * * *
 */
public class Ejercicio19 {
      public static void main(String[] args) {
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        int dimension;
        int i;
        int j;
        
        System.out.println("Ingrese la dimension de su matriz cuadrada");
        dimension = leer.nextInt();
        
        String matriz[][] = new String [dimension][dimension];
        for (i = 0; i < dimension ; i++){
            for (j = 0; j < dimension; j++){
               if (i==0 | i == (dimension - 1) | j == 0 | j == (dimension -1)){
                   matriz[i][j] = "*";
                   
               }else matriz[i][j] = " "; 
            }
        }
        for (i = 0; i < dimension ; i++){
            for (j = 0; j < dimension; j++){
            System.out.print(matriz[i][j]);  
            }
            System.out.println(""); 
        }       
        
    }
    
}
