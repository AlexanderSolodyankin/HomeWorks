package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        YearsMonth[] arrayMonth = new YearsMonth[12];
        setArray(arrayMonth);
        ArrayList<YearsMonth> arrListMonth = new ArrayList<>();
        LinkedList<YearsMonth> linkListMonth = new LinkedList<>();
        for (int i = 0; i < arrayMonth.length; i++) {
            linkListMonth.add(arrayMonth[i]);
            arrListMonth.add(arrayMonth[i]);
        }


    }

    public static void setArray(YearsMonth[] array) {
        Random ran = new Random();
        YearsMonth[] arrMonth = new YearsMonth[12];
        arrMonth[0] = YearsMonth.JANUERY;
        arrMonth[1] = YearsMonth.FEBRUARY;
        arrMonth[2] = YearsMonth.MARCH;
        arrMonth[3] = YearsMonth.APRIL;
        arrMonth[4] = YearsMonth.MAY;
        arrMonth[5] = YearsMonth.JUNE;
        arrMonth[6] = YearsMonth.JULE;
        arrMonth[7] = YearsMonth.AUGUST;
        arrMonth[8] = YearsMonth.SEPTEMBER;
        arrMonth[9] = YearsMonth.OKTOBER;
        arrMonth[10] = YearsMonth.NOVEMBER;
        arrMonth[11] = YearsMonth.DESEMBER;
        for (int i = 0; i < array.length; i++) {
            array[i] = arrMonth[ran.nextInt(12)];
        }
    }

    public static void sort(YearsMonth[] arrays) {
        for (int i = 0; i < arrays.length; i++) {

        }

    }


}

