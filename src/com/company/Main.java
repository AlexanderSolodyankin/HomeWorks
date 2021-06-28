package com.company;


import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Person> arrayPerson = new LinkedList<>();
        Person person = new Person("da","da","da",true);
        Person person1 = new Person("da","da","da",true);
        arrayPerson.add(person);

        try {
            if (arrayPerson.contains(person1)) {
                throw new RuntimeException();

            } else {
                arrayPerson.add(person1);
            }
            System.out.println(arrayPerson.size());
        }catch (RuntimeException exp){
            System.err.println("Попался похожий обьект и я вывел ошибку");
        }
        finally {
            System.out.println("Длина масива на которой произошла ошибка " + arrayPerson.size());
        }




    }


}

