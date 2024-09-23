package org.ciaf.ejerciciospolimorfismo.fundamento.coninterfaz;

public class Main {
    public static void main(String[] args) {
        // Uso de polimorfismo con interfaces
        Vehiculo miCoche = new Coche();
        Vehiculo miMoto = new Moto();

        miCoche.encender();  // Imprime: El coche está encendido
        miMoto.encender();   // Imprime: La moto está encendida
    }
}
