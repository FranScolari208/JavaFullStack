package jpa.principal;

import jpa.excepcion.MiExcepcion;
import jpa.menu.Menu;

public class LibreriaJPA {

    public static void main(String[] args)throws MiExcepcion {
    try{  
        Menu menu = new Menu();
        menu.interfaz();
    }catch (Exception e) {
            e.printStackTrace();
            throw new MiExcepcion("ERROR EN EJECUTAR EL APLICATIVO");
    }
        
    }
    
}
