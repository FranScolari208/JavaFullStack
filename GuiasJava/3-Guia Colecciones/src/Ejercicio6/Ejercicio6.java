package Ejercicio6;

import java.util.Scanner;

/**
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        int validacion = 0;
        ProductoService productoServi = new ProductoService();
        Producto producto;
        
        productoServi.cargarProductos();
        while(validacion !=5){
            System.out.println("BIENVENIDO A LA PROVEEDURIA");
            System.out.println("ELIJA UNA OPCION");
            System.out.println("1) AGREGAR PRODUCTO");
            System.out.println("2) MODIFICAR PRECIO");
            System.out.println("3) ELIMINAR PRODUCTO");
            System.out.println("4) MOSTRAR PRODUCTOS");
            System.out.println("5) SALIR");
            
            validacion = leer.nextInt();
            switch (validacion){
                case 1: productoServi.crearProducto();
                        break;
                case 2: productoServi.modificarProducto();
                        break;
                case 3: productoServi.eliminarProducto();
                        break;
                case 4: productoServi.mostrarProductos();
                        break;
                case 5: 
                    break;
                default : validacion = 5;
                    break;
                    
            }
        }
    }
    
}
