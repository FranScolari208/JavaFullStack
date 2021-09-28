package Ejercicio1;

public class Perro extends Animal {
    
    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    
    @Override
    public void alimentarse() {
        System.out.println("El Perro come: "+alimento);
    }
}
