package org.ciaf.ejerciciospolimorfismo.stocktiendita;


class Electrodomestico extends Producto {

    public Electrodomestico(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        // Los electrodomésticos tienen un descuento del 10%
        return precioBase * 0.90;
    }
}
