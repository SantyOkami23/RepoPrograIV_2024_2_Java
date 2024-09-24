package org.ciaf.ejerciciospolimorfismo.sistemaempleados;


public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoTiempoCompleto("Juan", 3000);
        Empleado empleado2 = new EmpleadoTiempoParcial("Ana", 0, 20, 15);

        System.out.println("Salario de Juan: " + empleado1.calcularSalario());
        System.out.println("Salario de Ana: " + empleado2.calcularSalario());
    }
}
