package org.ciaf.claseciclosycondicionales02.ejerciciosclase02;

public class Usuario {

    private String edad ="";
    private String nombre ="";
    private String CC = "";

    private String salario = "";

    public Usuario(String edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Usuario(String edad, String nombre, String CC) {
        edad = edad;
        this.nombre = nombre;
        this.CC = CC;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }
}
