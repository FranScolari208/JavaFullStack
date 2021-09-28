package Ejercicio8;

import java.util.Scanner;

/**
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
public class CadenaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cadena crearCadena() {
     
     System.out.println("Ingrese una palabra o frase");
     String frase = leer.next();
     
     Integer largo = frase.length();
        
    Cadena cadena = new Cadena();
    
    cadena.setFrase(frase);
    cadena.setLongitud(largo);
      
    return cadena;

    }
    
    public void mostrarVocales(Cadena cadena){
        int cantidad = 0;
        int i;
        int longitud = cadena.getLongitud();
        String frase = cadena.getFrase().toLowerCase();
        
         for (i=0; i<longitud; i++){
            if(frase.substring(i, i+1).equals("a")||frase.substring(i, i+1).equals("e")||frase.substring(i, i+1).equals("i")||frase.substring(i, i+1).equals("o")||frase.substring(i, i+1).equals("u")){
               cantidad++; 
            }
         }
        System.out.println("LA FRASE TIENE "+cantidad+" VOCALES");
    }
    
    public void invertirFrase(Cadena cadena){
        
        int longitud = cadena.getLongitud();
        String frase = cadena.getFrase();
        String fraseInvertida = "";
        int i;
        
        for (i = longitud ; i > 0; i--){
            fraseInvertida = fraseInvertida.concat(frase.substring(i-1, i));
        }
        System.out.println(fraseInvertida);
        
        
    }

    
    public void vecesRepetido(Cadena cadena){
        
        String caracter;
        int longitud = cadena.getLongitud();
        String frase = cadena.getFrase().toLowerCase();
        int i;
        int cantidad = 0;
        
        System.out.println("Ingrese un caracter");
        caracter = leer.next();
        
        for (i=0; i<longitud; i++){
            if(frase.substring(i, i+1).equals(caracter)){
                
               cantidad++; 
            }
        }
        System.out.println("SE REPITE "+cantidad+" VECES");
    }
    
    public void compararLongitud(Cadena cadena){
        
        String nuevaFrase;
        
        System.out.println("Ingrese una nueva frase para comparar");
        nuevaFrase = leer.next();
        if(cadena.getLongitud() > nuevaFrase.length()){
            System.out.println("LA FRASE QUE INGRESO ES MAS CORTA QUE SU FRASE ORIGINAL");
        }else System.out.println("LA FRASE QUE INGRESO ES MAS LARGA O IGUAL QUE SU FRASE ORIGINAL");        
    }
    
    
    public void unirFrases(Cadena cadena){
        String nuevaFrase;
        
        System.out.println("Ingrese una nueva frase para concatenar");
        nuevaFrase = leer.next();
        String frase = cadena.getFrase();
        System.out.println("LA NUEVA FRASE ES: "+ frase.concat(nuevaFrase));
    }
    
    
    public void reemplazar(Cadena cadena){
        Character letra;
        
        System.out.println("Ingrese un caracter");
        letra = leer.next().charAt(0);
        String frase = cadena.getFrase();
        int longitud = cadena.getLongitud();
        int i;
        
        Character[] vector = new Character[longitud];
        
        for(i=0; i<longitud; i++){
            if(((frase.substring(i,i+1))).charAt(0) == 'a'){
                vector[i] = letra;
            }else vector[i]=frase.substring(i,i+1).charAt(0);
            System.out.print(vector[i]);
        }
        System.out.println(" ");
    }
    
    
    public void contiene(Cadena cadena){
        Character letra;
        
        System.out.println("Ingrese una letra");
        letra = leer.next().charAt(0);
        boolean validacion = false;
        String frase = cadena.getFrase();
        int longitud = cadena.getLongitud();
        int i;
        
        for (i=0; i<longitud; i++){
            if (frase.substring(i,i+1).charAt(0) == letra){
                validacion = true;
            }
                
        }
        System.out.println(validacion);
    }
}
