/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2_y_3;

import java.util.Scanner;

/**

Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.
 */
public class Lavadora extends Electrodomestico {
    protected Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(Integer carga, Double precio, String color, Character consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      crearElectrodomestico();
      System.out.println("Ingrese la carga de la lavadora");
      this.carga = leer.nextInt();
       
    }
    
    @Override
    public Double precioFinal(){
        Double precioBase = super.precioFinal();
        
        if(carga>30){
            precioBase = precioBase + 500;
        }
        return precioBase;
    }
    
}
