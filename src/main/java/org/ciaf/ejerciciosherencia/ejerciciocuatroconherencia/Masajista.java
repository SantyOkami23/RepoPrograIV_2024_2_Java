package org.ciaf.ejerciciosherencia.ejerciciocuatroconherencia;

public class Masajista extends SeleccionFutbol
{

    private String Titulacion;
    private int aniosExperiencia;

    public Masajista() {
        super();
    }

    // getter y setter

    public Masajista(String titulacion, int aniosExperiencia) {
        Titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        Titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String titulacion) {
        Titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println(" Este men da masaje "  );
    }
}