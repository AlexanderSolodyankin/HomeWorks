package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
            Map<Integer, Integer> numberCount = new HashMap<>();
        Random ran = new Random();

        for (int i = 0; i < 1000; i++) {
            Integer currentNumber = ran.nextInt(101);
            if(numberCount.containsKey(currentNumber)){
                numberCount.put(currentNumber, numberCount.get(currentNumber) + 1);
            }else {
                numberCount.put(currentNumber, 1);
            }
        }

        for(Map.Entry<Integer, Integer> enty : numberCount.entrySet()){
            System.out.println(enty);
        }

    }


}
