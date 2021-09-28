package Ejercicio2_y_3;

import java.util.Scanner;

public class Televisor extends Electrodomestico {
    protected Integer pulgadas;
    protected Boolean sintonizador;

    public Televisor() {

    }

    public Televisor(Integer pulgadas, Boolean sintonizador, Double precio, String color, Character consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del televisor");
        this.pulgadas = leer.nextInt();
        System.out.println("Ingrese si el televisor tiene sintonizador si/no");
        Character opcion = leer.next().charAt(0);
        if(opcion=='s'){
            this.sintonizador = true;
        }else{
            if(opcion=='n'){
                this.sintonizador = false;
            }
        }
    }
    
    @Override
    public Double precioFinal(){
        Double precioBase = super.precioFinal();
        
        if(pulgadas>=40){
            precioBase = precioBase + precioBase *0.3;
        }
        if(sintonizador==true){
            precioBase = precioBase + 500;
        }
        return precioBase;
    }
    
}
