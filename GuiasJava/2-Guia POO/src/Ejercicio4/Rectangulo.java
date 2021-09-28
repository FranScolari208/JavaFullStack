
package Ejercicio4;

/**
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Rectangulo {
    
    private Integer base;
    private Integer altura;
    
    public Rectangulo (Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
        
    }
    
    public Rectangulo() {

    }
    
    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base=base;
    }
    
    public Integer getAltura(){
        return altura;
    }
    
    public void setAltura(Integer altura){
        this.altura = altura;
    }
    
    public void crearRectangulo (Integer base, Integer altura){
        setBase(base);
        setAltura(altura);
    }
    
    public void superficieRectangulo (Integer base, Integer altura){
        int superficie;
        superficie = base * altura;
        System.out.println("LA SUPERFICIE DEL RECTANGULO ES:"+superficie);
    }
    
    public void perimetroRectangulo (Integer base, Integer altura){
        int perimetro;
        perimetro = (base + altura) * 2;
        System.out.println("EL PERIMETRO DEL RECTANGULO ES:"+perimetro);
    }
    
    public void mostrarRectangulo (Integer base, Integer altura){
        int i;
        int j;
        for(i=0; i<base; i++){
            for(j=0; j<altura; j++){
                if (j==0 || j == (altura - 1) || i == 0 || i == (base - 1)){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

