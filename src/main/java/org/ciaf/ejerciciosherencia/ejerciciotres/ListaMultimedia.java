package org.ciaf.ejerciciosherencia.ejerciciotres;

import org.ciaf.ejerciciosherencia.ejerciciouno.Multimedia;

public class ListaMultimedia {

    private Multimedia[] lista;
    private int contador;

    // Constructor para inicializar la lista con una capacidad específica
    public ListaMultimedia(int capacidad) {
        lista = new Multimedia[capacidad];
        contador = 0;
    }

    // Método para obtener el tamaño actual de la lista
    public int size() {
        return contador;
    }

    // Método privado para verificar si la lista está llena
    private boolean llena() {
        return contador == lista.length;
    }

    // Método para añadir un objeto Multimedia a la lista
    public boolean add(Multimedia m) {
        if (llena()) {
            return false;  // Si está llena, no se puede añadir
        } else {
            lista[contador] = m;
            contador++;
            return true;  // Añadido con éxito
        }
    }

    // Método para obtener un objeto Multimedia de una posición específica
    public Multimedia get(int posicion) {
        if (posicion >= contador || posicion < 0) {
            throw new IndexOutOfBoundsException("indice fuera de los límites");
        }
        return lista[posicion];
    }

    // Método toString para representar todos los objetos en la lista
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < contador; i++) {
            s += lista[i].toString() + "\n";
        }
        return s;
    }
}
