package com.RandomSetupFamaly;

import com.company.AbstractHome;
import com.company.Apartaments;
import com.company.Famaly;
import com.company.Hotels;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetupHous {

    private static AbstractHome home;
    public static Random ran = new Random();

    public static AbstractHome SetupHous(EnumViewHous hous) {
        switch (hous) {
            case APARTAMENTS:
                return home = new Apartaments(getFamaly(), getAdress(), ran.nextInt(271));
            case HOTEL:
                return home = new Hotels(SetupHous.getFamaly(), getAdress(), ran.nextInt(271));
            case HOSTEL:
                return home = new Hotels(SetupHous.getFamaly(), getAdress(), ran.nextInt(271));
        }

        return home;
    }

    static Set<Famaly> getFamaly() {
        int numbersOfFamaly = ran.nextInt(100 - 10 + 1) + 1;
        Set<Famaly> famalyHous = new HashSet<>();
        while (numbersOfFamaly > 0) {
            SetupFamaly setupFamaly = new SetupFamaly();
            Famaly famaly = new Famaly(setupFamaly.getMans());
            famalyHous.add(famaly);
            numbersOfFamaly--;
        }
        return famalyHous;
    }

    static String getAdress() {
        String adress = "";

        ArrayList<String> city = new ArrayList<>();
        ArrayList<String> district = new ArrayList<>();
        city.add("Бишкек");
        district.add("Северный");
        city.add("Москва");
        district.add("Днепопитровский");
        city.add("Вашингтон");
        district.add("Ленинский");
        city.add("Санкт-Питербург");
        district.add("Свердловский");
        city.add("Винеция");
        district.add("Октяборьский");
        city.add("Япония");
        district.add("Первомайский");
        city.add("Венисуэла");
        district.add("Чуйский");
        city.add("Лондон");
        district.add("Богатырьский");
        city.add("Алма-Ата");
        district.add("Временый");
        city.add("Берлин");
        district.add("Поливной");
        city.add("Флоренция");
        district.add("Спящий");
        city.add("Винчи");
        district.add("Игральный");
        city.add("Лос-Анджелес");
        district.add("Логический");

        ArrayList<String> street = new ArrayList<>();
        street.add("Скрябина");
        street.add("Ахунбаева");
        street.add("Логвиненко");
        street.add("Скрябина");
        street.add("Бельская");
        street.add("Матерая");
        street.add("Школьная");
        street.add("Влажная");
        street.add("Куренкеева");
        street.add("Оллд - Стриит");
        street.add("Красной площади");
        street.add("Диаметральная");
        adress = adress + "Город: " + city.get(ran.nextInt(city.size())) + " \nРайон: " + district.get(ran.nextInt(district.size())) +
                " \n Улица: " + street.get(ran.nextInt(street.size())) + " ";
        return adress;
    }
}
