package com.RandomSetupNames;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWomansName implements RandomName{

    public static String name;
    public static String serName;
    public static String patronymic;
    public static void RandomWomanName(){
        Random ran = new Random();
        List<String> arrayNames = new ArrayList<>();        List<String> arraySerName = new ArrayList<>();
        arrayNames.add("Лариса");                            arraySerName.add("Сергуина");
        arrayNames.add("Марина");                            arraySerName.add("Солодянкина");
        arrayNames.add("Ксюша");                             arraySerName.add("Спивак");
        arrayNames.add("Даша");                              arraySerName.add("Житникова");
        arrayNames.add("Ира");                               arraySerName.add("Харингтон");
        arrayNames.add("Юля");                               arraySerName.add("Зельвитская");
        arrayNames.add("Кристина");                          arraySerName.add("Бочкарева");
        arrayNames.add("Алина");                             arraySerName.add("Криваручко");
        arrayNames.add("Фиона");                             arraySerName.add("Синельщикова");
        arrayNames.add("Екатерина");                         arraySerName.add("Глазырина");
        arrayNames.add("Лиза");                              arraySerName.add("Петухова");
        arrayNames.add("Жанна");                             arraySerName.add("Городецкая");
        arrayNames.add("Саша");                              arraySerName.add("Мишурина");
        arrayNames.add("Александра");                        arraySerName.add("Медведева");
        arrayNames.add("Лукреция");                          arraySerName.add("Путинова");
        arrayNames.add("Ева");                               arraySerName.add("Белинская");

        List<String> arrayPatronymic = new ArrayList<>();
        arrayPatronymic.add("Кирилловна");
        arrayPatronymic.add("Владимировна");
        arrayPatronymic.add("Александровна");
        arrayPatronymic.add("Федоровна");
        arrayPatronymic.add("Владиславовна");
        arrayPatronymic.add("Ильясовна");
        arrayPatronymic.add("Русланова");
        arrayPatronymic.add("Генадиевна");
        arrayPatronymic.add("Павловна");
        arrayPatronymic.add("Ивановна");
        patronymic = arrayPatronymic.get(ran.nextInt(arrayPatronymic.size()));
        name = arrayNames.get(ran.nextInt(arrayNames.size()));
        serName = arraySerName.get(ran.nextInt(arraySerName.size()));
    
    }
    public String getName(){
        RandomWomanName();
        return name;
    }
    public String getSerName(){
        RandomWomanName();
        return serName;
    }
    public String getPatronymic(){
        RandomWomanName();
        return patronymic;
    }
}
