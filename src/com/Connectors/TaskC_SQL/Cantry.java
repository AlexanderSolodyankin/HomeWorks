package com.Connectors.TaskC_SQL;

import java.util.ArrayList;

public class Cantry {
    private String name;
    private int code;
    private int population;
    private People president;
    private ArrayList<City> cities;
    private String language;
    public static int coutConties = 0;
    private int idContry;

    public Cantry(){
        coutConties++;
        this.idContry = coutConties;
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

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public People getPresident() {
        return president;
    }

    public void setPresident(People president) {
        this.president = president;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getIdContry() {
        return idContry;
    }
}
