package com.company;

import java.util.Objects;

public class Person {
    private String name;
    private String serName;
    private String patronymic;
    private boolean gender;

    public Person(String name, String serName, String patronymic, boolean gender) {
        this.name = name;
        this.serName = serName;
        this.patronymic = patronymic;
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
        return this.patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("%s \n" +
                "Имя: %s\n" +
                "Фамилия: %s\n" +
                "Отчество: %s\n", gender? "Мужчина": "Женщина", name, serName, patronymic);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return gender == person.gender && Objects.equals(name, person.name) && Objects.equals(serName, person.serName) && Objects.equals(patronymic, person.patronymic);
    }

    @Override
    public int hashCode() {
        int num = name.hashCode() + serName.hashCode() + patronymic.hashCode();
        return Objects.hash(num);
    }
}
