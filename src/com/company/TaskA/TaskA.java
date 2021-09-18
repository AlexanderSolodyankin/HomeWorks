package com.company.TaskA;

import java.util.ArrayList;
import java.util.List;



public class TaskA {
    public static void main(String[] args) {

        List<Liquid> liquidList  = new ArrayList<>();
        liquidList.add(new Juice("Клубничный"));
        liquidList.add(new Juice("Вишневый"));
        liquidList.add(new Juice("Кола"));
        liquidList.add(new Juice("Апельсиновый"));
        liquidList.add(new Juice("Яблочный"));
        liquidList.add(new Alcohol("Водка"));
        liquidList.add(new Alcohol("Вино"));
        liquidList.add(new Alcohol("Пиво"));
        ThePour.thePour(liquidList);


    }
}
