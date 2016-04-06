package com.company;

/**
 * Created by Dariusz on 2016-04-05.
 */
public class Wykladowca extends Pracownik{
    private String kierunek;

    public Wykladowca(String imie, String nazwisko, int rokUrodzenia, int wynagrodzenie, String kierunek) {
        super(imie, nazwisko, rokUrodzenia, wynagrodzenie);
        this.kierunek = kierunek;
    }

    public void info() {
        super.info();
        System.out.println("Kierunek: " + kierunek);
    }
}
