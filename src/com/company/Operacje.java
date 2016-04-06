package com.company;

import java.util.Scanner;

/**
 * Created by Dariusz on 2016-04-05.
 */
public class Operacje {

    public String wczytajString(String komunikat, Scanner scanner) {
        System.out.print(komunikat);
        String wynik = scanner.nextLine();
        return wynik;
    }

    public int wczytajInt(String komunikat, Scanner scanner) {
        System.out.print(komunikat);
        int wynik = scanner.nextInt();
        return wynik;
    }

    public void dodajOsobe(Kontenter kontener, Scanner scanner) {
        scanner.nextLine();
        String imie = wczytajString("Podaj imie: ", scanner);
        String nazwisko = wczytajString("Podaj nazwisko: ", scanner);
        int rokUrodzenia = wczytajInt("Podaj rok urodzenia: ", scanner);

        Osoba osoba = new Osoba(imie, nazwisko, rokUrodzenia);
        kontener.add(osoba);
    }

    public void dodajStudenta(Kontenter kontener, Scanner scanner) {
        scanner.nextLine();
        String imie = wczytajString("Podaj imie: ", scanner);
        String nazwisko = wczytajString("Podaj nazwisko: ", scanner);
        int rokUrodzenia = wczytajInt("Podaj rok urodzenia: ", scanner);
        scanner.nextLine();
        String nrAlbumu = wczytajString("Podaj nr albumu: ", scanner);

        Osoba osoba = new Student(imie, nazwisko, rokUrodzenia, nrAlbumu);
        kontener.add(osoba);
    }

    public void dodajPracownika(Kontenter kontener, Scanner scanner) {
        scanner.nextLine();
        String imie = wczytajString("Podaj imie: ", scanner);
        String nazwisko = wczytajString("Podaj nazwisko: ", scanner);
        int rokUrodzenia = wczytajInt("Podaj rok urodzenia: ", scanner);
        int wynagrodzenie = wczytajInt("Podaj wynagrodzenie: ", scanner);
        Osoba osoba = new Pracownik(imie, nazwisko, rokUrodzenia, wynagrodzenie);
        kontener.add(osoba);
    }

    public void dodajWykladowce(Kontenter kontener, Scanner scanner) {
        scanner.nextLine();
        String imie = wczytajString("Podaj imie: ", scanner);
        String nazwisko = wczytajString("Podaj nazwisko: ", scanner);
        int rokUrodzenia = wczytajInt("Podaj rok urodzenia: ", scanner);
        int wynagrodzenie = wczytajInt("Podaj wynagrodzenie: ", scanner);
        scanner.nextLine();
        String kierunek = wczytajString("Podaj kierunek: ", scanner);

        Wykladowca osoba = new Wykladowca(imie, nazwisko, rokUrodzenia, wynagrodzenie, kierunek);
        kontener.add(osoba);
    }

    public void wyswietlWszystkich(Kontenter kontenter) {
        if (kontenter.getZbiornik().size() < 1) {
            System.out.println("Brak osób.");
        }
        else {
            System.out.println("Lista ================================");
            System.out.println();
            for (Osoba osoba : kontenter.getZbiornik()) {
                osoba.info();
                System.out.println();
            }
            System.out.println("======================================");
        }
    }

}
