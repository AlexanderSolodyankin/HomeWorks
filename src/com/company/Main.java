package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] man = new Student[3];

        for (int i = 0; i < man.length; i++) {
            man[i] = new Student();
            System.out.println("Введите имя студента");
            man[i].name = sc.nextLine();
            System.out.println("Введите возрост студента");
            man[i].age = sc.nextInt();
            System.out.println("Ввдетие возрост студента");
            man[i].height = sc.nextInt();
            System.out.println("Введите на какую професию учится студетн");
            man[i].professia = sc.nextLine();
            System.out.println("Является ли студент отличником");
            man[i].excellStudy = sc.nextBoolean();
        }

        for (Student student : man) {
            System.out.println("Имя Студента" + student.name);
            System.out.println("Возрост студента" + student.age);
            if (student.age < 16) {
                System.out.println("Не может быть студентом так как учится в школе!!!");
            }
            if (student.age > 30) {
                System.out.println("Не может быть студентом так как он работает");
            } else {
                System.out.println("Является студентом!!");
            }
            System.out.println("Рост студента" + student.height);
            if (student.height > 175) {
                System.out.println("Высокого роста");
            }
            if (student.height < 150) {
                System.out.println("Студент является коротышкой!!!");
            } else {
                System.out.println(" Нормальный рост студента");
            }
            System.out.println("Професию которорую выбрал студент");
            if (student.excellStudy) {
                System.out.println("Является отличником");
            }
        }
    }
}

class Student {
    String name;
    int age;
    int height;
    String professia;
    boolean excellStudy;
}