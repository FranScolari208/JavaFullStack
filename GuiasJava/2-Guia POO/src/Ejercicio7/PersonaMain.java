package Ejercicio7;


/**

• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
public class PersonaMain {

    public static void main(String[] args) {

        int i;
        int pesoIdeal = 0;
        int pesoAlto = 0;
        int pesoBajo = 0;
        int esMayor = 0;
        int esMenor = 0;
        Float porcentajePesoIdeal;
        Float porcentajePesoAlto;
        Float porcentajePesoBajo;
        Float porcentajeEsMayor;
        Float porcentajeEsMenor;       
        
        PersonaService personaService = new PersonaService();

        
        Persona persona1;
        Persona persona2;
        Persona persona3;
        Persona persona4;
        
        persona1 = personaService.crearPersona();
        persona2 = personaService.crearPersona();
        persona3 = personaService.crearPersona();
        persona4 = personaService.crearPersona();
        
        personaService.mostrarPersona(persona1);
        personaService.mostrarPersona(persona2);
        personaService.mostrarPersona(persona3);
        personaService.mostrarPersona(persona4);
        
        int[] vectorIsm = new int[4];
        vectorIsm[0] = personaService.calcularICM(persona1);
        vectorIsm[1] = personaService.calcularICM(persona2);
        vectorIsm[2] = personaService.calcularICM(persona3);
        vectorIsm[3] = personaService.calcularICM(persona4);
        
        boolean[] vectorEsMayor = new boolean[4];  
        vectorEsMayor[0] = personaService.esMayorDeEdad(persona1);
        vectorEsMayor[1] = personaService.esMayorDeEdad(persona2);
        vectorEsMayor[2] = personaService.esMayorDeEdad(persona3);
        vectorEsMayor[3] = personaService.esMayorDeEdad(persona4);
        
        for (i=0; i<4; i++){
            switch (vectorIsm[i]){
                case -1: pesoIdeal = pesoIdeal + 1;
                break;
                case 0: pesoBajo = pesoBajo + 1;
                break;
                case 1: pesoAlto = pesoAlto + 1;
                break;                   
            }
        }
        
        porcentajePesoIdeal = ((float)pesoIdeal * 100)/ 4;
        porcentajePesoAlto = ((float)pesoAlto * 100)/ 4;
        porcentajePesoBajo = ((float)pesoBajo * 100)/ 4;
        
        for (i=0; i<4; i++){
            if(vectorEsMayor[i]==true){
                esMayor = esMayor + 1;
                              
            }else esMenor = esMenor + 1;
        }
        
        porcentajeEsMayor = ((float)esMayor * 100)/ 4;
        porcentajeEsMenor = ((float)esMenor * 100)/ 4;
        
        System.out.println("EL PORCENTAJE DE PERSONAS CON PESO IDEAL ES: "+porcentajePesoIdeal+"%");
        System.out.println("EL PORCENTAJE DE PERSONAS CON PESO ALTO ES: "+porcentajePesoAlto+"%");
        System.out.println("EL PORCENTAJE DE PERSONAS CON PESO BAJO ES: "+porcentajePesoBajo+"%");
        System.out.println("EL PORCENTAJE DE PERSONAS MAYORES: "+porcentajeEsMayor+"%");
        System.out.println("EL PORCENTAJE DE PERSONAS MENORES: "+porcentajeEsMenor+"%");
    }
    
}
