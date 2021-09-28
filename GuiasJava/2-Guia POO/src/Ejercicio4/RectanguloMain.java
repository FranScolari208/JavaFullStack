package Ejercicio4;

import java.util.Scanner;

public class RectanguloMain {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Rectangulo rectangulo1 = new Rectangulo();
        
        System.out.println("Introduzca un valor para la base");
        Integer base = leer.nextInt();
        
        System.out.println("Ingrese un valor para la altura");
        Integer altura = leer.nextInt();
        
        rectangulo1.crearRectangulo(base, altura);
        rectangulo1.superficieRectangulo(base, altura);
        rectangulo1.perimetroRectangulo(base, altura);
        rectangulo1.mostrarRectangulo(base, altura);
        
    }
    
}
