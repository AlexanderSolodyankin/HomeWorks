package com.company;

public class Main {

    public static void main(String[] args) {
//        OldGenerics var = new OldGenerics(23);
//        OldGenerics var2 = new OldGenerics("String");
//        System.out.println(var);
//        System.out.println(var2);
//
//        var = var2;
//        System.out.println(var);

        NewGeneric<Integer> num = new NewGeneric<>(14);
        NewGeneric<String> write = new NewGeneric<>("Hi");

        System.out.println(num);
        System.out.println(write);



    }
}
