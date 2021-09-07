package com.company;

public class CompositionThread extends Thread{
    private double num;

    public CompositionThread(double num) {
        this.num = num;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    @Override
    public void run() {
        this.num = num * 2;
        System.out.println(this.num);
    }
}
