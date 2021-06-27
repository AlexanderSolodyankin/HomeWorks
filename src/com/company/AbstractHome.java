package com.company;

import java.util.Set;

public abstract class AbstractHome implements Pay{
    private Set<Famaly> apartaments;
    private String adress;
    private int numbersHome;

    public AbstractHome(Set<Famaly> apartaments, String adress, int numbersHome) {
        this.apartaments = apartaments;
        this.adress = adress;
        this.numbersHome = numbersHome;
    }

    public Set<Famaly> getApartaments() {
        return apartaments;
    }

    public void setApartaments(Set<Famaly> apartaments) {
        this.apartaments = apartaments;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumbersHome() {
        return numbersHome;
    }

    public void setNumbersHome(int numbersHome) {
        this.numbersHome = numbersHome;
    }

    @Override
    public String toString() {
        return String.format("Количестов семей проживающих в доме: %s\n" +
                "Адрес дома: %s\n " +
                "Номер дома: %s\n" +
                "Количество проживающих людей в доме: %s", apartaments.size(), adress, numbersHome, manyPeoples());
    }

    public int manyPeoples() {
        int manyPeoples = 0;
        for (Famaly manyPeople : apartaments) {
            manyPeoples = manyPeoples + manyPeople.famaly.size();
        }
        return manyPeoples;
    }

    public void showMantPeoples() {
        System.out.println("В доме проживает " + manyPeoples() + " человек");
    }

    @Override
    public void Pay() {
        System.out.println("Оплачивают проживание");
    }




}
