package Ejercicio2_y_3;

import java.util.Scanner;

/**
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:
 */
public abstract class Electrodomestico {
       
    protected Double precio;
    protected String color;
    protected Character consumo;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumo, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    
    public void crearElectrodomestico(){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese el color del electrodomestico");
        comprobarColor(leer.next());
        System.out.println("Ingrese el consumo energetico del electrodomestico");
        comprobarConsumoEnergetico(leer.next().charAt(0));
        System.out.println("Ingrese el peso del electrodomestico");
        this.peso = leer.nextInt();
        this.precio=1000.00;
        
    }
    
    public void comprobarConsumoEnergetico(Character letra){
        if(letra == 'A'||letra =='B'||letra =='C'||letra =='D'||letra =='E'||letra =='F'){
            this.consumo = letra;
        }else{
            letra = 'F';
            this.consumo = letra;
        }
    }
    
    public void comprobarColor(String color){
        String colorMin = color.toLowerCase();
        if(colorMin == "blanco"||colorMin =="negro"||colorMin =="rojo"||colorMin =="azul"||colorMin =="gris"){
            this.color = colorMin;
        }else{
            colorMin = "blanco";
            this.color = colorMin;
        }
    }
    
    public Double precioFinal(){
        Double precioBase = this.precio;
        
        switch(consumo){
            case 'A': precioBase = precioBase + 1000;
            break;
            case 'B': precioBase = precioBase + 800;
            break;
            case 'C': precioBase = precioBase + 600;
            break;
            case 'D': precioBase = precioBase + 500;
            break;
            case 'E': precioBase = precioBase + 300;
            break;
            default: precioBase = precioBase + 100;
            break;           
        }
        if(peso>=1&&peso<=19){
            precioBase = precioBase + 100;
        }else{
            if(peso>=20&&peso<=49){
                precioBase = precioBase + 500;
            }else{
                if(peso>=50&&peso<=79){
                    precioBase = precioBase + 800;
                }else{
                    if(peso>=80){
                        precioBase = precioBase + 1000;
                    }
                }
            }
        }
        return precioBase;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

    
    
}
