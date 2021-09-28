package Ejercicio4;

import java.util.Scanner;

public class BarcosAMotor extends Barco{
    
    protected Integer potencia;

    public BarcosAMotor() {
    }

    public BarcosAMotor(Integer potencia, Integer matricula, Integer eslora, Integer anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }
    
    @Override
    public Integer precioAlquiler(){
        Integer precioBase = super.precioAlquiler();
        Integer precioFinal = precioBase + potencia;
        
        return precioFinal;
    }
    
    @Override
    public void crearBarco(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.println("INGRESE LA POTENCIA");
        potencia = leer.nextInt();      
    }

    @Override
    public String toString() {
        super.toString();
        return "POTENCIA = " + potencia;
    }
    
    
    
}
