package org.ciaf.ejerciciospolimorfismo.fundamento.sininterfaz;



class Perro extends Animal {
    // Sobrescribimos el método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }
}