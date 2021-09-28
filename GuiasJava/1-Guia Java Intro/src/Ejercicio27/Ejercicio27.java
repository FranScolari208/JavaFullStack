package Ejercicio27;

import java.util.Scanner;

/**
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.

 */
public class Ejercicio27 {
    public static void main(String[] args) {

        int matriz[][] = new int [3][3];
        boolean validacion;
       
        armadodeMatriz(matriz);
        validacion = comprobacionDeValidez(matriz);
        muestraDeMatriz(matriz);
        if (validacion == true){
            matrizcuadrada(matriz);
        }else System.out.println("ALGUNO DE LOS NUMEROS INGRESADOS NO ESTA DENTRO DEL RANGO");
    }

    public static void armadodeMatriz(int[][] matriz) {
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        
        int i;
        int j;
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
             System.out.println("Ingrese un valor para la posicion ("+i+","+j+")");
             matriz[i][j] = leer.nextInt();
            }
        }    
    }

    public static boolean comprobacionDeValidez(int[][] matriz) {
        int i;
        int j;
        int contador = 0;
        boolean validacion;
        
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
              if(matriz[i][j]>0 && matriz[i][j]<10){
                  contador = contador + 1;
              }                                
            }
        } 
        if (contador == 9){
            return validacion = true;
        }else return validacion = false;
    }
    private static void muestraDeMatriz(int[][] matriz) {
        int i;
        int j;
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print("["+matriz[i][j]+"] ");
            }  
            System.out.println("");
        }
        System.out.println("");
    }
    public static void matrizcuadrada(int[][] matriz) {
        
        int i;
        int j;
        int h;
        int k = 0;
        int contador = 0;
        int suma = 0;
        int validacion = 0;
        int verticales = 0;
        int diagonales = 0;
        int columna = 0;
        boolean esMagica;
    
//----------------------------Suma de filas y comprobacion------------------        
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                
                contador = contador + matriz[i][j];
            }
            if (i == 0){
                suma = contador;
                validacion = validacion + 1;
                
            }else if (suma == contador){
                validacion = validacion + 1;
            }
            
            contador = 0;	
					
        }
	if (validacion == 3){
            verticales = verticales + 1;
        }	
	
//-----------------------Suma de diagonal a derecha y validacion----------------
	contador = 0;
        
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                if (i == j){
                    contador = contador + matriz[i][j];
                }
            }
        }
	
        if (suma == contador){
            diagonales = diagonales + 1;
        }
	
//--------------------Suma de diagonal a izquierda y validacion ----------------
	contador = 0;
        
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                if ((i + j) == 2){
                    contador = contador + matriz[i][j];
                }
            }
        }
	
        if (suma == contador){
            diagonales = diagonales + 1;
        }
	
//-----------------------Compobacion de si ambas diagonales cumplen-------------
        
        if (diagonales == 2){
           verticales = verticales + 1;
        }

	
	//---------------------Suma de columnas y validacion de q sean iguales-------------------
	contador = 0;
        
        for (h=0; h<3; h++){
            for(i=0; i<3; i++){
                for(j=0; j<3; j++){
                    if (j == k){
                        contador = contador + matriz[i][j];
                    }
                }
            }
            if (suma == contador){
            columna = columna + 1;
            }
            k = k + 1;
            contador = 0;
        }
	
	if (columna == 3){
            verticales = verticales + 1;
        }
		
//-----------Validacion de que filas columnas y diagonales den lo mismo--------
        if (verticales == 3){
            esMagica = true;
        }else esMagica = false;
        
//------------------------------Muestra de resultados---------------------------
        if (esMagica == true){
            System.out.println("LA MATRIZ INGRESADA ES MAGICA");
            System.out.println("LA SUMA DE LA MATRIZ ES: "+suma);
        }else System.out.println("LA MATRIZ INGRESADA NO ES MAGICA");
	
	

    }

    
}
    

