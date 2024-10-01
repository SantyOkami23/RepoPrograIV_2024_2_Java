package org.ciaf.practicas;
import java.util.Scanner;

// Método main para probar la clase
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(nombreCliente, saldoInicial);

        System.out.println("Saldo inicial: " + cuenta.obtenerSaldo());

        System.out.print("Ingrese el monto a depositar: ");
        double montoDepositar = scanner.nextDouble();
        cuenta.depositar(montoDepositar);

        System.out.print("Ingrese el monto a retirar: ");
        double montoRetirar = scanner.nextDouble();
        cuenta.retirar(montoRetirar);

        System.out.println("Saldo final: " + cuenta.obtenerSaldo());

        scanner.close();
    }
}
