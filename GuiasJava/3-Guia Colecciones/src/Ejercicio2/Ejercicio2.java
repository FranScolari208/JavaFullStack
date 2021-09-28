package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        List<String> perros = new ArrayList();
        int i = 1;
        Character validacion = 'a';
        
        System.out.println("BIENVENIDO AL ARRAY DE PERROS");
        
        while (validacion == 'a'){
            System.out.println("INGRESE UNA RAZA DE PERRO");
            String nuevoPerro = leer.next();
            perros.add(nuevoPerro);
            
            System.out.println("INGRESE UNA OPCION:");
            System.out.println("OPCION (A) NUEVO PERRO");
            System.out.println("OPCION (B) SALIR");
            validacion = leer.next().charAt(0);
            System.out.println(" ");
        }
 
        System.out.println("LOS PERROS INGRESADOS SON LOS SIGUIENTES: ");
        for (String todosLosPerros : perros){
            
            System.out.println(i+")"+" "+todosLosPerros.toUpperCase());
            
            i++;
        }
        
        Iterator<String> iterator = perros.iterator();
        
        System.out.println("INGRESE UN PERRO PARA BUSCAR EN LA LISTA");
        String perroBuscado = leer.next();
        
        boolean contador = false;
        i =1;
        while(iterator.hasNext()){
            
            String perroActual = iterator.next();
            
            if (perroActual.equals(perroBuscado)){
                contador = true;
                iterator.remove();
                
            }

        }
        
        if (contador == true){
            System.out.println("SE ENCONTRO EL PERRO INGRESADO");
        }else System.out.println("NO SE ENCONTRO EL PERRO INTRODUCIDO");
        
        
       Collections.sort(perros); 
       for (String todosLosPerros : perros){
            
            System.out.println(i+")"+" "+todosLosPerros.toUpperCase());
            
            i++;
        }
      
    }
    
    
}
