package org.ciaf.ejerciciospolimorfismo.stocktiendita;


class Ropa extends Producto {
    private double descuentoTemporada;

    public Ropa(String nombre, double precioBase, double descuentoTemporada) {
        super(nombre, precioBase);
        this.descuentoTemporada = descuentoTemporada;
    }

    @Override
    public double calcularPrecioFinal() {
        // El precio final depende del descuento de temporada
        return precioBase * (1 - descuentoTemporada);
    }
}
