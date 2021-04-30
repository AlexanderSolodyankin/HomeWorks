package Task16.takA;


import java.util.Random;

public class Cat {
    int weight;
    int height;
    int age;
    boolean home;
    String name;

    public void setHeight(int hei) {
        if (hei <= 0) {
            System.err.println("Кошка не может иметь отрицательный рост");
        } else {
            if (hei <= 10) {
                System.out.println("Маленькая кошка!");
            }
            if (hei > 10 && hei < 100) {
                System.out.println("Большая Кошка!");
            } else {
                System.err.println("Что то пошло не так и рост кошки больше допустимого!!!!");
            }
            height = hei;
        }
    }public int getHeight(){return height;}

    public void setWeight(int wei) {
        if (wei <= 0) {
            System.err.println("Кошка невесомая (Такое НЕВОЗМОЖНО!!!!!!)");
        } else {
            if (wei <= 10) {
                System.out.println("Худая кошка!");
            }
            if (wei > 10 && wei < 100) {
                System.out.println("Толстая Кошка!");
            } else {
                System.err.println("У кошки сильное ожирение!!!!");
            }
            weight = wei;
        }
    }public int getWeight(){return weight;}

    public void setAge(int age) {
        if (age <= 0) {
            System.err.println("Отрицательный возраст такое быть не может!!!");
        } else {
            if (age <= 10) {
                System.out.println("Молодая кошка!");
            }
            if (age > 10 && age < 20) {
                System.out.println("Старая Кошка!");
            } else {
                System.err.println("Кошка безсмертная!!!!");
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

