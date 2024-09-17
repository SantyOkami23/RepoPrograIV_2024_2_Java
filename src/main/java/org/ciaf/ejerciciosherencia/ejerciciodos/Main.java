package org.ciaf.ejerciciosherencia.ejerciciodos;

import org.ciaf.ejerciciosherencia.ejerciciouno.Formato;

public class Main {
    public static void main(String[] args) {

        // Crear objetos Pelicula
        Pelicula pelicula1 = new Pelicula("El caballero oscuro", "Christopher Nolan", Formato.MOV, 152.0, "Christian Bale", "Maggie Gyllenhaal");
        Pelicula pelicula2 = new Pelicula("Titanic", "James Cameron", Formato.AVI, 195.0, "Leonardo DiCaprio", "Kate Winslet");
        Pelicula pelicula3 = new Pelicula("John Wick", "Chad Stahelski", Formato.MP4, 101.0, "Keanu Reeves", null); // Solo actor principal

        // Mostrar detalles de las películas usando el método toString()
        System.out.println(pelicula1.toString());
        System.out.println(pelicula2.toString());
        System.out.println(pelicula3.toString());

        // Probar la excepción si actor y actriz son nulos
        try {
            Pelicula pelicula4 = new Pelicula("Película sin protagonistas", "Director Desconocido", Formato.MPG, 90.0, null, null);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}

