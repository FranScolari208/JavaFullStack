
package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

/**
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número
entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta
clase debe contener un método toString() que retorne el número de carta y el palo. La
baraja estará compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no
haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
número de cartas. En caso de que haya menos cartas que las pedidas, no
devolveremos nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
ninguna indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una
carta y luego se llama al método, este no mostrara esa primera carta.
 */
public class BarajaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Baraja crearBaraja(){
        Baraja baraja = new Baraja();
        CartaService cartaServi = new CartaService();
        Carta carta;
        HashSet<Carta> listaDeCartas = baraja.getBaraja();
        List<Carta> mazo = new ArrayList();
        do{
            carta = cartaServi.crearCarta();
            listaDeCartas.add(carta);
        }while (listaDeCartas.size()<40);
        baraja.setBaraja(listaDeCartas);
        baraja.setMonton(mazo);
        baraja.toString();
        System.out.println("TOTAL LISTA DE CARTAS: "+listaDeCartas.size());
        return baraja;
    }
    
    public void barajar(Baraja baraja){
        //NO HACE NADA PQ NO SE PUEDE DESORDENAR UN HASHSET
       
    }
    public void siguienteCarta(Baraja baraja){
        HashSet<Carta> listaDeCartas = baraja.getBaraja();
        List<Carta> mazo = baraja.getMonton();
        Iterator<Carta> iterator = listaDeCartas.iterator();
        Carta cartaActual = iterator.next();
        iterator.remove();
        mazo.add(cartaActual);
        
}
    
    public void mostrarBaraja(Baraja baraja){
        HashSet<Carta> listaDeCartas = baraja.getBaraja();
        Iterator<Carta> iterator = listaDeCartas.iterator();

        while (iterator.hasNext()){  
        Carta cartaActual = iterator.next();
            System.out.println(cartaActual.toString());
        }
    }
    
    public void cartasDisponibles(Baraja baraja){
        HashSet<Carta> listaDeCartas = baraja.getBaraja();
        Integer cartasDisponibles = listaDeCartas.size();
        System.out.println("LA CANTIDAD DE CARTAS DISPONIBLES SON: "+cartasDisponibles);
    }
    
    public void darCartas(Baraja baraja){
        System.out.println("INSERTE UNA CANTIDAD DE CARTAS A RETIRAR");
        Integer cartasADar = leer.nextInt();
        HashSet<Carta> listaDeCartas = baraja.getBaraja();
        List<Carta> mazo = baraja.getMonton();
         for (int i = 0; i < cartasADar; i++) {
            if (baraja.getBaraja().size()>0){
                siguienteCarta(baraja);
            }else{
                System.out.println("No quedan más cartas disponibles");
                break;
            }
        }
    }
        
    
    
    public void mostrarMonton(Baraja baraja){
        List<Carta> monton = baraja.getMonton();
        Iterator<Carta> iterator = monton.iterator();
        
        while (iterator.hasNext()){
        Carta cartaActual = iterator.next();
            System.out.println(cartaActual.toString());
        }
        if(monton.size()==0){
            System.out.println("NO HAY CARTAS EN EL MONTON");
        }
    }
    
}
