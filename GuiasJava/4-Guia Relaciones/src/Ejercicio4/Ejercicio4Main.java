package Ejercicio4;

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
public class Ejercicio4Main {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        BarajaService barajaServi = new BarajaService();
        Baraja baraja = barajaServi.crearBaraja();
        int numero = 0;
        do{
        System.out.println("BIENVENIDO AL MAZO COPADOOO");
        System.out.println("ELIJA SU OPCION");
        System.out.println("1)BARAJAR");
        System.out.println("2)SIGUIENTE CARTA");
        System.out.println("3)CARTAS DISPONIBLES");
        System.out.println("4)DAR CARTAS");
        System.out.println("5)MOSTRAR MONTON");
        System.out.println("6)MOSTRAR BARAJA");
        System.out.println("7)SALIR");
        numero = leer.nextInt();
        if(numero !=1 &&numero !=2&&numero !=3&&numero !=4&&numero !=5&&numero !=6&&numero !=7){
            System.out.println("ERROR INGRESE NUEVAMENTE SU OPCION");
        }
        switch (numero){
            case 1: barajaServi.barajar(baraja);
            break;
            case 2: barajaServi.siguienteCarta(baraja);
            break;
            case 3: barajaServi.cartasDisponibles(baraja);
            break;
            case 4: barajaServi.darCartas(baraja);
            break;
            case 5: barajaServi.mostrarMonton(baraja);
            break;
            case 6: barajaServi.mostrarBaraja(baraja);
            break;

            default: break;
        }
        }while (numero != 7);
        
    }
    
}
