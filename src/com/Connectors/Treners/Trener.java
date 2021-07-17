package com.Connectors.Treners;

public class Trener {
    private int id;
    private int wages;
    private String name;
    private String serName;

    public Trener(int id, int wages, String name, String serName) {
        this.id = id;
        this.wages = wages;
        this.name = name;
        this.serName = serName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
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

    @Override
    public String toString() {
        return String.format("Тренер: %s, %s, %s, Зарплата: %s %s",
                id, name, serName, wages, serName.length() > 3?  " Молодец" : "");
    }
}
