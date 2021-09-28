package Ejercicio1;


/*
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el
código con una cláusula try-catch para probar la nueva excepción que debe ser
controlada.
 */
public class PersonaMain {

    public static void main(String[] args) throws Exception{

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
        
        Persona[] persona = new Persona[4];
        
        /*
        for(i=0; i<persona.length; i++){
            if(i==0){
                persona[i]= null;
            }else{
              persona[i]= personaService.crearPersona();  
            }
        }
        */
        persona[0] = new Persona("Juan", 18, 'h', 50, 1.60f);
        persona[1] = new Persona("Cecilia", 19, 'm', 50, 1.50f);
        persona[2] = new Persona("Gustavo", 20, 'o', 160, 1.70f);
        persona[3] = new Persona("Romina", 16, 'o', 63, 1.72f);
        
        
        
        for(i=0;i<persona.length; i++){
            personaService.mostrarPersona(persona[i]);
        }
        
        int[] vectorIsm = new int[4];
        
        for(i=0; i< persona.length; i++){
            vectorIsm[i] = personaService.calcularICM(persona[i]);
        }
        
        boolean[] vectorEsMayor = new boolean[4];
        
        persona[0] = null;
        
        for(i=0; i< persona.length; i++){
            try{
                vectorEsMayor[i] = personaService.esMayorDeEdad(persona[i]);
            }catch (NullPointerException e) {
                System.out.println("-> Error: " + e.getMessage() + "\n");
                continue; //Salteo esta persona
            }
            
        }
        
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
