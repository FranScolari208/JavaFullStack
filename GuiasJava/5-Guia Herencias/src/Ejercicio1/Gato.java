package Ejercicio1;

public class Gato extends Animal {

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }


    @Override
    public void alimentarse() {
        System.out.println("El Gato come: "+alimento);
    }
    
}
