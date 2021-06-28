package com.company;


import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        LinkedList<Person> arrayPerson = new LinkedList<>();
//        Person person = new Person("da","da","da",true);
//        Person person1 = new Person("da7","da","da",true);
//        arrayPerson.add(person);
//
//        arrayPerson = attachObject( arrayPerson, person1);

        System.out.println();
    }
    public static LinkedList<Person> attachObject(LinkedList<Person> arrayObject, Person object){
        try {
            if(arrayObject.contains(object)){
                throw new RuntimeException();
            }
            else {
                arrayObject.add(object);
            }
        }catch (RuntimeException ranExept){
            System.err.println("Попался обьект который находится в массиве");
        }finally {
            System.out.println("Длина массива: " + arrayObject.size());
        }
        return arrayObject;

    }


}

