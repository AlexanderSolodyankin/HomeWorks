package com.company;

public class City implements Comparable<City>{
    private String name;
    private int code;

    public City() {
    }

    public City(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return String.format("Имя города: %s, Код города: %s", name, code);
    }

    @Override
    public int compareTo(City o) {
        return Integer.compare(code, o.getCode());
    }
}
