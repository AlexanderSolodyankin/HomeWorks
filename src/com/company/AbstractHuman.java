package com.company;

public abstract class AbstractHuman {
    private String name;
    private String serName;
    private String patronymic;
    private int age;
    private boolean gender;

    public AbstractHuman(String name, String serName, String patronymic, int age, boolean gender) {
        this.name = name;
        this.serName = serName;
        this.patronymic = patronymic;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format
                        ("Имя: %s\n" +
                        "Фамилия: %s\n" +
                        "Отчество: %s\n" +
                        "Возраст: %s\n" +
                        "Пол: %s\n",
                        name, serName, patronymic, age, gender? "Мужской" : " Женский");
    }
}
