package org.ciaf.ejerciciospolimorfismo.stocktiendita;



class Alimento extends Producto {

    public Alimento(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        // Los alimentos tienen un 5% de impuestos adicionales
        return precioBase * 1.05;
    }
}
