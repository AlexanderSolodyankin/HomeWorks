package com.company;

public class Parants extends AbstractHuman{
    private String active;
    public Parants(String name, String serName, String patrols, int age, boolean gender, String active) {
        super(name, serName, patrols, age, gender);
        this.active = active;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return String.format("%s: \n %s" +
                "Обязаность: %s\n" +
                        "Где работает: %s\n",
                super.isGender()? super.getAge() >55?"Дедушка" : "Папа" : super.getAge() >55? "Бабушка" : "Мама",
                super.toString(),
                super.isGender()? "Воспитывает детей": "Следит за домом", active);
    }
}
