package Ejercicio3;

/**
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
public class Operacion {
    
    private Integer numero1;
    private Integer numero2;
    
    public Operacion (Integer numero1, Integer numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        
    }
    
    public Operacion() {

    }
    
    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }
    
    public Integer getNumero2(){
        return numero2;
    }
    
    public void setNumero2(Integer numero2){
        this.numero2 = numero2;
    }
    
    public void crearOperacion(Integer numero1, Integer numero2){
        setNumero1(numero1);
        setNumero2(numero2);
    }
    
    public Integer sumar(Integer numero1, Integer numero2){
        Integer suma;
        suma = numero1 + numero2;
        return suma;
    }
    
    public Integer restar(Integer numero1, Integer numero2){
        Integer resta;
        resta = numero1 - numero2;
        return resta;
    }
    
    public Integer multiplicar(Integer numero1, Integer numero2){
        Integer multiplicacion;
        multiplicacion = numero1 * numero2;
        return multiplicacion;
    }
    
    public float dividir(Integer numero1, Integer numero2){
        float division;
        division = (float)numero1/numero2;
        return division;
    }
}
