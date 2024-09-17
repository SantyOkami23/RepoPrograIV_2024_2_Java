package org.ciaf.ejerciciosherencia.ejerciciocuatroconherencia;

public class Personaje {
    public String nombre;
    public int vida;
    public int ataque;

    public Personaje(String nombre, int vida, int ataque){
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void atacar(Personaje otroPersonaje){
        otroPersonaje.recibirDanio(ataque);
    }

    public void recibirDanio(int cantidad){
        vida -= cantidad;
    }

    public String getNombre(){
        return nombre;
    }

    public int getVida(){
        return vida;
    }

}
