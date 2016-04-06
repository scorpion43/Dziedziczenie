package com.company;

import java.util.Calendar;

/**
 * Created by Dariusz on 2016-04-05.
 */
public class Osoba {
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public void info() {
        System.out.print(sprKtoTo() + " ");
        System.out.println(imie + " " + nazwisko);
        System.out.println("wiek: " + wiek());
    }

    private String sprKtoTo() {
        String pozycja = "Osoba";
        if (this instanceof Student) {
            pozycja = "Student";
        }
        else if (this instanceof Wykladowca) {
            pozycja = "Wykładowca";
        }
        else if (this instanceof Pracownik) {
            pozycja = "Pracownik";
        }

        return pozycja;
    }


    private int wiek() {
        int aktualnyRok = Calendar.getInstance().get(Calendar.YEAR);
        int wiek = aktualnyRok - this.rokUrodzenia;
        return wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getImie() {

        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }
}
