package org.ciaf.ejerciciospolimorfismo.sistemavehiculos;

class Bicicleta extends Vehiculo {
    private double fuerzaCiclista;

    public Bicicleta(String marca, double fuerzaCiclista) {
        super(marca);
        this.fuerzaCiclista = fuerzaCiclista;
    }

    @Override
    public double calcularVelocidadMaxima() {
        return fuerzaCiclista * 3; // Fórmula para calcular velocidad de bicicleta
    }
}
