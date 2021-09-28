package Ejercicio24;

import java.util.Scanner;
import java.util.Random;

/**
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejercicio24 {
     public static void main(String[] args) {
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        
        int i;
        int numero;
        String longitud;
        int unDigito = 0;
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;
      
        System.out.println("Ingrese el tamaño del vector");
        numero = leer.nextInt();
        
        int matriz[] = new int [numero];
        
        for(i=0; i<numero; i++){
        matriz[i]= new Random().nextInt(20000);
        longitud = Integer.toString(matriz[i]);
        
        switch (longitud.length()){
            case 1: unDigito = unDigito + 1;
            break;
            case 2: dosDigitos = dosDigitos + 1;
            break;
            case 3: tresDigitos = tresDigitos + 1;
            break;
            case 4: cuatroDigitos = cuatroDigitos + 1;
            break;
            case 5: cincoDigitos = cincoDigitos + 1;
            break;
            
        }
        
        }
        for(i=0; i<100; i++){
            System.out.print("["+matriz[i]+"] ");
        }
        System.out.println("");
        
        System.out.println("Total de numeros de 1 digito: "+unDigito);
        System.out.println("Total de numeros de 2 digito: "+dosDigitos);
        System.out.println("Total de numeros de 3 digito: "+tresDigitos);
        System.out.println("Total de numeros de 4 digito: "+cuatroDigitos);
        System.out.println("Total de numeros de 5 digito: "+cincoDigitos);
        
        
        
    }
    
}
