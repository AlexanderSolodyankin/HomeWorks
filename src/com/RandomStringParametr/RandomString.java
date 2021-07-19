package com.RandomStringParametr;

import java.util.ArrayList;
import java.util.Random;

public interface RandomString {
    Random ran = new Random();

    static ArrayList<String> getArrayNames_Male() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Александр");
        names.add("Дмитрий");
        names.add("Владимир");
        names.add("Павел");
        names.add("Сергей");
        names.add("Станислав");
        names.add("Кирилл");
        names.add("Анатолий");
        return names;
    }static String getName_Male() {
        return getArrayNames_Male().get(ran.nextInt(getArrayNames_Male().size()));

    }static String getName_Male(int i) {
        return getArrayNames_Male().get(i);
    }

    static ArrayList<String> getArraySerNames_Male() {
        ArrayList<String> serNames = new ArrayList<>();
        serNames.add("Солодянки");
        serNames.add("Спивак");
        serNames.add("Кульков");
        serNames.add("Паниклов");
        serNames.add("Жуковец");
        serNames.add("Харинктон");
        serNames.add("Зельвиткий");
        serNames.add("Бенжамин");
        return serNames;
    }static String getSerName_Male() {
        return getArraySerNames_Male().get(ran.nextInt(getArraySerNames_Male().size()));
    }static String getSerName_Male(int i) {
        return getArraySerNames_Male().get(i);
    }


    static ArrayList<String> getArrayPatronymic_Male() {
        ArrayList<String> patronymic = new ArrayList<>();
        patronymic.add("Александрович");
        patronymic.add("Дмитриевич");
        patronymic.add("Владимирович");
        patronymic.add("Павелович");
        patronymic.add("Сергеевич");
        patronymic.add("Станиславович");
        patronymic.add("Кириллович");
        patronymic.add("Анатолиевич");
        return patronymic;
    }static String getPatronymic_Male() {
        return getArrayPatronymic_Male().get(ran.nextInt(getArrayPatronymic_Male().size()));
    }static String getPatronymic_Male(int i) {
        return getArrayPatronymic_Male().get(i);
    }

    static ArrayList<String> getArrayCantry() {
        ArrayList<String> Cantry = new ArrayList<>();
        Cantry.add("Киргизстан");
        Cantry.add("Америка");
        Cantry.add("Россия");
        Cantry.add("Италия");
        Cantry.add("Япония");
        Cantry.add("Польша");
        Cantry.add("Германия");
        Cantry.add("Англия");
        return Cantry;
    }static String getCantry() {
        return getArrayCantry().get(ran.nextInt(getArrayCantry().size()));
    }static String getCantry(int i) {
        return getArrayCantry().get(i);
    }

    static ArrayList<String> getArrayCantryLanguage() {
        ArrayList<String> language = new ArrayList<>();
        language.add("Киргизстан");
        language.add("Англиский");
        language.add("Русский");
        language.add("Итальянский");
        language.add("Японский");
        language.add("Польский");
        language.add("Немецкий");
        language.add("Англиский");
        return language;
    }static String getCantryLanguage() {
        return getArrayCantryLanguage().get(ran.nextInt(getArrayCantryLanguage().size()));
    }static String getCantryLanguage(int i) {
        return getArrayCantry().get(i);
    }

    static ArrayList<String> getArrayCity() {
        ArrayList<String> City = new ArrayList<>();
        City.add("Бишкек");
        City.add("Вашингтон");
        City.add("Москва");
        City.add("Рим");
        City.add("Токио");
        City.add("Варшава");
        City.add("Берлин");
        City.add("Лондон");
        return City;
    }static String getCity() {
        return getArrayCity().get(ran.nextInt(getArrayCity().size()));
    }static String getCity(int i) {
        return getArrayCity().get(i);
    }

    static ArrayList<String> getArrayNames_Woman() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Александра");
        names.add("Даша");
        names.add("Влерия");
        names.add("Ксюша");
        names.add("Лариса");
        names.add("Елизавета");
        names.add("Катя");
        names.add("Аня");
        return names;
    }static String getName_Woman() {
        return getArrayNames_Woman().get(ran.nextInt(getArrayNames_Woman().size()));

    }static String getName_Woman(int i) {
        return getArrayNames_Woman().get(i);
    }

    static ArrayList<String> getArraySerNames_Woman() {
        ArrayList<String> serNames = new ArrayList<>();
        serNames.add("Солодянкина");
        serNames.add("Спивакова");
        serNames.add("Кулькова");
        serNames.add("Паниклова");
        serNames.add("Жуковец");
        serNames.add("Харинктон");
        serNames.add("Зельвиткая");
        serNames.add("Бенжамин");
        return serNames;
    }static String getSerName_Woman() {
        return getArraySerNames_Woman().get(ran.nextInt(getArraySerNames_Woman().size()));
    }static String getSerName_Woman(int i) {
        return getArraySerNames_Woman().get(i);
    }


    static ArrayList<String> getArrayPatronymic_Woman() {
        ArrayList<String> patronymic = new ArrayList<>();
        patronymic.add("Александровна");
        patronymic.add("Дмитриевна");
        patronymic.add("Владимировна");
        patronymic.add("Павеловна");
        patronymic.add("Сергеевна");
        patronymic.add("Станиславовна");
        patronymic.add("Кирилловна");
        patronymic.add("Анатолиевна");
        return patronymic;
    }static String getPatronymic_Woman() {
        return getArrayPatronymic_Woman().get(ran.nextInt(getArrayPatronymic_Woman().size()));
    }static String getPatronymic_Woman(int i) {
        return getArrayPatronymic_Woman().get(i);
    }


}
