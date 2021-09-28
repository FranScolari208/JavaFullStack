/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

public class Velero extends Barco {
    
    protected Integer mastiles;

    public Velero() {
    }

    public Velero(Integer mastiles, Integer matricula, Integer eslora, Integer anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }
    
    @Override
    public Integer precioAlquiler(){
        Integer precioBase = super.precioAlquiler();
        Integer precioFinal = precioBase + mastiles;
        
        return precioFinal;
    }
    
    @Override
    public void crearBarco(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.println("INGRESE LA CANTIDAD DE MASTILES");
        mastiles = leer.nextInt();      
    }

    @Override
    public String toString() {
        super.toString();
        return "MASTILES = " + mastiles;
    }
    
    
}
