package com.company.TaskA;

public abstract class Liquid<T extends Liquid> {
    private String name;

    public Liquid() {
    }

    public Liquid(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void thePour(){
        System.out.println("Можно переливать " + name + " ( " + getClass() +" )");
    }
}
