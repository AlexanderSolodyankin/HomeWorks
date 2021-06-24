package com.RandomSetupNames;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWomanNames implements RandomName{

    public static String name;
    public static void RandomMaleName(){
        Random ran = new Random();
        List<String> arrayNames = new ArrayList<>();
        arrayNames.add("Кирилл");
        arrayNames.add("Владимир");
        arrayNames.add("Александр");
        arrayNames.add("Федор");
        arrayNames.add("Влад");
        arrayNames.add("Ильяс");
        arrayNames.add("Руслан");
        arrayNames.add("Генадий");
        arrayNames.add("Шурик");
        arrayNames.add("Паша");
        arrayNames.add("Витя");
        arrayNames.add("Иван");
        arrayNames.add("Дима");
        arrayNames.add("Расул");
        arrayNames.add("Альтаир");
        arrayNames.add("Кецаткуатль");
        arrayNames.add("Донкан");
        arrayNames.add("Кирито");
        arrayNames.add("Андерсон");
        arrayNames.add("Смит");
        arrayNames.add("Нео");
        arrayNames.add("Костя");
        arrayNames.add("Ярик");
        arrayNames.add("Никита");
        arrayNames.add("Стас");
        name = arrayNames.get(ran.nextInt(arrayNames.size()));
    }
    public String getName(){
        RandomMaleName();
        return name;
    }
}
