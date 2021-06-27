package com.RandomSetupNames;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWomansName implements RandomName{

    public static String name;
    public static void RandomWomanName(){
        Random ran = new Random();
        List<String> arrayNames = new ArrayList<>();
        arrayNames.add("Лариса");
        arrayNames.add("Марина");
        arrayNames.add("Ксюша");
        arrayNames.add("Даша");
        arrayNames.add("Ира");
        arrayNames.add("Юля");
        arrayNames.add("Кристина");
        arrayNames.add("Алина");
        arrayNames.add("Фиона");
        arrayNames.add("Екатерина");
        arrayNames.add("Лиза");
        arrayNames.add("Жанна");
        arrayNames.add("Саша");
        arrayNames.add("Александра");
        arrayNames.add("Лукреция");
        arrayNames.add("Ева");
        arrayNames.add("Астра");
        arrayNames.add("Таня");
        arrayNames.add("Даша");
        arrayNames.add("Алена");
        arrayNames.add("Кврина");
        arrayNames.add("Аура");
        arrayNames.add("Камила");
        arrayNames.add("Эльза");
        arrayNames.add("Валентина");
        name = arrayNames.get(ran.nextInt(arrayNames.size()));
    }
    public String getName(){
        RandomWomanName();
        return name;
    }
}
