package Dominio;

//Clase hija de Producto
//Contiene los atributos y metodos especificos de los productos no medibles



public class ProductoNoMedible extends Producto {
    //Se aplica encapsulamiento a los atributos de la clase siendo private para que solo puedan ser accedidos por la misma clase
    private int cantidad;
    private double precioUnidad;

    public ProductoNoMedible(String nombre,int cantidad,int precioUnidad, int cantidadUnidad) {
        //Llamamos al constructor de la clase padre con super donde lograra que heredemos los atributos de las clase padre
        super(nombre);
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    //metdodo abstracto heredado de la clase padre donde aplicamos abstraccion
    public double calcularPrecio() {
        return cantidad * precioUnidad;
    }

    public String toString() {
        return "Producto No Medible: " + nombre + " Total: " + calcularPrecio() + " Cantidad: " + cantidad + " Precio por Unidad: " + precioUnidad;
    }
    
}
