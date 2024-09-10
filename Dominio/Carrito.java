package Dominio;
import java.util.*;;

public class Carrito {

    private String nombre;
    private ArrayList<Producto> productos;

    public Carrito(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<Producto>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public double calcularPrecio() {
        double precio = 0;
        for (Producto producto : productos) {
            precio += producto.calcularPrecio();
        }
        return precio;
    }

    public String toString() {
        String mensaje = "Carrito: " + nombre + "\n";
        for (Producto producto : productos) {
            mensaje += producto + "\n";
        }
        mensaje += "Total: " + calcularPrecio();
        return mensaje;
    }

}
