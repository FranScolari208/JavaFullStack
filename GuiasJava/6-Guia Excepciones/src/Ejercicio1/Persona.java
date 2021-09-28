package Ejercicio1;

/**
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el
código con una cláusula try-catch para probar la nueva excepción que debe ser
controlada.
 */
public class Persona {
 
        private String nombre;
        private Integer edad;
        private Character sexo;
        private Integer peso;
        private Float altura;

    public Persona(String nombre, Integer edad, Character sexo, Integer peso, Float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public Character getSexo() {
        return sexo;
    }

    public Integer getPeso() {
        return peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
        
        
}
