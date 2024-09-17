package org.ciaf.conceptospoo04.polimorfismo;


class Vaca implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("La vaca hace: Muuu");
    }
}