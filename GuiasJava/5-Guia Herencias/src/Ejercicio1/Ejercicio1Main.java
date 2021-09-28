package Ejercicio1;

/**
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:
 */
public class Ejercicio1Main {
    public static void main(String[] args) {
        Animal perro = new Perro("Stitch", "Carnivoro", 15, "Doberman");
        perro.alimentarse();
        
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.alimentarse();
        
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.alimentarse();
        
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.alimentarse();
        
    }
    
}
