package Ejercicio9;

/**
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:

20
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class MatematicaService {
    
    public Matematica crearMatematica(double numero1, double numero2) {
 
    
    Matematica matematica = new Matematica();
    
    matematica.setNumero1(numero1);
    matematica.setNumero2(numero2);

    
    return matematica;

    }
    
    public double[] devolverMayor(Matematica matematica){
        
        double[] vector = new double[2];
        
        if(matematica.getNumero1()>matematica.getNumero2()){
            
            double numeroMayor = matematica.getNumero1();
            double numeroMenor = matematica.getNumero2();
            
            vector[0]= numeroMayor;
            vector[1]= numeroMenor;
            
            return vector;
        }else{
            
            double numeroMayor = matematica.getNumero2();
            double numeroMenor = matematica.getNumero1();
            
            vector[0]= numeroMayor;
            vector[1]= numeroMenor;
            
            return vector;
        }
    }
    
    public void calcularPotencia(Matematica matematica){
        
        double vector[] = devolverMayor(matematica);
        
        int numeroMayor = (int)Math.round(vector[0]);
        int numeroMenor = (int)Math.round(vector[1]);
        
        System.out.println(numeroMayor+" ELEVADO A "+numeroMenor+" ES = "+(int)Math.pow(numeroMayor,numeroMenor));
        
    }
    
    public void calcularRaiz(Matematica matematica){
        
        double vector[] = devolverMayor(matematica);
        int numeroMenor = (int)Math.round(vector[1]);
        double raizCuadrada = Math.sqrt(numeroMenor);
        
        System.out.println("LA RAIZ CUADRADA DE "+numeroMenor+" ES "+raizCuadrada);
    }
}
