package com.Connectors.TaskC_SQL;

public class People {
    public static int countPeople = 0;
    private int idPeople;
    private String name;
    private String serName;
    private String patronymic;
    private int day;
    private int month;
    private int year;

    public People(){
        countPeople++;
        this.idPeople = countPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIdPeople() {
        return idPeople;
    }
}
