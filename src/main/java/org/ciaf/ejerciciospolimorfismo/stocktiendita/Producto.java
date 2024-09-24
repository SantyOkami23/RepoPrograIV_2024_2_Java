package org.ciaf.ejerciciospolimorfismo.stocktiendita;

abstract class Producto {
    protected String nombre;
    protected double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // Método abstracto que será implementado en las subclases
    public abstract double calcularPrecioFinal();

    // Método común para todos los productos
    public String getNombre() {
        return nombre;
    }
}
