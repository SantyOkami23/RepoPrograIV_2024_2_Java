package org.ciaf.clasearreglos03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjemploArrayListString05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una lista de strings
        List<String> lista = new ArrayList<>();

        // Solicitar al usuario que ingrese los elementos de la lista
        System.out.println("Ingrese los elementos de la lista (ingrese 'fin' para terminar):");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("fin")) {
                break;
            }
            lista.add(input);
        }

        // Mostrar la lista ingresada por el usuario
        System.out.println("Lista ingresada: " + lista);

        // Buscar un elemento en la lista
        System.out.print("Ingrese el elemento que desea buscar en la lista: ");
        String elementoBuscar = scanner.nextLine();
        if (lista.contains(elementoBuscar)) {
            System.out.println("El elemento '" + elementoBuscar + "' se encuentra en la lista");
        } else {
            System.out.println("El elemento '" + elementoBuscar + "' no se encuentra en la lista");
        }

        // Eliminar un elemento de la lista
        eliminar(scanner, lista);

        // Actualizar un elemento de la lista
        // Actualizar un elemento de la lista
        actualizar(scanner, lista);


        // Mostrar la lista después de los cambios
        System.out.println("Lista después de los cambios: " + lista);

        scanner.close();
    }

    private static void eliminar(Scanner scanner, List<String> lista) {
        System.out.print("Ingrese el elemento que desea eliminar de la lista: ");
        String elementoEliminar = scanner.nextLine();
        if (lista.remove(elementoEliminar)) {
            System.out.println("El elemento '" + elementoEliminar + "' ha sido eliminado de la lista");
        } else {
            System.out.println("El elemento '" + elementoEliminar + "' no se encuentra en la lista");
        }
    }

    private static void actualizar(Scanner scanner, List<String> lista) {
        System.out.print("Ingrese el índice del elemento que desea actualizar en la lista: ");
        int indiceActualizar = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente
        if (indiceActualizar >= 0 && indiceActualizar < lista.size()) {
            System.out.print("Ingrese el nuevo valor para el elemento: ");
            String nuevoValor = scanner.nextLine();
            lista.set(indiceActualizar, nuevoValor);
            System.out.println("El elemento en el índice " + indiceActualizar + " ha sido actualizado con '" + nuevoValor + "'");
        } else {
            System.out.println("indice fuera de los límites de la lista. No se puede actualizar el elemento.");
        }
    }
}
