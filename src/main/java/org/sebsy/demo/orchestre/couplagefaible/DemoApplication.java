package org.sebsy.demo.orchestre.couplagefaible;

import org.sebsy.demo.orchestre.couplagefaible.Orchestre;

public class DemoApplication {
    public static void main(String[] args) {

        Piano piano = new Piano();
        System.out.println("Le pianiste : ");
        org.sebsy.demo.orchestre.couplagefaible.Musicien pianiste = new Musicien("La 9eme de Beethoven", piano);
        pianiste.jouerMorceau();

        Violon violon = new Violon();
        System.out.println("Le violoniste : ");
        org.sebsy.demo.orchestre.couplagefaible.Musicien violoniste = new Musicien("La 9eme de Beethoven", violon);
        violoniste.jouerMorceau();

        System.out.println("L'orchestre : ");
        org.sebsy.demo.orchestre.couplagefaible.Orchestre orchestre = new Orchestre();
        orchestre.ajout(pianiste);
        orchestre.ajout(violoniste);
        orchestre.jouer();
    }
}
