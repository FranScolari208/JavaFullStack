package Ejercicio4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
devolución, la posición del amarre y el barco que lo ocupará.
 */
public class Alquiler {
    
    protected String nombreCliente;
    protected long dniCliente;
    protected Date fechaAlquiler;
    protected Date fechaDevolucion;
    protected Integer posicionAmarre;
    protected Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, long dniCliente, Date fechaAlquiler, Date fechaDevolucion, Integer posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    public void crearAlquiler(){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("INGRESE EL NOMBRE DEL CLIENTE");
        nombreCliente = leer.next();
        System.out.println("INGRESE EL DNI DEL CLIENTE");
        dniCliente = leer.nextInt();
        System.out.println("INGRESE LA FECHA DE ALQUILER DD/MM/YYYY");
        String fecha = leer.next();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); //Creo el frmato fecha
        Date testDate = null;
        String date = fecha;
        try{
            testDate = df.parse(date);
        } catch (Exception e){ System.out.println("invalid format");}
        fechaAlquiler = testDate;        
        System.out.println("INGRESE LA FECHA DE DEVOLUCION DD/MM/YYYY");
        String fechaDevolucio = leer.next();
        try{
            testDate = df.parse(fechaDevolucio);
        } catch (Exception e){ System.out.println("invalid format");}
        fechaDevolucion = testDate;
        System.out.println("INGRESE UNA POSICION DE AMARRE");
        posicionAmarre = leer.nextInt();
        
        System.out.println("ELIJA UNA OPCION DE BARCO");
        System.out.println("1)BARCO NORMAL");
        System.out.println("2)BARCO ESPECIAL");
        Integer opcion = leer.nextInt();
        if(opcion == 1){
            Barco barcoNormal = new Barco();
            barcoNormal.crearBarco();
            setBarco(barcoNormal);           
        }else{
            System.out.println("INGRESE QUE TIPO DE BARCO ES");
            System.out.println("1)VELERO");
            System.out.println("2)BARCO A MOTOR");
            System.out.println("3)YATE");
            opcion = leer.nextInt();
            if(opcion == 1){
                Velero velero = new Velero();
                velero.crearBarco();
                setBarco(velero);
            }else if(opcion == 2){
                BarcosAMotor barcoMotorizado = new BarcosAMotor();
                barcoMotorizado.crearBarco();
                setBarco(barcoMotorizado);
            }else{
                Yate yate = new Yate();
                yate.crearBarco();
                setBarco(yate);
            }
        }
    }
    
    public Integer precioAlquiler(){
        int dias = (int) ((getFechaDevolucion().getTime() - getFechaAlquiler().getTime()) / 86400000);
        System.out.println(dias);

        Integer moduloDelBarco = barco.precioAlquiler();

        Integer precio = dias * moduloDelBarco;
        
        return precio;
    }
    @Override
    public String toString() {
        return "CLIENTE = " + nombreCliente + ", DNI = " + dniCliente + ", FECHA = " + fechaAlquiler + ", DEVOLUCION = " + fechaDevolucion + ", AMARRE = " + posicionAmarre +", "+ barco ;
    }
    
}
