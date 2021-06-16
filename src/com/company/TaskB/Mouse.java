package com.company.TaskB;

public class Mouse {
    private String name;
    private int age;

    public Mouse(String name, int age) {
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
    public String toString() {
        return String.format("Имя мышки: %s Возраст мышки: %s ", name, age);
    }
}
