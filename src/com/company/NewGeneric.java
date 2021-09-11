package com.company;

public class NewGeneric <Type>{
    private  Type t;


    public NewGeneric(Type t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "{"  + t +
                '}';
    }

    public Type getT() {
        return t;
    }

    public void setT(Type t) {
        this.t = t;
    }
}
