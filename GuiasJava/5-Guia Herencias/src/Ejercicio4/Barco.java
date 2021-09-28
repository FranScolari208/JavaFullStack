package Ejercicio4;

import java.util.Scanner;

/**
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:
 */
public class Barco {
    protected Integer matricula;
    protected Integer eslora;
    protected Integer anioDeFabricacion;

    public Barco() {
    }

    public Barco(Integer matricula, Integer eslora, Integer anioDeFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAnioDeFabricacion(Integer anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }
    
    public Integer precioAlquiler(){
        Integer precioAlquiler = 10 * eslora;
        return precioAlquiler;
    }
    
    public void crearBarco(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("INGRESE EL NUMERO DE LA MATRICULA");
        matricula = leer.nextInt();
        System.out.println("INGRESE LA ESLORA DEL BARCO");
        eslora = leer.nextInt();
        System.out.println("INGRESE EL AÑO DE FABRICACION");
        anioDeFabricacion = leer.nextInt();
    }

    @Override
    public String toString() {
        return "MATRICULA = " + matricula + ", ESLORA = " + eslora + ", FABRICACION = " + anioDeFabricacion+", " ;
    }
    
    
}
