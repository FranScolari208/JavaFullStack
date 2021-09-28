
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
public class Circulo implements CalculosFormas{
    
    private Integer radio;
    private Integer diametro;

    public Circulo() {
    }

    public Circulo(Integer radio, Integer diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }

    public Integer getDiametro() {
        return diametro;
    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;
    }
    
    public void crearCirculo(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("INGRESE EL RADIO DEL CIRCULO");
        radio = leer.nextInt();
        diametro = radio * 2;
    }

    @Override
    public void calculoDeArea() {
        Double area = PI * radio * radio;
        System.out.println("EL AREA DEL CIRCULO ES: "+area);
    }

    @Override
    public void calculoDePerimetro() {
        Double perimetro = PI * diametro;
        System.out.println("EL PERIMETRO DEL CIRCULO ES: "+perimetro);
    }

    @Override
    public String toString() {
        return "CIRCULO :::::> RADIO = " + radio + ", DIAMETRO = " + diametro;
    }
    
    
    
}
