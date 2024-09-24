package org.ciaf.ejerciciospolimorfismo.sistemavehiculos;

class Coche extends Vehiculo {
    private double potenciaMotor;

    public Coche(String marca, double potenciaMotor) {
        super(marca);
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public double calcularVelocidadMaxima() {
        return potenciaMotor * 2.5; // Fórmula para calcular velocidad del coche
    }
}
