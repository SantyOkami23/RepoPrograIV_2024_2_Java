package org.ciaf.clasesintaxis01;

import java.util.Scanner;

public class EjemploExpresionesAreaCirculo10 {
    private double radio;
    private double perimetro;

    public EjemploExpresionesAreaCirculo10(double perimetro, double largo) {
        this.perimetro = perimetro;
        this.largo = largo;
    }

    private double largo;

    public EjemploExpresionesAreaCirculo10(double radio, double perimetro, double largo) {
        this.radio = radio;
        this.perimetro = perimetro;
        this.largo = largo;
    }

    public EjemploExpresionesAreaCirculo10(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para mostrar información del círculo
    public void mostrarInformacion() {
        System.out.println("Círculo:");
        System.out.println("Radio: " + radio);
        System.out.println("area: " + calcularArea());
    }

    // Método main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos por consola para el círculo
        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();
        EjemploExpresionesAreaCirculo10 ejemploExpresionesAreaCirculo10 = new EjemploExpresionesAreaCirculo10(radio);
        scanner.close();

        // Mostrar información del círculo
        ejemploExpresionesAreaCirculo10.mostrarInformacion();
    }
}
