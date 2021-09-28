
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

public class CuentaBancariaMain {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int opcion;
        CuentaBancariaService cuentaService = new CuentaBancariaService();
        CuentaBancaria cuenta;
        
        System.out.println("Introduzca el numero de la cuenta bancaria");
        Integer numeroCuenta = leer.nextInt();
        
        System.out.println("Introduzca su numero de DNI");
        Integer dni = leer.nextInt();
        
        System.out.println("Ingrese Saldo Actual");
        Float saldoActual = leer.nextFloat();
        
        cuenta = cuentaService.crearCuenta(numeroCuenta, dni, saldoActual);
        do{
            System.out.println("BIENVENIDO AL BANCO");
            System.out.println("OPERACIONES DISPONIBLES:");
            System.out.println(" 1) DEPOSITAR \n 2) RETIRAR \n 3) EXTRACCION RAPIDA \n 4) CONSULTAR SALDO \n 5) CONSULTAR DATOS \n 6) SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1: cuentaService.deposito(cuenta);
                break;
                case 2: cuentaService.retiro(cuenta);
                break;
                case 3: cuentaService.extraccionRapida(cuenta);
                break;
                case 4: cuentaService.consultarSaldo(cuenta);
                break;
                case 5: cuentaService.consultarDatos(cuenta);
                break;
                default: opcion = 6;
            }
        }while(opcion != 6 );
       
        
        
        
        

    }

    
    
}
