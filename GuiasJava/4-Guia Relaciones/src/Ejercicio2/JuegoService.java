package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
public class JuegoService {
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
    public void crearJuego(Juego juego){
           System.out.println("INGRESE LA CANTIDAD DE JUGADORES");
           Integer jugadores = leer.nextInt();
           Integer i;
           List<Jugador> listaJugadores = new ArrayList();
           for(i=0;i<jugadores; i++){
            JugadorService jugadorServi = new JugadorService();
            Jugador jugador = jugadorServi.crearJugador(i);
            listaJugadores.add(jugador);
               System.out.println(jugador.getNombre()+"AGREGADO");
           }
           RevolverService revolverServi = new RevolverService();
           
           Revolver revolver = revolverServi.llenarRevolver();
           llenarJuego(juego, listaJugadores, revolver);
           
    }
    
 
    public Juego llenarJuego(Juego juego, List<Jugador> listaJugadores, Revolver pistola){
        juego.setListaJugadores(listaJugadores);
        juego.setRevolver(pistola);
        System.out.println("LLENE EL JUEGO");
        return juego;
    }
    
    public Boolean ronda(Jugador jugador, Revolver pistola){
        System.out.println("DISPARO 1 VEZ");
        System.out.println(pistola.getPosicionActual());
        
        return jugador.disparo(pistola, jugador);
        
    }
    
    public void jugarJuego(){
        
        Juego juego = new Juego();
        crearJuego(juego);
        Boolean validacion = false;
        Integer contador = 0;
        
        List<Jugador> listaDeJugadores = juego.getListaJugadores();
        System.out.println("LISTA DE JUGADORES CREADA: "+juego.toString());
        Revolver revolver = juego.getRevolver();
        
        while(validacion==false){
            
        Iterator <Jugador> iterator = listaDeJugadores.iterator();    
                
            while(iterator.hasNext()){
            
            Jugador jugadorActual = iterator.next();
            contador = contador + 1;
            
            if (ronda(jugadorActual, revolver)){
                
                System.out.println("EL JUGADOR MOJADO ES EL JUGADOR: "+jugadorActual.toString());
                System.out.println("EN LA RONDA: "+contador);
                validacion = true;
                break;
                
            }else{
                System.out.println("EL JUGADOR: "+jugadorActual.getId()+" SAFO");
            }
            }
            
        }
        
        
    }
}

//si ronda da true ---> termina el juego e imprimir el jugador
//si ronda da false----> otra ronda hasta q de true