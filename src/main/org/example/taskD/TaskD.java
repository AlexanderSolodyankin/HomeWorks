package org.example.taskD;

import java.util.*;

public class TaskD {
    public static void startTaskD() {
        Random ran = new Random();
        HashMap<IdNumber, AbstractFruits> frutis = new HashMap<>();
        for (int i = 1; i <= 100; i++) {
            frutis.put(new IdNumber(ran.nextInt(200000 - 100000 + 1) + 100000), new Apple("Яблоко " + i, ran.nextBoolean()));
            frutis.put(new IdNumber(ran.nextInt(300000 - 200000 + 1) + 200000), new Pear("Груша " + i, ran.nextBoolean()));
            frutis.put(new IdNumber(ran.nextInt(400000 - 300000 + 1) + 300000), new Abricot("Абрикос " +i, ran.nextBoolean()));
        }

        IdNumber[] numbers = frutis.keySet().toArray(new IdNumber[0]);
        ArrayList<Abricot> abricots = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            AbstractFruits fruct = frutis.get(numbers[i]);
            if(fruct instanceof Apple){
                frutis.remove(numbers[i]);
                System.out.println("Выкинули яблоки");
            }
            if(fruct instanceof Abricot && fruct.isIntegrity()){
                abricots.add((Abricot) fruct);
                frutis.remove(numbers[i]);
                System.out.println("Гнилые абрикосы перенесены в мусор");
            }
        }

        System.out.println(abricots.size());
    }
}
