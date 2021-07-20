package com.LogicaleGame;

import java.util.Scanner;

public class Start {
    Scanner sc = new Scanner(System.in);
    People[] leftShore = new People[4];
    People[] rightShore = new People[4];
    People[] outPeoples = new People[4];
    Shore shore;


    public Start() {


    }

    public void setPeople() {
        leftShore[0] = new People("Вах", 1);
        leftShore[1] = new People("Ах", 2);
        leftShore[2] = new People("Бах", 5);
        leftShore[3] = new People("Юг", 10);

        rightShore[0] = null;
        rightShore[1] = null;
        rightShore[2] = null;
        rightShore[3] = null;

        shore = Shore.LEFT_SHOR;

        outPeoples[0] = new People("Вах", 1);
        outPeoples[1] = new People("Ах", 2);
        outPeoples[2] = new People("Бах", 5);
        outPeoples[3] = new People("Юг", 10);
    }

    void runGame() {

        int time = 18;
        System.out.println("Игра началась");
        while (time > 0) {
            time = runBoat(time);
            if (rightShore[0] != null && rightShore[1] != null &&
                    rightShore[2] != null && rightShore[3] != null && shore == Shore.RIGHT_SHOR) {
                break;
            }
        }
        if (time > 0 && shore == Shore.RIGHT_SHOR) {
            System.err.println("Поздровляю вы выйграли!!!!");
        } else System.err.println("Вы проиграли!!!!");
    }

    int runBoat(int time) {
        int b, a;

        for (int i = 0; i < outPeoples.length; i++) {
            System.out.println("Чтобы выбрать человека выберите его номер");
            System.out.println(outPeoples[i] + " = " + i + 1);
            System.out.println(leftShore[i].getName() + "||||" + rightShore[i].getName());
        }
        System.out.println("Кого вы выбирите?");
        a = sc.nextInt() - 1;

        if (shore == Shore.LEFT_SHOR) {
            while (true) {
                if (leftShore[a] != null) {
                    rightShore[a] = leftShore[a];
                    leftShore[a] = null;
                    System.out.println("Выберите второго человека который сядет в лодку");
                    b = sc.nextInt() - 1 ;
                    break;
                } else {
                    System.err.println("Этот человек находится на другом берегу!!!");
                    System.err.println("повторите попытку");
                    a = sc.nextInt() - 1;
                }
            }
            while (true) {
                if (leftShore[b] != null) {
                    rightShore[b] = leftShore[b];
                    leftShore[b] = null;
                    break;
                } else {
                    System.err.println("Этот человек находится на другом берегу!!!");
                    System.err.println("повторите попытку");
                    b = sc.nextInt() - 1 ;
                }
            }
            if (leftShore[a].getTime_step() > leftShore[b].getTime_step()) {
                time -= leftShore[a].getTime_step();
            } else time -= leftShore[b].getTime_step();
        }

        if (shore == Shore.RIGHT_SHOR) {
            while (true) {
                if (rightShore[a] != null) {
                    leftShore[a] = rightShore[a];
                    rightShore[a] = null;
                    break;
                } else {
                    System.err.println("Этот человек находится на другом берегу!!!");
                    System.err.println("повторите попытку");
                    a = sc.nextInt();
                }
            }
            time = -rightShore[a].getTime_step();
        }

        return time;
    }
}
