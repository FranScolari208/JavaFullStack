package Ejercicio3;

import java.util.Scanner;

/**
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
para leer dos números en forma de cadena. A continuación, utilice el método
parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en
dos variables de tipo int. Por ultimo realizar una división con los dos numeros y
mostrar el resultado.
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
teclado puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones
 */
public class Ejercicio3Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Integer num1=0;
        Integer num2=0;
        float division = 0;

            System.out.println("Ingrese un numero");
            String numero1 = leer.next();
            System.out.println("Ingrese otro numero");
            String numero2 = leer.next();

        try{
        num1 = Integer.parseInt(numero1);
        }catch(NumberFormatException e){
            System.out.println("ERROR--->"+e.getMessage());
        }
        try{
        num2 = Integer.parseInt(numero2);
        }catch(NumberFormatException e){
            System.out.println("ERROR--->"+e.getMessage());
        }
        
        try{
           division = num1 / num2; 
        }catch(ArithmeticException e){
            System.out.println("ERROR--->"+e.getMessage());
        }
        
        try{
            System.out.println("El resultado de dividir "+num1+" por "+num2+" es: "+division);
        }catch(ArithmeticException e){
            System.out.println("ERROR--->"+e.getMessage());
        }
        
        
        
    }
    
}
