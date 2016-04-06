package com.company;

/**
 * Created by Dariusz on 2016-04-05.
 */
public class Student extends Osoba {
    private String nrAlbumu;

    public Student(String imie, String nazwisko, int rokUrodzenia, String nrAlbumu) {
        super(imie, nazwisko, rokUrodzenia);
        this.nrAlbumu = nrAlbumu;
    }

    public void info() {
        super.info();
        System.out.println("nrAlbumu: " + nrAlbumu);
    }
}
