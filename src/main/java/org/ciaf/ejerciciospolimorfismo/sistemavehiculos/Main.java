package org.ciaf.ejerciciospolimorfismo.sistemavehiculos;

public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Coche("Toyota", 180);
        Vehiculo moto = new Motocicleta("Honda", 200, 150);
        Vehiculo bicicleta = new Bicicleta("BMX", 50);

        System.out.println("Velocidad máxima del coche: " + coche.calcularVelocidadMaxima() + " km/h");
        System.out.println("Velocidad máxima de la moto: " + moto.calcularVelocidadMaxima() + " km/h");
        System.out.println("Velocidad máxima de la bicicleta: " + bicicleta.calcularVelocidadMaxima() + " km/h");
    }
}
