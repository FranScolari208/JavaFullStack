package Ejercicio9;

/**
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:

• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class MatematicaMain {
    public static void main(String[] args) {
        double numero1;
        double numero2;
        Matematica matematica;
        numero1 = Math.random()* 10 + 1;
        numero2 = Math.random()* 10 + 1;
        
        MatematicaService mateServi = new MatematicaService();
        
        matematica = mateServi.crearMatematica(numero1, numero2);
        System.out.println("Numero 1: "+matematica.getNumero1());
        System.out.println("Numero 2: "+matematica.getNumero2());
        
        double vector[] = mateServi.devolverMayor(matematica);
        System.out.println("EL NUMERO "+vector[0]+" ES MAYOR QUE EL NUMERO "+vector[1]);
        
        mateServi.calcularPotencia(matematica);
        mateServi.calcularRaiz(matematica);
    }
    
}
