package Ejercicio2;

/**
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
código para generar y capturar una excepción ArrayIndexOutOfBoundsException
(índice de arreglo fuera de rango).
 */
public class Ejercicio2Main {
    public static void main(String[] args) {
       PersonaArray persona = new PersonaArray();
       
       persona.crearPersona();
       try{
           persona.mostrarArray();
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("ERROR:::::> "+e.getMessage());
       }
       
    }
    
}
