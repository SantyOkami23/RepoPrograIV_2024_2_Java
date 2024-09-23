package org.ciaf.ejerciciospolimorfismo.sistemaempleados;

class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase; // Salario fijo
    }
}
