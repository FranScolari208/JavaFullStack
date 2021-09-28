
package Ejercicio5;
/**
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
import java.util.Scanner;

public class CuentaBancariaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public CuentaBancaria crearCuenta(Integer numeroCuenta, Integer dni, Float saldoActual) {
    
    CuentaBancaria cuenta = new CuentaBancaria();
    
    cuenta.setNumeroCuenta(numeroCuenta);
    cuenta.setDni(dni);
    cuenta.setSaldoActual(saldoActual);
    
    return cuenta;
    
    }
    
    public void deposito(CuentaBancaria cuenta){
        System.out.println("Ingrese un valor a sumar");        
        cuenta.setSaldoActual(cuenta.getSaldoActual() + leer.nextFloat()); 
    }
    
    public void retiro(CuentaBancaria cuenta){
        System.out.println("Ingrese un monto a retirar");
        cuenta.setSaldoActual(cuenta.getSaldoActual() - leer.nextFloat());   
    }
    
    public void extraccionRapida(CuentaBancaria cuenta){
        Float monto;
        do{
        System.out.println("Ingrese porcentaje a retirar");
        monto = leer.nextFloat();
        }while (monto > 20);
        
        Float porcentaje = 1 - (monto/100);
        cuenta.setSaldoActual((cuenta.getSaldoActual()) * porcentaje );   
    }

    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println(" ");
        System.out.println("SALDO ACTUAL: "+cuenta.getSaldoActual());
        System.out.println(" ");
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println(" ");
        System.out.println("NUMERO DE CUENTA : "+cuenta.getNumeroCuenta()+"\nDNI: "+cuenta.getDni()+"\nSALDO ACTUAL: "+cuenta.getSaldoActual());
        System.out.println(" ");
    }
}
