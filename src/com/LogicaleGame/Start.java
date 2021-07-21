package com.LogicaleGame;

import java.util.Scanner;

public class Start {
    Scanner sc = new Scanner(System.in);
    People[] leftShore = new People[4];
    People[] rightShore = new People[4];
    People[] outPeoples = new People[4];
    Boolean shore;
    GameStatus gameStatus;

    public void setPeople() {
        leftShore[0] = new People("Вах", 1);
        leftShore[1] = new People("Ах ", 2);
        leftShore[2] = new People("Бах", 5);
        leftShore[3] = new People("Юг ", 10);

        rightShore[0] = null;
        rightShore[1] = null;
        rightShore[2] = null;
        rightShore[3] = null;

        shore = true;

        outPeoples[0] = new People("Вах", 1);
        outPeoples[1] = new People("Ах ", 2);
        outPeoples[2] = new People("Бах", 5);
        outPeoples[3] = new People("Юг", 10);
    }

    public void runGame() {
        setPeople();
        gameStatus = GameStatus.GAME_RUN;
        int time = 18, count = 0;
        System.out.println("Игра началась");
        while (time > 0) {
            System.out.println("У вас осталось " + time + " часов");
            time = runBoat(time);
            if (leftShore[0] == null && leftShore[1] == null &&
                    leftShore[2] == null && leftShore[3] == null && !shore) {
                gameStatus = GameStatus.GAME_WIN;
                break;
            }
        }
        if(time <= 0){
            gameStatus = GameStatus.GAME_LOST;
        }

        switch (gameStatus){
            case GAME_WIN -> System.out.println("Вы выйграли!!!!");
            case GAME_LOST -> System.err.println("Вы проиграли");
        }
    }

    int runBoat(int time) {
        int b, a;
        System.out.println("Чтобы выбрать человека выберите его номер");
        for (int i = 0; i < outPeoples.length; i++) {
            System.out.print(outPeoples[i] + ". = " + (i + 1) +  "                 " );
            System.out.printf("%s |&| %s\n",leftShore[i] == null?"Пусто":leftShore[i].getName(),
                    rightShore[i] == null?"Пусто":rightShore[i].getName());
        }

        System.out.printf("Лодка находится на %s берегу. \n", shore? "левом" : "правом");
        System.out.println("Кого вы выбирите?");
        a = sc.nextInt() - 1;
        if (shore) {
            while (true) {
                if (leftShore[a] != null) {
                    break;
                } else {
                    System.err.println("Этот человек находится на другом берегу!!!");
                    System.err.println("повторите попытку");
                    a = sc.nextInt() - 1;
                }
            }
            System.out.println("Выберите второго человека который сядет в лодку");
            b = sc.nextInt() - 1;
            while (true) {
                if (leftShore[b] != null) {

                    break;
                } else {
                    System.err.println("Этот человек находится на другом берегу!!!");
                    System.err.println("повторите попытку");
                    b = sc.nextInt() - 1;
                }
            }
            if (leftShore[a].getTime_step() > leftShore[b].getTime_step()) {
                time -= leftShore[a].getTime_step();
            } else time -= leftShore[b].getTime_step();
            shore = false;
            rightShore[a] = leftShore[a];
            leftShore[a] = null;
            rightShore[b] = leftShore[b];
            leftShore[b] = null;
        }
        else {
            while (true) {
                if (rightShore[a] != null) {
                    break;
                } else {
                    System.err.println("Этот человек находится на другом берегу!!!");
                    System.err.println("повторите попытку");
                    a = sc.nextInt() - 1;
                }
            }
            time -= rightShore[a].getTime_step();
            shore = true;
            leftShore[a] = rightShore[a];
            rightShore[a] = null;
        }
        return time;
    }
}
