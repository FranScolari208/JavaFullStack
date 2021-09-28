package Ejercicio7;

/**

• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
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
