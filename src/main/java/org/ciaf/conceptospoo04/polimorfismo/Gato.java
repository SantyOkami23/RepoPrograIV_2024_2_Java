package org.ciaf.conceptospoo04.polimorfismo;

class Gato implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace: Miau");
    }
}