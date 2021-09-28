/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Ejercicio2;

import static java.lang.Math.PI;

public class Circunferencia {
     private Integer radio;

    public Circunferencia (Integer radio) {
        this.radio = radio;
        
    }
    
    public Circunferencia() {

    }
    
    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(Integer radio) {
        setRadio(radio);
    }
    
    public void area(Integer radio){
        double area;
        area = PI * radio ;
        System.out.println("El area de la circunferencia es: "+area);
    }
    
    public void perimetro(Integer radio){
        double perimetro;
        perimetro = 2 * PI * radio;
        System.out.println("El perimetro de la circunferencia es: "+perimetro);
    }

}