
package Ejercicio4;

import java.util.Scanner;

public class Yate extends BarcosAMotor{
    
    protected Integer cantidadCamarotes;

    public Yate() {
    }

    public Yate(Integer cantidadCamarotes, Integer potencia, Integer matricula, Integer eslora, Integer anioDeFabricacion) {
        super(potencia, matricula, eslora, anioDeFabricacion);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public Integer getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(Integer cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public Integer precioAlquiler(){
        Integer precioBase = super.precioAlquiler();
        Integer precioFinal = precioBase + cantidadCamarotes;
        
        return precioFinal;
    }
    
    @Override
    public void crearBarco(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.println("INGRESE LA CANTIDAD DE CAMAROTES");
        cantidadCamarotes = leer.nextInt();      
    }

    @Override
    public String toString() {
        super.toString();
        return ", CAMAROTES = " + cantidadCamarotes;
    }
    
    
    
    
    
}
