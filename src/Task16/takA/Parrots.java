package Task16.takA;

import java.util.Scanner;

public class Parrots {
    String name;
    int age;
    boolean home;

    public void setAge(int age){
        Scanner sc = new Scanner(System.in);
        if(age <= 0){
            System.err.println("Нельзя задать отрицательное число задайте число больше нуля");
            age = sc.nextInt();
            setAge(age);
        }else{ this.age = age;}
    }public int getAge(){return age;}

    public void setName(String name){
        this.name = name;
    }public String getName(){return name;}

    public void setHome(boolean home){
        this.home = home;
    }public boolean getHome(){return home;}
}
