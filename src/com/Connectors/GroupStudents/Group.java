package com.Connectors.GroupStudents;

public class Group {
    private int id;
    private String name;
    private int student;

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(" Номер группы: %s, Имя группы: %s, Количество учеников: %s", id, name, student);
    }
}
