package org.ciaf.ejerciciospolimorfismo.fundamento.coninterfaz;

class Moto implements Vehiculo {
    @Override
    public void encender() {
        System.out.println("La moto está encendida");
    }
}