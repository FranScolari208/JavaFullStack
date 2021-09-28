package Ejercicio22;

/**
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        
        int i;
        int matriz[] = new int [100];
        
        for(i=0; i<100; i++){
            matriz[i]=i;
        }
        
        for(i=99;i>=0;i--){
            System.out.println(matriz[i]);
        }
    }
    
}
