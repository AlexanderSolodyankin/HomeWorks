package com.company;

import java.util.Set;

public class Hotels extends AbstractHome{

    public Hotels(Set<Famaly> apartaments, String adress, int numbersHome) {
        super(apartaments, adress, numbersHome);
    }

    @Override
    public String toString() {
        return String.format("Отель.\n" +
                "%s",super.toString());
    }
}
