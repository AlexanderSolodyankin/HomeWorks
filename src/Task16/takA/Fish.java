package Task16.takA;

import java.util.Random;

public class Fish {
    int weight;
    int height;
    int age;
    boolean home;
    String name;

    public void setHeight(int hei) {
        if (hei <= 0) {
            System.err.println("Рыбка не может иметь отрицательный рост");
        } else {
            if (hei <= 4) {
                System.out.println("Маленькая Рыбка!");
            }
            if (hei > 4 && hei < 10) {
                System.out.println("Большая Рыбка!");
            } else {
                System.err.println("Что то пошло не так и рост рыбки больше допустимого!!!!");
            }
            height = hei;
        }
    }public int getHeight(){return height;}

    public void setWeight(int wei) {
        if (wei <= 0) {
            System.err.println("Рыбка невесомая (Сьели!!!)");
        } else {
            if (wei <= 2) {
                System.out.println("Худая Рыбка!");
            }
            if (wei > 2 && wei < 5) {
                System.out.println("Толстая Рыбка!");
            } else {
                System.err.println("Рыбка ОГРОМНАЯ!!!");
            }
            weight = wei;
        }
    }public int getWeight(){return weight;}

    public void setAge(int age) {
        if (age <= 0) {
            System.err.println("Отрицательный возраст такое быть не может!!!");
        } else {
            if (age <= 4) {
                System.out.println("Молодая Рыбка!");
            }
            if (age > 4 && age < 7) {
                System.out.println("Старая Рыбка!");
            } else {
                System.err.println("Рыбка безсмертная!!!");
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
