package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class CineService {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public void crearCine(Cine cine){
        PeliculaService peliculaServi = new PeliculaService();
        Pelicula pelicula = peliculaServi.crearPelicula();
        Integer edadMinima = pelicula.getEdadMinima();
        System.out.println("INGRESE EL PRECIO DE LA ENTRADA");
        Double precio = leer.nextDouble();  
        List<Espectador> listaEspectadores = llenarListaEspectadores(precio, edadMinima);       
        llenarCine(cine, pelicula, listaEspectadores, precio);
        System.out.println(cine.toString());
        
        

        
    }
    public Cine llenarCine(Cine cine, Pelicula pelicula, List<Espectador> listaEspectadores, Double precio ){
    cine.setPelicula(pelicula);
    cine.setListaEspectadores(listaEspectadores);
    cine.setPrecio(precio);

    List<Asiento> listaDeAsientos = llenarAsientos(listaEspectadores);
    int i,j;
    Iterator<Asiento> it = listaDeAsientos.iterator();
        while(it.hasNext()){
            Asiento asiento = it.next();
            for(i=0; i<8; i++){
                for(j=0; j<6; j++){
                   System.out.print(asiento.toString()); 
                }
                System.out.println("");
            }
            
        }
    return cine;
    }
    
    public List<Espectador> llenarListaEspectadores(Double precio, Integer edadMinima){
    List<Espectador> listaEspectadores = new ArrayList();    
    System.out.println("INGRESE LA CANTIDAD DE ESPECTADORES");
        Integer cantidadDeEspectadores = leer.nextInt();
        Integer i;
       
           for(i=0;i<cantidadDeEspectadores; i++){
            EspectadorService espectadorServi = new EspectadorService();
            Espectador espectador = espectadorServi.crearEspectador();
            if(espectador.getEdad()>= edadMinima){
                if(espectador.getDineroDisponible()>= precio){
                    listaEspectadores.add(espectador);
                }
            }            
           }    
    return listaEspectadores;
    }
    
   
    
    public List<Asiento> llenarAsientos(List<Espectador> listaEspectadores){
        List<Asiento> listaDeAsientos = new ArrayList();
        Iterator<Espectador> iterator = listaEspectadores.iterator();
        Integer i, j;
        Integer contador = 8;
        Character letra;
        Character vacio = ' ';
        for(i=8; i>0; i--){
            
            
            for(j=0; j<6; j++){
                Asiento asiento = new Asiento();
                asiento.setNumero(i);
                switch (j){
                    case 0:asiento.setLetra('A');
                        break;
                    case 1:asiento.setLetra('B');
                        break;
                    case 2:asiento.setLetra('C');
                        break;
                    case 3:asiento.setLetra('D');
                        break;
                    case 4:asiento.setLetra('E');
                        break;
                    case 5:asiento.setLetra('F');
                        break;
                }
                
                asiento.setNumero(contador);
                asiento.setOcupado(vacio);
                System.out.print(asiento.toString());
            }
            System.out.println("");
            contador = contador - 1;
        }
        
        while(iterator.hasNext()){
            int contadorDeAsiento = 1;
            int numeroDeAsiento = (int)Math.random()*48+1;
            
            while (numeroDeAsiento>6){
                numeroDeAsiento = numeroDeAsiento -6;
                contadorDeAsiento = contadorDeAsiento +1;
            }
            
            switch (numeroDeAsiento){
                    case 1: letra = 'A';
                        break;
                    case 2: letra = 'B';
                        break; 
                    case 3: letra = 'C';
                        break;
                    case 4: letra = 'D';
                        break;
                    case 5: letra = 'E';
                        break;
                    default: letra = 'F';
                        break;
                }
            Iterator<Asiento> iteratorAsiento = listaDeAsientos.iterator();
            while(iteratorAsiento.hasNext()){
                Asiento asientoActual = iteratorAsiento.next();
                if(asientoActual.getNumero().equals(contadorDeAsiento)){
                    if(asientoActual.getLetra().equals(letra)){
                        if(asientoActual.getOcupado().equals(vacio)){
                            asientoActual.setOcupado('X');
                        }
                        
                    }
                }
            }

            
        }
        
        
   return listaDeAsientos;
 }
    
    
       
}
