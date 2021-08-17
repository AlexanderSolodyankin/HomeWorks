package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        Map<Day, Integer> map = new HashMap<>();
        Day monday = new Day("Понедельник" , 1);
        Day tuesday = new Day("Вторник", 1);
        Day wednesday = new Day("Среда", 1);
        Day thursday = new Day("Четверг",1);
        Day friday = new Day("Пятница",1);
        Day saturday = new Day("Суббота",1);
        Day sunday = new Day("Воскресенье",1);
        int countDay = 1;
        for (int i = 0; i < 100; i++, countDay++) {
            int days = countDay % 8;

            if(days == 1){
                monday.setNumb(monday.getNumb() + 1);
                map.put(monday, ran.nextInt(31 - 1 + 1) + 1);
            }
            if(days == 2){
                tuesday.setNumb(tuesday.getNumb() + 1);
                map.put(tuesday, ran.nextInt(31 - 1 + 1) + 1);
            }
            if(days == 3){
                wednesday.setNumb(wednesday.getNumb() + 1);
                map.put(wednesday, ran.nextInt(31 - 1 + 1) + 1);
            }
            if(days == 4){
                thursday.setNumb(thursday.getNumb() + 1);
                map.put(thursday, ran.nextInt(31 - 1 + 1) + 1);
            }
            if(days == 5){
                friday.setNumb(friday.getNumb() + 1);
                map.put(friday, ran.nextInt(31 - 1 + 1) + 1);
            }
            if(days == 6){
                saturday.setNumb(saturday.getNumb() + 1);
                map.put(saturday, ran.nextInt(31 - 1 + 1) + 1);
            }
            if(days == 7){
                sunday.setNumb(sunday.getNumb() + 1);
                map.put(sunday, ran.nextInt(31 - 1 + 1) + 1);
                countDay = 1;
            }
        }
        System.out.println(map.get(monday));
        System.out.println(map.get(thursday));
        System.out.println(map.get(wednesday));
        System.out.println(map.get(tuesday));
        System.out.println(map.get(friday));
        System.out.println(map.get(saturday));
        System.out.println(map.get(sunday));


    }





}

