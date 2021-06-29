package com.company;


import RandomStringParametr.RandomString;

import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        LinkedList<Person> arrayPerson = new LinkedList<>();
        int num = ran.nextInt(101);
        while (num > 0){
            arrayPerson = attachObject(arrayPerson, new Person(RandomString.getName(),
                    RandomString.getSerName(), RandomString.getPatronymic(), true));
            num--;
        }
        System.out.println(arrayPerson);





    }

    public static LinkedList<Person> attachObject(LinkedList<Person> arrayObject, Person object){
        try {
            if(arrayObject.contains(object))throw new RuntimeException();
            else arrayObject.add(object);
        }catch (RuntimeException ranExept){
            System.err.println("Попался обьект который находится в массиве");
        }finally {
            System.out.println("Длина массива: " + arrayObject.size());

        }return arrayObject;

    }


}

