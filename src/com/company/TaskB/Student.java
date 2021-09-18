package com.company.TaskB;

public class Student implements Test{
    private String name;

    public Student(Test test) {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void testSetup() {
        System.out.println("Здает тест " + name + " ( " + getClass() +" )");
    }
}
