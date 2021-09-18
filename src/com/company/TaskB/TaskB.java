package com.company.TaskB;

public class TaskB {
    public static void main(String[] args) {

        Student student1 = new Student("Иван");
        student1.testSetup();

        new Student("Петр").testSetup();
        new Student("Сергей").testSetup();


        new Test() {
            @Override
            public void testSetup() {
                System.out.println("Анонимный тест неизвестного студента");
            }
        }.testSetup();






    }
}
