package com.LogicaleGame;

public class People {
    private String name;
    private int time_step;


    public People(String name, int time_step) {
        this.name = name;
        this.time_step = time_step;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime_step() {
        return time_step;
    }

    public void setTime_step(int time_step) {
        this.time_step = time_step;
    }



    @Override
    public String toString() {
        return String.format("%s плывет: %s ч", name, time_step);
    }
}
