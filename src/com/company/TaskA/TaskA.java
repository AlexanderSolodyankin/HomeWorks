package com.company.TaskA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

 class TaskA {

    public static void main(String[] args) {
        Random ran = new Random();

   //  -------- замеряю время работы кода для каждого из листов---------------------
        // ------------------- создание обьектов------------------------
        long arrayListCreatObject = System.currentTimeMillis();
        ArrayList<Cat> cats1 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            cats1.add(new Cat("Cat " + i, ran.nextInt(14 - 1 + 1) + 1, i));
        }
        long arrayListCreatObjectAfter = System.currentTimeMillis();

        long linkedListObjectCreatBefor = System.currentTimeMillis();
        LinkedList<Cat> cats2 = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            cats2.add(new Cat("LincCat " + i, ran.nextInt(14 - 1 + 1) + 1, i));
        }
        long linkedListObjectCreatAfter = System.currentTimeMillis();

        //------------------------Добавление ячеек в листы-------------------
        long arrayListSetObjectInArrayBrfor = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            cats1.add(i + (cats1.size() / 2), new Cat("Cat " + i, ran.nextInt(14 - 1 + 1) + 1, i));
        }
        long arrayListSetObjectInArrayAfter = System.currentTimeMillis();

        long linkedListSetObjectInArrayBrfor = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            cats1.add(i + (cats1.size() / 2), new Cat("Cat " + i, ran.nextInt(14 - 1 + 1) + 1, i));
        }
        long linkedListSetObjectInArrayAfter = System.currentTimeMillis();

        //------------------вывод в консоль----------------------------
        long arrayListPrintObjectInArrayBrfor = System.currentTimeMillis();
        for (int i = cats1.size() / 2; i < cats1.size(); i++) {
            System.out.print(cats1.get(i));
        }
        long arrayListPrintObjectInArrayAfter = System.currentTimeMillis();

        long linkedListPrintObjectInArrayBrfor = System.currentTimeMillis();
        for (int i = cats2.size() / 2; i < cats2.size(); i++) {
            System.out.print(cats2.get(i));
        }
        long linkedListPrintObjectInArrayAfter = System.currentTimeMillis();

        // ------------------ Удоление из листов ячеек----------------------
        long arrayListRemoteObjectInArrayBrfor = System.currentTimeMillis();
        for (int i = cats1.size() / 2; i < cats1.size(); i++) {
            if (cats1.size() / 2 < cats1.size() - 100) {
                cats1.remove(i);
            }
        }
        long arrayListRemoteObjectInArrayAfter = System.currentTimeMillis();

        long linkedListRemoteObjectInArrayBrfor = System.currentTimeMillis();
        for (int i = cats2.size() / 2; i < cats2.size(); i++) {
            if (cats2.size() / 2 < cats2.size() - 100) {
                cats2.remove(i);
            }
        }
        long linkedListRemoteObjectInArrayAfter = System.currentTimeMillis();

        System.out.println(); // пропуск на строку для  что бы было читабельно в консоли
        System.out.println();

        System.out.println("Программа создала объекты ArrayList за " + (arrayListCreatObjectAfter - arrayListCreatObject) + " милисекунд");
        System.out.println("Программа созадала объекты LinkedList за " + (linkedListObjectCreatAfter - linkedListObjectCreatBefor) + " милисекунд");
        System.out.println();
        System.out.println("Добовление обтектов в середину ArrayList  за " + (arrayListSetObjectInArrayAfter - arrayListSetObjectInArrayBrfor) + " милисекунд");
        System.out.println("Добовление обтектов в середину LinkedList  за " + (linkedListSetObjectInArrayAfter - linkedListSetObjectInArrayBrfor) + " милисекунд");
        System.out.println();
        System.out.println("Распечатка обтектов в  ArrayList  за " + (arrayListPrintObjectInArrayAfter - arrayListPrintObjectInArrayBrfor) + " милисекунд");
        System.out.println("Распечатка обтектов в  LinkedList  за " + (linkedListPrintObjectInArrayAfter - linkedListPrintObjectInArrayBrfor) + " милисекунд");
        System.out.println();
        System.out.println("Удоление Обьектов из ArrayList за " + (arrayListRemoteObjectInArrayAfter - arrayListRemoteObjectInArrayBrfor) + " милисекунд");
        System.out.println("Удоление Обьектов из LinkedList за " + (linkedListRemoteObjectInArrayAfter - linkedListRemoteObjectInArrayBrfor) + " милисекунд");

        // сумма времени работы АррейЛиста
        double arrayListCount = (arrayListCreatObjectAfter - arrayListCreatObject) +
                (arrayListSetObjectInArrayAfter - arrayListSetObjectInArrayBrfor) +
                (arrayListPrintObjectInArrayAfter - arrayListPrintObjectInArrayBrfor) +
                (arrayListRemoteObjectInArrayAfter - arrayListRemoteObjectInArrayBrfor);

        // сумма работы ЛинкедЛиста
        double linkedListCount = (linkedListObjectCreatAfter - linkedListObjectCreatBefor) +
                (linkedListSetObjectInArrayAfter - linkedListSetObjectInArrayBrfor) +
                (linkedListPrintObjectInArrayAfter - linkedListPrintObjectInArrayBrfor) +
                (linkedListRemoteObjectInArrayAfter - linkedListRemoteObjectInArrayBrfor);
        System.out.println();

        System.out.println("Общая работа ArrayList: " + arrayListCount + " милисекунд");
        System.out.println("Общая работа LinkedList: " + linkedListCount + " милисекунд");

        if (arrayListCount > linkedListCount) {
            System.out.println("LinkedList Работает быстрее");
        } else {
            System.out.println("ArrayList работает быстрее");
        }
        System.out.println();
        System.out.println("Длина ArrayList " + cats1.size());
        System.out.println("Длина LinkedList " + cats2.size());


    }


}

