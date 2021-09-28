package Ejercicio6;

import java.util.Scanner;

/**
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class CafeteraService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera crearCafetera(Integer capacidadMaxima, Integer capacidadActual) {
    
    Cafetera maquina = new Cafetera();
    
    maquina.setCapacidadMaxima(capacidadMaxima);
    maquina.setCapacidadActual(capacidadActual);
    
    return maquina;
    
    }
    
    public void llenarCafetera(Cafetera maquina){
        maquina.setCapacidadActual(maquina.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera maquina){
        Float taza;
        System.out.println("Ingrese el tamaño de la taza q desea llenar");
        taza = leer.nextFloat();
        
        if (maquina.getCapacidadActual() < taza){
            Float porcentaje = (maquina.getCapacidadActual() * 100) / (taza);
            System.out.println("LA TAZA SE LLENO UN "+porcentaje+"%");
            
        } else System.out.println("LA TAZA ESTA LLENA");
    }
    
    public void vaciarCafetera(Cafetera maquina){
        maquina.setCapacidadActual(0);
    }
    
    public void agregarCafe(Cafetera maquina){
        System.out.println("Ingrese una cantidad de cafe a ingresar a la cafetera");
        maquina.setCapacidadActual(maquina.getCapacidadActual() + leer.nextInt());
    }
    
}
