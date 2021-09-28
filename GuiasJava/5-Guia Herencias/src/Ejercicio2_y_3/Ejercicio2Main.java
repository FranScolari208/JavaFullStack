package Ejercicio2_y_3;

import java.util.ArrayList;
import java.util.List;

/**
Siguiendo el ejercicio anterior, en el main vamos a crear un arrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores, por un lado, el de las lavadoras por
otro, y al final, la suma del precio de todos los Electrodomésticos. Por ejemplo, si
tenemos una lavadora con un precio de 2000 y un televisor de 5000, el resultado
final será de 7000 (2000+5000) para electrodomésticos, 2000 para lavadora y
5000 para televisor.
 */
public class Ejercicio2Main {
    public static void main(String[] args) {
       
        Lavadora lavadora = new Lavadora();
        Televisor televisor = new Televisor();
        lavadora.crearLavadora();
        televisor.crearTelevisor();
        Double precioLavadora = lavadora.precioFinal();
        System.out.println("EL PRECIO FINAL DE LA LAVADORA ES: "+precioLavadora);
        
        Double precioTelevisor = televisor.precioFinal();
        System.out.println("EL PRECIO FINAL DEL TELEVISOR ES: "+precioTelevisor);
        
        List<Electrodomestico> listaDeElectrodomesticos = new ArrayList();
        
        listaDeElectrodomesticos.add(lavadora);
        listaDeElectrodomesticos.add(televisor);
        listaDeElectrodomesticos.add(new Lavadora(31, 1000.00, "gris", 'B', 30));
        listaDeElectrodomesticos.add(new Televisor(50, true, 1000.00, "blanco", 'A', 80));
        
        Double dineroElectrodomestico = 0.0;
        Double dineroLavadoras = 0.0;
        Double dineroTelevisores = 0.0;
        for (Electrodomestico electrodomesticoActual : listaDeElectrodomesticos){
            
            if (electrodomesticoActual instanceof Lavadora){
                dineroLavadoras = dineroLavadoras + electrodomesticoActual.precioFinal();
            }else{
                if(electrodomesticoActual instanceof Televisor){
                    dineroTelevisores = dineroTelevisores + electrodomesticoActual.precioFinal();
                }
            }
            
            dineroElectrodomestico = dineroElectrodomestico + electrodomesticoActual.precioFinal();
        }
        System.out.println("****************************************************************");
        System.out.println("EL PRECIO FINAL DE LAS LAVADORAS ES: "+dineroLavadoras);
        System.out.println("EL PRECIO FINAL DE LOS TELEVISORES ES: "+dineroTelevisores);
        System.out.println("EL PRECIO FINAL DE LOS ELECTRODOMESTICOS ES: "+dineroElectrodomestico);
        
        
        
    }
    
}
