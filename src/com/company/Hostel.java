package com.company;

import java.util.Set;

public class Hostel extends AbstractHome{

    public Hostel(Set<Famaly> apartaments, String adress, int numbersHome) {
        super(apartaments, adress, numbersHome);
    }

    @Override
    public String toString() {
        return String.format("Общага.\n" +
                "%s",super.toString());
    }
}
