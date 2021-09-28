package Ejercicio18;

/**
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        
        int i;
        int j;
        int k;
        String valorJ;
        String valorI;
        String valorK;
        
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                   for (k=0; k < 10; k++){
                       if (i == 3 ){
                           valorI = "E";
                       }else valorI = Integer.toString(i);
                       if (j == 3 ){
                           valorJ = "E";
                       }else valorJ = Integer.toString(j);
                       if (k == 3 ){
                           valorK = "E";
                       }else valorK = Integer.toString(k);
                       System.out.println(valorI+"-"+valorJ+"-"+valorK);
                   }
}
}
    }
    
}
