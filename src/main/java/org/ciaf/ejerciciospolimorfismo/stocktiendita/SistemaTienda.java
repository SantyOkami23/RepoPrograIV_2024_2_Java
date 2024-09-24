package org.ciaf.ejerciciospolimorfismo.stocktiendita;

import java.util.ArrayList;
import java.util.List;

public class SistemaTienda {
    public static void main(String[] args) {
        // Lista para almacenar los productos
        List<Producto> productos = new ArrayList<>();

        // Agregamos diferentes tipos de productos al stock
        productos.add(new Electrodomestico("Lavadora", 500.00));
        productos.add(new Ropa("Camisa", 50.00, 0.20));  // Descuento del 20%
        productos.add(new Alimento("Manzana", 1.00));

        // Calculamos el precio final de cada producto
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre());
            System.out.println("Precio final: $" + producto.calcularPrecioFinal());
            System.out.println("---------------------------");
        }
    }
}
