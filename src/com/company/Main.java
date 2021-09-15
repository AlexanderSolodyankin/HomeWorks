package com.company;


import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        HomeList<Integer> nums = new HomeList<>();
        nums.addElement(45);
        nums.addElement(42);
        nums.addElement(96);
        nums.addElement(67);
        System.out.println(nums.getLastElement());
        System.out.println(nums.getIndexElement(67));



    }
}
