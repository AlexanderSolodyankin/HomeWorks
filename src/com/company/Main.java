package com.company;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Day day = new Day("Понедельник", 15);
        Day day1 = new Day("Вторник", 15);

        Map<Day, Integer> map = new HashMap<>();
        map.put(day,10);
        map.put(day1, 10);

        System.out.println(map);
        System.out.println(map.get(day));
        System.out.println(map.get(day1));


    }





}

