package RandomStringParametr;

import java.util.ArrayList;
import java.util.Random;

public interface randomString {
      Random ran = new Random();



    static ArrayList<String> getArrayNames(){
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
    }
     static String getName(){
        return getArrayNames().get(ran.nextInt(getArrayNames().size()));
    }
     static String getName(int i){
        return getArrayNames().get(i);
    }

    static ArrayList<String> getArraySerNames(){
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
    }
    static String getSerName(){
        return getArraySerNames().get(ran.nextInt(getArraySerNames().size()));
    }
    static String getSerName(int i){
        return getArraySerNames().get(i);
    }


    static ArrayList<String> getArrayPatronymic(){
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
    }
    static String getPatronymic(){
        return getArrayPatronymic().get(ran.nextInt(getArrayPatronymic().size()));
    }
    static String getPatronymic(int i){
        return getArrayPatronymic().get(i);
    }


}
