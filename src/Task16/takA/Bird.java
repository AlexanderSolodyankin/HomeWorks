package Task16.takA;

import java.util.Random;

public class Bird {
    int weight;
    int height;
    int age;
    boolean home;
    String name;

    public void setHeight(int hei) {
        if (hei <= 0) {
            System.err.println("Попугай не может иметь отрицательный рост");
        } else {
            if (hei <= 4) {
                System.out.println("Маленький папугай!");
            }
            if (hei > 4 && hei < 10) {
                System.out.println("Большой папугай!");
            } else {
                System.err.println("Что то пошло не так и рост папугая больше допустимого!!!!");
            }
            height = hei;
        }
    }public int getHeight(){return height;}

    public void setWeight(int wei) {
        if (wei <= 0) {
            System.err.println("Папугай невесомый (Улетел наверное!!!)");
        } else {
            if (wei <= 2) {
                System.out.println("Худой папугай!");
            }
            if (wei > 2 && wei < 5) {
                System.out.println("Толстый папугай!");
            } else {
                System.err.println("Папугайчик ТОЛСТЯК!!!");
            }
            weight = wei;
        }
    }public int getWeight(){return weight;}

    public void setAge(int age) {
        if (age <= 0) {
            System.err.println("Отрицательный возраст такое быть не может!!!");
        } else {
            if (age <= 4) {
                System.out.println("Молодой папугай!");
            }
            if (age > 4 && age < 7) {
                System.out.println("Старый папугай!");
            } else {
                System.err.println("Папугай безсмертный!!!");
            }
            this.age = age;
        }
    }public int getAge(){return age;}

    public void setHome(boolean home){
        Random ran = new Random();
        home = ran.nextBoolean();
        this.home = home;
    }public boolean getHome(){return home;}

    public  void setName(String name){this.name = name;}
    public String getName(){return name;}
}
