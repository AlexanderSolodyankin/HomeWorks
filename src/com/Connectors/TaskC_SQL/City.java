package com.Connectors.TaskC_SQL;

import java.util.ArrayList;

public class City {
    public static int countCity = 0;
    private int idCity;
    private String name;
    private People mayor;
    private ArrayList<People> popular;

    public City(){
        countCity++;
        this.idCity = countCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People getMayor() {
        return mayor;
    }

    public void setMayor(People mayor) {
        this.mayor = mayor;
    }

    public ArrayList<People> getPopular() {
        return popular;
    }

    public void setPopular(ArrayList<People> popular) {
        this.popular = popular;
    }

    public int getIdCity() {
        return idCity;
    }
}
