package org.ciaf.ejerciciospolimorfismo.fundamento.coninterfaz;

class Coche implements Vehiculo {
    @Override
    public void encender() {
        System.out.println("El coche está encendido");
    }
}