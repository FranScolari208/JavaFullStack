package Ejercicio5;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Set<Pais> paises = new TreeSet(Pais.compararPaisAlfabeticamente);
        PaisService paisServi = new PaisService();
        Pais pais;
        
        Character validacion = 's';
        while (validacion == 's'){          
            pais = paisServi.crearPais();
            paises.add(pais);            
            System.out.println("INGRESE UNA OPCION:");
            System.out.println("S PARA INGRESAR NUEVA PELICULA");
            System.out.println("N PARA SALIR");
            validacion = leer.next().charAt(0);
            System.out.println(" ");
        }
        
        paisServi.mostrarPaises(paises);
        
        System.out.print("\nIngrese el nombre del pais que quiere borrar: ");
        String nuevoPais = leer.next();
        
        paisServi.borrarPais(nuevoPais, paises);
    
        paisServi.mostrarPaises(paises);
   
    }
}

