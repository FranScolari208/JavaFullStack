package integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class PracticaEgg {

    /**
     * El programa debera tomar un numero x y determinar si es capicua o no
     * **Contemplar que el num que llega puede ser null,en caso de que sea null,
     * retornar false, en caso que sea capicua retornar true.
     *
     * @param num
     * @return esPalindromo
     */
    public Boolean numeroCapicua(Integer num) {
        Integer numero;
        Integer inverso = 0;
        if(num == null){
            return false;
        }else{
            Integer numeroParaDarVuelta = num;    
            while (numeroParaDarVuelta!=0){
            
            numero = numeroParaDarVuelta % 10;
            inverso = inverso * 10 + numero;
            numeroParaDarVuelta = numeroParaDarVuelta / 10; 
            }
                if(inverso.equals(num)){
                    return true;
                }else{
                    return false;
                }
        }
    }
    /**
     * Estamos en caramelolandia, donde estan los peores ladrones de dulces. Una
     * vez al mes, se sienta una n cantidad de ladrones en ronda, contemplando
     * al primer ladron que se sienta, como el ladron 0. A los ladrones se le
     * repartira una m cantidad de caramelos contemplando que se comenzaran a
     * repartir los caramelos desde el primer ladron (inicio). El ultimo
     * caramelo en repartirse estara podrido, determinar a que ladron, segun su
     * posicion en la ronda le tocara.
     */
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
        
        int posicionDeLaRonda = inicio;
        do{
            if(posicionDeLaRonda + 1> cantidadLadrones)
                posicionDeLaRonda = 0;
            else{
                cantidadCaramelos = cantidadCaramelos - 1;
                if(cantidadCaramelos == 0){
                    break;
                }else{
                posicionDeLaRonda = posicionDeLaRonda + 1;              
                }        
            }
        }while(cantidadCaramelos != 0);
        return posicionDeLaRonda;
    }
    /**
     * En un universo paralelo, donde los habitantes son medias, existe un
     * crucero de medias donde se sube una lista de medias. Esta lista de
     * tripulantes del crucero es una Collection de letras, lo que se debera
     * hacer, es filtrar la lista de medias que se suben al crucero y retornar
     * una lista que contenga los grupos de medias que si tenian amigas. Esta
     * lista final de medias amigas se mostraran ordenadas de menor a mayor. A
     * continuacion un ejemplo:
     *
     * List de medias que llegan : A,B,A,B,C,A,F,Z,C,H **F,Z,H no tienen amigas
     * :(. List que se deberia retornar : A,B,C
     */
    public List<String> mediasAmigas(List<String> pasajeros) {
        HashSet<String> mediasRepetidas = new HashSet();
        int i, j;
        int contador;
        
        List<String> mediasFinales = new ArrayList();
        
        for(i=0; i<pasajeros.size(); i++){
            contador = 0;
            String mediaAChequear = pasajeros.get(i);
            for(j=0; j<pasajeros.size(); j++){
                if(pasajeros.get(j).equals(mediaAChequear)){
                    contador = contador + 1; 
                }
            }
            if(contador > 1){
                mediasRepetidas.add(mediaAChequear);
            }   
        }
            for(String mediaRepe : mediasRepetidas){
                mediasFinales.add(mediaRepe);
            }
            Collections.sort(mediasFinales);
        return mediasFinales;
    }
}