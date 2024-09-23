package org.ciaf.conceptospoo04.herencia;

// Clase derivada Camion que hereda de Vehiculo
public class Camion extends Vehiculo {
    // Constructor

    private String color ;

    public Camion(String marca, String modelo, int ano, String color) {
        super(marca, modelo, ano);
        this.color = color;
    }

    public Camion(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    // Métodos adicionales específicos para Camion
    // (no mostrados para brevedad)
}

