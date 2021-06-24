package com.company;

public class Dolmatin extends AbstractDog{
    public Dolmatin(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return String.format("Долматинец по имени: %s\n" +
                "Возраст собаки: %s\n" +
                "%s", getName(), getAge(),super.toString());
    }
}
