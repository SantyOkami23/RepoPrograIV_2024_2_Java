package org.ciaf.ejerciciosherencia.ejerciciouno;

public class Multimedia {

    private String titulo;
    private String autor;
    private Formato formato;
    private double duracion;

    // Constructor

    public Multimedia(String titulo, String autor, Formato formato, double duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    // Método toString para la representación del objeto
    @Override
    public String toString() {
        return "Titulo: " + titulo + " | Autor: " + autor + " | Formato: " + formato + " | Duracion: " + duracion + " minutos";
    }

    // Método equals para comparar objetos Multimedia
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Multimedia m = (Multimedia) obj;
        return titulo.equals(m.getTitulo()) && autor.equals(m.getAutor());
    }
}
