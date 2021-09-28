package Ejercicio6;

import java.util.HashMap;
import java.util.Iterator;
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
public class ProductoService {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    private HashMap<String, Producto> productos = new HashMap();
    
    public void crearProducto(){
        Producto producto = new Producto();
        System.out.println("INGRESE EL NOMBRE DEL PRODUCTO");
        String nombre = leer.next();
        producto.setNombreProducto(nombre);
        System.out.println("INGRESE EL PRECIO DEL PRODUCTO");
        Double precio = leer.nextDouble();
        producto.setPrecioProducto(precio);
        
        productos.put(producto.getNombreProducto(), producto);
               
    }
    
    public void cargarProductos(){
        productos.put("Pepsi", new Producto("Pepsi", 154.5));
        productos.put("Papas fritas", new Producto("Papas fritas", 170.0));
        productos.put("Alfajor", new Producto("Alfajor", 85.75));
        productos.put("Galletitas", new Producto("Galletitas", 98.50));
    }
    
    public void modificarProducto(){
        System.out.println("INGRESE EL NOMBRE DEL PRODUCTO A MODIFICAR");
        String nombreABuscar = leer.next();
        
        if (productos.containsKey(nombreABuscar)){
            Producto productoAModificar = productos.get(nombreABuscar);
            System.out.println("ELIJA UNA OPCION A MODIFICAR");
            System.out.println("1) MODIFICAR NOMBRE PRODUCTO");
            System.out.println("2) MODIFICAR PRECIO PRODUCTO");
            Integer opcion = leer.nextInt();
            
            switch (opcion){
                case 1: System.out.println("INGRESE NUEVO NOMBRE");
                String nuevoNombre = leer.next();
                productoAModificar.setNombreProducto(nuevoNombre);
//                productos.put(productoAModificar.getNombreProducto(), productoAModificar);
                    break;
                case 2: System.out.println("INGRESE NUEVO PRECIO");
                Double nuevoPrecio = leer.nextDouble();
                productoAModificar.setPrecioProducto(nuevoPrecio);
//                productos.put(productoAModificar.getNombreProducto(), productoAModificar);
                    break;
                default: System.out.println("SU OPCION NO CORRESPONDE A LAS ACEPTADAS EN EL SISTEMA");
                    break;
                
            }
        }else System.out.println("EL PRODUCTO QUE INGRESO NO ESTA DENTRO DEL LISTADO DE PRODUCTOS");
         
    }
    
    public void eliminarProducto(){
        System.out.println("INGRESE EL NOMBRE DEL PRODUCTO A MODIFICAR");
        String productoAEliminar = leer.next();
        
        if (productos.containsKey(productoAEliminar)){
            Producto productoChau = productos.get(productoAEliminar);
            productos.remove(productoChau.getNombreProducto());
            
        }else System.out.println("EL PRODUCTO QUE INGRESO NO ESTA DENTRO DEL LISTADO DE PRODUCTOS");
    }
    
    public void mostrarProductos(){
        if(productos.isEmpty()){
            System.out.println("LA LISTA DE PRODUCTOS ESTA VACIA");
        }else{
            for(Producto producto : productos.values()){
                System.out.println("*"+producto.getNombreProducto());
                System.out.println(producto.getPrecioProducto());
            }
        }
    }
    
}
