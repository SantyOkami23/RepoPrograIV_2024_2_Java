package org.ciaf.ejerciciosherencia.ejerciciouno;
public class Main {
    public static void main(String[] args) {

        // Crear objetos Multimedia
        Multimedia multimedia1 = new Multimedia("Canción 1", "Autor 1", Formato.MP3, 3.5);
        Multimedia multimedia2 = new Multimedia("Película 1", "Director 1", Formato.AVI, 120.0);
        Multimedia multimedia3 = new Multimedia("Canción 1", "Autor 1", Formato.MP3, 3.5);  // Igual que multimedia1

        // Mostrar detalles de los objetos usando el método toString()
        System.out.println(multimedia1.toString());
        System.out.println(multimedia2.toString());

        // Comprobación del método equals()
        System.out.println("¿multimedia1 es igual a multimedia2?: " + multimedia1.equals(multimedia2));
        System.out.println("¿multimedia1 es igual a multimedia3?: " + multimedia1.equals(multimedia3));
    }
}

