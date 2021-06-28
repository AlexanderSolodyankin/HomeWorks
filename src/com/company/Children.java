package com.company;

public class Children extends AbstractHuman{
    private String stady;
    public Children(String name, String serName, String patrols, int age, boolean gender, String stady) {
        super(name, serName, patrols, age, gender);
        this.stady=stady;
    }

    public String getStady() {
        return stady;
    }

    public void setStady(String stady) {
        this.stady = stady;
    }

    @Override
    public String toString() {
        return String.format("Ребенок. \n" +
                "%s %s\n" +
                "Где учится: %s\n",super.toString(),super.isGender()? "Помогает папе" : "Помогает маме" , stady);
    }
}
