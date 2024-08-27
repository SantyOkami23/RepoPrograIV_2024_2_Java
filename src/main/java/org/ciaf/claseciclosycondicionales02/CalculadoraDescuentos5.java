package org.ciaf.claseciclosycondicionales02;
import java.util.Scanner;

public class CalculadoraDescuentos5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto total de la compra: ");
        double montoCompra = scanner.nextDouble();
        System.out.print("¿Tiene un cupón de descuento? (si/no): ");
        String tieneCupon = scanner.next();

        double montoFinal;
        if (tieneCupon.equalsIgnoreCase("si")) {
            montoFinal = montoCompra * 0.9; // Aplica un descuento del 10%
        } else {
            montoFinal = montoCompra;
        }

        System.out.println("El monto final a pagar es: $" + montoFinal);
    }
}
