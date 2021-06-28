package com.RandomSetupNames;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomMalesNames implements RandomName{

    public static String name;
    public static String serName;
    public static String patronymic;
    public static void RandomMaleName(){
        Random ran = new Random();
        List<String> arrayNames = new ArrayList<>();        List<String> arraySerName = new ArrayList<>();
        arrayNames.add("Кирилл");                            arraySerName.add("Сергуина");
        arrayNames.add("Владимир");                          arraySerName.add("Солодянкина");
        arrayNames.add("Александр");                         arraySerName.add("Спивак");
        arrayNames.add("Федор");                             arraySerName.add("Житникова");
        arrayNames.add("Влад");                              arraySerName.add("Харингтон");
        arrayNames.add("Ильяс");                             arraySerName.add("Зельвитская");
        arrayNames.add("Руслан");                            arraySerName.add("Бочкарева");
        arrayNames.add("Генадий");                           arraySerName.add("Криваручко");
        arrayNames.add("Шурик");                             arraySerName.add("Синельщикова");
        arrayNames.add("Паша");                              arraySerName.add("Глазырина");
        arrayNames.add("Витя");                              arraySerName.add("Петухова");
        arrayNames.add("Иван");                              arraySerName.add("Городецкая");
        arrayNames.add("Дима");                              arraySerName.add("Мишурина");
        arrayNames.add("Расул");                             arraySerName.add("Медведева");
        arrayNames.add("Альтаир");                           arraySerName.add("Путинова");
        arrayNames.add("Кецаткуатль");                       arraySerName.add("Белинская");

        List<String> arrayPatronymic = new ArrayList<>();
        arrayPatronymic.add("Кириллович");
        arrayPatronymic.add("Владимирович");
        arrayPatronymic.add("Александрович");
        arrayPatronymic.add("Федорович");
        arrayPatronymic.add("Владиславович");
        arrayPatronymic.add("Ильясович");
        arrayPatronymic.add("Русланович");
        arrayPatronymic.add("Генадиевич");
        arrayPatronymic.add("Павлович");
        arrayPatronymic.add("Иванович");
        name = arrayNames.get(ran.nextInt(arrayNames.size()));
        serName = arraySerName.get(ran.nextInt(arraySerName.size()));
        name = arrayNames.get(ran.nextInt(arrayNames.size()));
    }
    public String getName(){
        RandomMaleName();
        return name;
    }
    public String getSerName(){
        RandomMaleName();
        return serName;
    }
    public String getPatronymic(){
        RandomMaleName();
        return patronymic;
    }
}
