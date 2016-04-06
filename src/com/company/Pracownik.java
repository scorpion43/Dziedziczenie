package com.company;

/**
 * Created by Dariusz on 2016-04-05.
 */
public class Pracownik extends Osoba {
    private int wynagrodzenie;

    public Pracownik(String imie, String nazwisko, int rokUrodzenia, int wynagrodzenie) {
        super(imie, nazwisko, rokUrodzenia);
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Wynagrodzenie: " + wynagrodzenie);
    }
}
