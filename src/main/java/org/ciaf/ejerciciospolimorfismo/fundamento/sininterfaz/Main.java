package org.ciaf.ejerciciospolimorfismo.fundamento.sininterfaz;



public class Main {
    public static void main(String[] args) {

        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        // Llamada al método hacerSonido(), que se ejecuta de manera diferente dependiendo del objeto
        miPerro.hacerSonido();  // Imprime: El perro ladra: ¡Guau guau!
        miGato.hacerSonido();   // Imprime: El gato maúlla: ¡Miau miau!
    }
}
