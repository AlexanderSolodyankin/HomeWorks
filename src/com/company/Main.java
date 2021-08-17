package com.company;


import java.util.*;

public class Main {
    /**
     * Переписал у Чингиза, Чингиз все обьяснил тему понял
     * Не стал делать по свойму так как было бы дофига циклов
     *
     */
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Бишкек", 996));
        cities.add(new City("Москва", 495));
        cities.add(new City("Ош", 3222));
        cities.add(new City("Каракол", 3922));
        cities.add(new City("Лондон", 20));
        cities.add(new City("Санкт-Питербург", 812));
        cities.add(new City("Нью Йорк", 212));
        cities.add(new City("Вашингтон", 202));
        cities.add(new City("Пекин", 10));
        cities.add(new City("Киев", 44));

        Set<City> onlyCities = new HashSet<>();
        Set<City> treeSities = new TreeSet<>();

        cities.stream().allMatch(city -> city.getCode() % 2 == 0 ? onlyCities.add(city) : treeSities.add(city));

        printDesc(cities);

        treeSities.removeIf(city -> city.getName().length() > 5);

        printAsc(cities);



    }


    public static void printDesc(List<City> list) {
        TreeSet<City> treeSet = new TreeSet<>(list);
        Iterator<City> desc = treeSet.descendingIterator();
        System.out.println("По убыванию:");
        while (desc.hasNext())
            System.out.println(desc.next());
    }

    public static void printAsc(List<City> list) {
        TreeSet<City> treeSet = new TreeSet<>(list);
        System.out.println("\nПо возрастанию:");
        for (City city : treeSet)
            System.out.println(city);
    }
}

