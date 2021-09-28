package Ejercicio5;

import java.util.Scanner;

/**
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante. Desarrollar el ejercicio para que las
formas implementen los métodos de la interfaz y se calcule el área y el perímetro
de los dos. En el main se crearán las formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
public class Rectangulo implements CalculosFormas{
    private Integer base;
    private Integer altura;

    public Rectangulo() {
    }

    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("INGRESE LA BASE DEL RECTANGULO");
        base = leer.nextInt();
        System.out.println("INGRESE LA ALTURA DEL RECTANGULO");
        altura = leer.nextInt();
    }

    @Override
    public void calculoDeArea() {
        Integer area = base * altura;
        System.out.println("EL AREA DEL RECTANGULO ES: "+area);
    }

    @Override
    public void calculoDePerimetro() {
        Integer perimetro = 2 * (base + altura);
        System.out.println("EL PERIMETRO DEL RECTANGULO ES: "+perimetro);
    }

    @Override
    public String toString() {
        return "RECTANGULO :::::> BASE = " + base + ", ALTURA = " + altura;
    }
    
    
    
    
}
