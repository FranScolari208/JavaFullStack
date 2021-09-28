package Ejercicio28;

import java.util.Random;
import java.util.Scanner;

/**
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
 */
public class Ejercicio28 {
    public static void main(String[] args) {
        int matrizM[][] = new int [10][10];
        int matrizP[][] = new int [3][3];
        
        armadoMatrizM(matrizM);
        muestraDeMatriz(matrizM,10);
        llenadoDeMatriz(matrizP);
        muestraDeMatriz(matrizP, 3);
        if (verSiMatrizEstaIncluida(matrizM, matrizP)){
            System.out.println("La Matriz pequeña se encuentra en la grande");
        }else System.out.println("La Matriz pequeña no se encuentra en la grande");    
    }

    public static void armadoMatrizM(int[][] matrizM) {
        
        Random aleatorio = new Random();
        int i;
        int j;
        
        for (i=0; i<10; i++){
            for (j=0; j<10; j++){
                matrizM[i][j]= aleatorio.nextInt(10);
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

    public static void llenadoDeMatriz(int[][] matrizP) {
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        int i;
        int j;
        
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
               do{
                   System.out.println("Ingrese un numero entre 0 y 9 para la posicion: ("+i+", "+j+")");
                   matrizP[i][j]= leer.nextInt();
               }while ((matrizP[i][j] < 0) || (matrizP[i][j] > 9));
                
            }
        }
    }

    public static boolean verSiMatrizEstaIncluida(int[][] matrizM, int[][] matrizP) {
        
        int i;
        int j;

        for (i=0; i<8; i++){ //examino hasta i<8 pq si encuentro en i=9 no emtraria la matriz pequeña
            for (j=0; j<8; j++){ // examino hasta j<8 pq si encuentro en j=9 no entraria la matriz pequeña
                if (subMatriz(matrizM, matrizP, i, j)){
                    return true;
                }
            }
        }
        return false;
        
    }

    private static boolean subMatriz(int[][] matrizM, int[][] matrizP, int i, int j) {
        int k;
        int h;
        int a= 0;
        int b;
        for (k=i; k<(i+3); k++){
          b = 0;
          for (h=j; h<(j+3); h++){
            if (matrizM[k][h]!= matrizP[a][b]){
               return false;
                              
            }
            else b++;
            }
            a++;
        }
        return true;
    }
    
}
