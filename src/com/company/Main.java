package com.company;


import com.SQL_Tables_Car.CarSQL;
import com.SQL_Tables_Car.CarSetter;

public class Main {

    public static void main(String[] args) {
        CarSetter carSetter = new CarSQL();

        for (int i = 0; i < carSetter.getAll().size(); i++) {
            System.out.println(carSetter.getAll().get(i));
        }

    }
}

