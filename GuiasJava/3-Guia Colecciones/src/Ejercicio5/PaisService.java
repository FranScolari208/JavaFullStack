/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

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
public class PaisService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Pais crearPais() {
    Pais pais = new Pais();
      
    System.out.println("Ingrese el nombre del pais");
    String nombre = leer.next();
    
    pais.setNombre(nombre);
     
    return pais;

    }
    
    public void mostrarPaises(Set<Pais> paises){
        for(Pais pais : paises){
            System.out.println(" "+pais.getNombre());           
        }
        System.out.println(" ");
    }

    public void borrarPais(String pais, Set<Pais>paises){
       Iterator<Pais> it = paises.iterator();
       boolean esta = false;
       while(it.hasNext()){
           Pais aux = it.next();
           if(aux.getNombre().equalsIgnoreCase(pais)){
               it.remove();
               esta=true;
               System.out.println("El pais fue eliminado de la lista.\n");
           }
       }
       if(!esta) System.out.println("El pais no esta en la lista.\n");
   }
}
