package Dominio;

//Clase padre de ProductoMedible y ProductoNoMedible, donde aplicamos herencia y abstraccion a traves de los atributos y el metodo abstracto calcularPrecio
//Contiene los atributos y metodos comunes de los productos


public abstract class Producto {
    //Se aplica encapsulamiento a nombre siendo protected para que puedan ser accedidos por las clases hijas
    protected String nombre;
    
    

    public Producto(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    //Metodo abstracto que sera implementado por las clases hijas
    public abstract double calcularPrecio();

}
