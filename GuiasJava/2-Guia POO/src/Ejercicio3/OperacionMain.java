package Ejercicio3;

import java.util.Scanner;

/**
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
public class OperacionMain {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         Operacion operacion1 = new Operacion();
         
         Integer suma;
         Integer resta;
         Integer multiplicacion;
         float division;
         
        System.out.println("Ingrese un numero");
        Integer numero1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero");
        Integer numero2 = leer.nextInt();
        
        
        operacion1.crearOperacion(numero1, numero2);
        
        suma = operacion1.sumar(numero1, numero2);
        System.out.println("La suma de ambos numeros es: "+suma);
        
        resta = operacion1.restar(numero1, numero2);
        System.out.println("La resta de ambos numeros es: "+resta);
        
        multiplicacion = operacion1.multiplicar(numero1, numero2);
        System.out.println("La multiplicacion de ambos numeros es: "+multiplicacion);
         
        division = operacion1.dividir(numero1, numero2);
        System.out.println("La division de ambos numeros es: "+division);
    }
    
}
