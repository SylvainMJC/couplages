package org.sebsy.demo.orchestre.couplagefaible;

public class Musicien {

    private String morceau;
    private Instrument instrument;

    public Musicien(String morceau, Instrument instrument) {
        this.instrument = instrument;
        this.morceau = morceau;
    }

    public void jouerMorceau() {
        instrument.afficher();
        System.out.println("et je joue le morceau " + morceau);
        instrument.jouer();
    }
}
