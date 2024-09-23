package org.ciaf.ejerciciospolimorfismo.fundamento.sininterfaz;

class Gato extends Animal {
    // Sobrescribimos el método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau miau!");
    }
}