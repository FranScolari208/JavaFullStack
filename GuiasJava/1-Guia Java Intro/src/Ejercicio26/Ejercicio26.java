package Ejercicio26;

import java.util.Scanner;

/**
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT

. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
public class Ejercicio26 {
     public static void main(String[] args) {
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        
        int dim;
        
        System.out.println("Ingrese el tamaño de la matriz cuadrada");
        dim = leer.nextInt();
        
        int matriz[][] = new int [dim][dim];
        int matrizTras [][] = new int [dim][dim];
        
        armadoDeMatriz(matriz, dim);
        muestraDeMatriz(matriz, dim);
        matrizTraspuesta(matriz, matrizTras, dim);
        muestraDeMatriz(matrizTras, dim);
        validacionAntisimetria(matriz, matrizTras, dim);
    }

    public static void armadoDeMatriz(int[][] matriz,int dim){
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        
        int i;
        int j;
        for (i=0; i<dim; i++){
            for (j=0; j<dim; j++){
             System.out.println("Ingrese un valor para la posicion ("+i+","+j+")");
             matriz[i][j] = leer.nextInt();
            }
        }    

   }

    public static void muestraDeMatriz(int[][] matriz, int dim) {
        int i;
        int j;
        for (i=0; i<dim; i++){
            for(j=0; j<dim; j++){
                System.out.print("["+matriz[i][j]+"] ");
            }  
            System.out.println("");
        }
        System.out.println("");
    }

    public static void matrizTraspuesta(int[][] matriz, int[][] matrizTras, int dim) {
        int i;
        int j;
        for (i=0; i<dim; i++){
            for (j=0; j<dim; j++){
             matrizTras[j][i] = matriz[i][j];
            }
        }
    }

    public static void validacionAntisimetria(int[][] matriz, int[][] matrizTras, int dim) {
        int i;
        int j;
        int contador = 0;
        for (i=0; i<dim; i++){
            for (j=0; j<dim; j++){
                if(matriz[i][j]==-(matrizTras[i][j])){
                    contador = contador + 1;
                }
            }
        }
        if(contador==(dim*dim)){
            System.out.println("LA MATRIZ ES ANTISIMETRICA");
        }else System.out.println("LA MATRIZ NO ES ANTISIMETRICA");
    }
}