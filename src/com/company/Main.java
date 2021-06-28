package com.company;


import java.util.ArrayList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> arrayInteger = new LinkedHashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int num = arrayInteger.size();
            if(i % 5 == 0){arrayList.add(0,i);
            }else { arrayList.add(arrayList.size(),i); }
        }
        arrayInteger.addAll(arrayList);
        System.out.println(arrayInteger);

        // В HashSet не возможно закинуть все так как надо потому что хешсет сразу проверяет на индивидуальность
        // и записывает в случайном порядке



    }
}

