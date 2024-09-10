package aplicacion;

import Dominio.*;

public class Principal {
    public static void main(String[] args) {
        ProductoNoMedible productoNoMedible = new ProductoNoMedible("Desodorante", 10, 2, 5);
        ProductoMedible productoMedible = new ProductoMedible("Papa", 2, 5);
        Carrito carrito = new Carrito("Carrito 1");
        carrito.agregarProducto(productoNoMedible);
        carrito.agregarProducto(productoMedible);
        carrito.calcularPrecio();

        System.out.println(carrito);
    }
}
