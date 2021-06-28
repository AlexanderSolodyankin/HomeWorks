package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> invetar1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            invetar1.add(new Apple());
        }
        invetar1.add(new Book());
        invetar1.add(new Coca_Cola());
        ArrayList<Object> invetar2 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            invetar2.add(new TenisBall());
        }
        invetar2.add(new File());
        invetar2.add(new Whother());
        ArrayList<Object> invetar3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            invetar3.add(new Apple());
            if(i <= 3){
                invetar3.add(new TenisBall());
            }
        }
        invetar3.add(new Coca_Cola());

        // Показательная запись принципа работы написал сухо если успеею то перепешу ее интереснее через методы
        // и через Абстрактные классы Но тут думаю больше подойдут общий метод




    }
}

