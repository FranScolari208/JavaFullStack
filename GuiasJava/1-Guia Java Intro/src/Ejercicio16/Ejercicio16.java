package Ejercicio16;

import java.util.Scanner;

/**
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
public class Ejercicio16 {
        public static void main(String[] args) {
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        
        int numero;
        int suma = 0;
        int contador = 0;
        
            do{
                System.out.println("Ingrese un valor");
                numero = leer.nextInt();
                if (numero >= 0){
                    suma = suma + numero;
                }               
                contador = contador + 1;
            }while ((numero != 0) && (contador < 20));
            
            if (numero == 0){
                System.out.println("Se capturo el numero 0");
            }
         System.out.println("EL resultado de la suma de los numeros ingresados es: "+suma);
    }
    
}
