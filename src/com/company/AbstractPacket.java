package com.company;

import java.util.ArrayList;

public abstract class AbstractPacket {
    private ArrayList<Object> objects;

    public AbstractPacket(){
        this.objects = new ArrayList<>();
    }

    public ArrayList<Object> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<Object> objects) {
        this.objects = objects;
    }

    public String showLed(){
        String showLed = "";
        for(Object obj: this.objects){
            showLed = showLed + obj.toString() + " ";
        }
        return showLed;
    }

    public void putObject(Object object){
        this.objects.add(object);
    }
    public void pullObject(Object object){
        this.objects.remove(object);
    }

    @Override
    public String toString(){
        return String.format("В кармане лежит: %s обьектов", objects.size());
    }

}
