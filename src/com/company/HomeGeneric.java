package com.company;

public class HomeGeneric <T, E>{
    private T type;
    private E enit;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public E getEnit() {
        return enit;
    }

    public void setEnit(E enit) {
        this.enit = enit;
    }

    public String getClassInfoT(){
       return  "Ferst class: " + type.getClass() + " hashCode: " + type.hashCode();
    }


    public String getClassInfoE(){
        return  "Second class: " + enit.getClass() + " hashCode: " + enit.hashCode();
    }

    public boolean check(){
        return type.hashCode() == enit.hashCode();
    }
}
