package com.company;

public class SumThread extends Thread{

    private double num;

    public SumThread(double num) {
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
        this.num = num + 2;
        System.out.println(this.num);
    }
}
