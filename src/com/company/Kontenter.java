package com.company;

import java.util.ArrayList;

/**
 * Created by Dariusz on 2016-04-05.
 */
public class Kontenter {
    public ArrayList<Osoba> zbiornik;

    public Kontenter() {
        zbiornik = new ArrayList<Osoba>();
    }

    public ArrayList<Osoba> getZbiornik() {
        return zbiornik;
    }

    public void add(Osoba osoba) {
        zbiornik.add(osoba);
    }
}
