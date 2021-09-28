package Ejercicio2;

import java.util.Scanner;

public class PersonaArray {
    
    private String nombre;
    private Integer edad;
    private Integer[] numerosFavoritos = new Integer[4];

    public PersonaArray() {
    }

    public PersonaArray(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer[] getNumerosFavoritos() {
        return numerosFavoritos;
    }

    public void setNumerosFavoritos(Integer[] numerosFavoritos) {
        this.numerosFavoritos = numerosFavoritos;
    }
    
    public void crearPersona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre");
        nombre = leer.next();
        System.out.println("Ingrese la edad");
        edad = leer.nextInt();
        crearArray();
        
    }
    
    public void crearArray(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int i;
        for(i=0; i<4; i++){
            System.out.println("Ingrese un numero favorito");
            numerosFavoritos[i] = leer.nextInt();
        }
    }
    
    public void mostrarArray(){
        int i;
        for(i=0; i<10; i++){
            System.out.print(numerosFavoritos[i]+" ");
            
        }
    }
    
}
