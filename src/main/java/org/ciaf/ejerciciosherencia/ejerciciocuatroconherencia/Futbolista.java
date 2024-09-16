package org.ciaf.ejerciciosherencia.ejerciciocuatroconherencia;

public class Futbolista extends SeleccionFutbol
{
    public int getDorsal() {
        return dorsal;
    }

    public Futbolista(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.demarcacion = demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public Futbolista() {
        super();
    }
    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    private int dorsal;
    private String demarcacion;



    // getter y setter

    public void jugarPartido() {
        System.out.println(" Este men juega partido"  );
    }

    public void entrenar() {
        System.out.println(" Este men entrena"  );

    }
}