package com.company;

import java.util.Scanner;

/**
 * Created by Dariusz on 2016-04-05.
 */
public class Menu {
    private Scanner scanner;
    private Kontenter kontener;
    private Operacje operacje;

    public Menu() {
        this.scanner = new Scanner(System.in);
        kontener = new Kontenter();
        operacje = new Operacje();

        int wybranaOpcja = 0;

        while (true) {
            wyswietlMenu();
            System.out.print("Podaj nr opcji: ");
            wybranaOpcja = scanner.nextInt();
            if (wybranaOpcja == 0) break;
            wybierzOpcje(wybranaOpcja);
        }
    }

    private void wybierzOpcje(int wybranaOpcja) {
        switch(wybranaOpcja) {
            case 1 :
                operacje.dodajOsobe(kontener, scanner);
                break;
            case 2 :
                operacje.dodajStudenta(kontener, scanner);
                break;
            case 3 :
                //dodanie pracownika
                operacje.dodajPracownika(kontener, scanner);
                break;
            case 4 :
                // dodanie wykladowcy
                operacje.dodajWykladowce(kontener, scanner);
                break;
            case 5 :
                operacje.wyswietlWszystkich(kontener);
                break;
            default:
                System.out.println("Nie ma takiej opcji!!!!");
                break;
        }
    }

    private void wyswietlMenu() {
        System.out.println();
        System.out.println("Menu: ");
        System.out.println("1. Dodaj osobe.");
        System.out.println("2. Dodaj studenta.");
        System.out.println("3. Dodaj pracownika.");
        System.out.println("4. Dodaj wykładowce.");
        System.out.println("5. Pokaż wszystkich.");
        System.out.println("0. Koniec");
    }

}
