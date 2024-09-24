package org.ciaf.ejerciciospolimorfismo.sistemavehiculos;

abstract class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public abstract double calcularVelocidadMaxima();
}
