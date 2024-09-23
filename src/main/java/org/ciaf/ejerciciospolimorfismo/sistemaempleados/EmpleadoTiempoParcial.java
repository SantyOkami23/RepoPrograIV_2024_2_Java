package org.ciaf.ejerciciospolimorfismo.sistemaempleados;

class EmpleadoTiempoParcial extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTiempoParcial(String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora; // Salario por horas trabajadas
    }
}
