package Ejercicio10;

import java.util.Arrays;

/**
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
public class ArrayMain {
    public static void main(String[] args) {
        
        int[] arregloA = new int[50];
        int[] arregloB = new int[20];
        
        rellenarVectorAleatorio(arregloA);
        System.out.println("--------------------------------ARREGLO A-----------------------------------");
        imprimirArreglo(arregloA);
        Arrays.sort(arregloA);
        System.out.println("----------------------------ARREGLO A ORDENADO------------------------------");
        imprimirArreglo(arregloA);
        //System.arraycopy(arregloOrigen,posInicial del arregloOrigen,arregloDestino,posInicial 
        //del arregloDestino,cantidad de elementos a copiar);
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        System.out.println("-------------------------ARREGLO B POR COMPLETAR-----------------------------");
        imprimirArreglo(arregloB);
        Arrays.fill(arregloB, 10, 20, 5);
        System.out.println("-----------------------------ARREGLO B LLENO---------------------------------");
        imprimirArreglo(arregloB);
       
    }
    public static void rellenarVectorAleatorio(int arreglo[]){
        int i;
        
        for(i=0;i<arreglo.length;i++){
            arreglo[i]= (int) (Math.random() * 10) + 1;
        }
    }
    
    public static void imprimirArreglo(int arreglo[]){
           int i;
           
           for(i=0;i<arreglo.length;i++){
               System.out.print(" "+arreglo[i]+" ");
           }
           System.out.println(" ");
    }
}

