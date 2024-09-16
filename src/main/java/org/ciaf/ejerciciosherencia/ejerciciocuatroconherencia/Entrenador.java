package org.ciaf.ejerciciosherencia.ejerciciocuatroconherencia;

public class Entrenador extends SeleccionFutbol
{

    private String idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }


    public void dirigirPartido() {
        System.out.println(" Este men dirige el partido "  );
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirEntreno() {
        System.out.println(" Este men dirige el entreno "  );
    }
    }
