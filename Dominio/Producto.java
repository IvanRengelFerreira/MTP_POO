package Dominio;

//Clase padre de ProductoMedible y ProductoNoMedible, donde aplicamos herencia y abstraccion a traves de los atributos y el metodo abstracto calcularPrecio
//Contiene los atributos y metodos comunes de los productos
//Tiene un metodo abstracto calcularPrecio que sera implementado por las clases hijas
//Se aplica encapsulamiento a los atributos de la clase siendo protected para que puedan ser accedidos por las clases hijas
public abstract class Producto {
    protected String nombre;
    protected double precio;
    

    public Producto(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularPrecio();

}
