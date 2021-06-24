package com.company;

import java.util.Objects;
import java.util.Random;

public class AbstractDog {
    private String name;
    private int age;

    public AbstractDog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if(this.hashCode() == o.hashCode()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.age + name.hashCode();
    }

    @Override
    public String toString() {
        Random ran = new Random();
        String[][] actions = new String[2][5];
        actions[0][0] = "Копаю";        actions[1][0] = "яму ";
        actions[0][1] = "Играю с";      actions[1][1] = "шариком ";
        actions[0][2] = "Кушаю";        actions[1][2] = "мясо ";
        actions[0][3] = "Охочусь за";   actions[1][3] = "белкой ";
        actions[0][4] = "Отдыхаю у";    actions[1][4] = "крыльца ";
        return String.format("Что собака делает:\n" +
                "%s %s",actions[0][ran.nextInt(actions[0].length)], actions[1][ran.nextInt(actions[1].length)]);
    }
}
