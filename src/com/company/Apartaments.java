package com.company;

import java.util.Set;

public class Apartaments extends AbstractHome{
    public Apartaments(Set<Famaly> apartaments, String adress, int numbersHome) {
        super(apartaments, adress, numbersHome);
    }

    @Override
    public String toString() {
        return String.format("Многоквартирный дом.\n" +
                "%s",super.toString());
    }

    @Override
    public void Pay() {
        System.out.println("Оплачивают комунальные услуги");
    }
}
