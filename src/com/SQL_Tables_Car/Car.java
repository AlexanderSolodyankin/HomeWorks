package com.SQL_Tables_Car;

public class Car {
    private int id;
    private String carName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return String.format("Номер машины: %s, Имя машины: %s", id, carName);
    }
}
