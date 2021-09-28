package Ejercicio1;

/**
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer documento;
    private Perro perroAdoptado;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer documento, Perro perroAdoptado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perroAdoptado = perroAdoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public Perro getPerroAdoptado() {
        return perroAdoptado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public void setPerroAdoptado(Perro perroAdoptado) {
        this.perroAdoptado = perroAdoptado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + ", apellido = " + apellido + ", edad = " + edad + ", documento = " + documento + ", perroAdoptado = " + perroAdoptado + '}';
    }
    
    
}
