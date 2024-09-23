package org.ciaf.ejerciciospolimorfismo.sistemavehiculos;

class Motocicleta extends Vehiculo {
    private double peso;
    private double potencia;

    public Motocicleta(String marca, double peso, double potencia) {
        super(marca);
        this.peso = peso;
        this.potencia = potencia;
    }

    @Override
    public double calcularVelocidadMaxima() {
        return potencia / peso * 200; // Fórmula para calcular velocidad de motocicleta
    }
}
