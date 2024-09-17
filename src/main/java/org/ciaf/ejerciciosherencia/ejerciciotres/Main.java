package org.ciaf.ejerciciosherencia.ejerciciotres;

import org.ciaf.ejerciciosherencia.ejerciciouno.Formato;
import org.ciaf.ejerciciosherencia.ejerciciouno.Multimedia;

public class Main {
    public static void main(String[] args) {

        // Crear una lista de Multimedia con capacidad de 3 elementos
        ListaMultimedia lista = new ListaMultimedia(3);

        // Crear algunos objetos Multimedia
        Multimedia multimedia1 = new Multimedia("Canción 1", "Autor 1", Formato.MP3, 3.5);
        Multimedia multimedia2 = new Multimedia("Película 1", "Director 1", Formato.AVI, 120.0);
        Multimedia multimedia3 = new Multimedia("Canción 2", "Autor 2", Formato.WAV, 4.0);

        // Añadir elementos a la lista
        lista.add(multimedia1);
        lista.add(multimedia2);
        lista.add(multimedia3);

        // Intentar añadir más elementos de la capacidad máxima
        Multimedia multimediaExtra = new Multimedia("Canción 3", "Autor 3", Formato.MIDI, 3.0);
        boolean added = lista.add(multimediaExtra);
        System.out.println("¿Elemento extra añadido?: " + added);  // Debería ser false

        // Mostrar el contenido de la lista
        System.out.println("Contenido de la lista:");
        System.out.println(lista.toString());

        // Obtener un elemento por su posicion
        Multimedia item = lista.get(1);  // Debería devolver "Pelicula 1"
        System.out.println("Elemento en la posición 1: " + item);

        // Probar excepción al pedir un índice fuera de los límites
        try {
            lista.get(0);  // iNDICE INVALIDO
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
