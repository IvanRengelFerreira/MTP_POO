package Dominio;

//Clase hija de Producto
//Contiene los atributos y metodos especificos de los productos medibles

public class ProductoMedible extends Producto {
    //Se aplica encapsulamiento a los atributos de la clase siendo private para que solo puedan ser accedidos por la misma clase

    private double peso;
    private double precioKilo;

    public ProductoMedible(String nombre, double peso, double precioKilo) {
        //Llamamos al constructor de la clase padre con super donde lograra que heredemos los atributos de las clase padre
        super(nombre);
        this.peso = peso;
        this.precioKilo = precioKilo;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioKilo() {
        return precioKilo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrecioKilo(double precioKilo) {
        this.precioKilo = precioKilo;
    }
    //metdodo abstracto heredado de la clase padre
    public double calcularPrecio() {
        return peso * precioKilo;
    }

    public String toString() {
        return "Producto Medible: " + nombre + " Total: " + calcularPrecio() + " Peso: " + peso + " Precio por Kilo: " + precioKilo;
    }
    
}
