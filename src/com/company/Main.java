package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            map.put(i, "{write [" + i + "]}");
        }
        map.entrySet().stream().filter(e -> e.getKey() > 5).forEach(e -> System.out.print(e.getValue() + " "));
        System.out.println();
        map.entrySet().stream().filter(e -> e.getKey() % 3 == 0).forEach(e -> System.out.print(e.getValue() + ", "));
        System.out.println();
        int num = map.entrySet()
                .stream()
                .filter(e -> e.getValue().length() > 5)
                .mapToInt(Map.Entry::getKey)
                .reduce(1, (x, y) -> x * y);
        System.out.println(num);
        System.out.println();
        // Если честно я без понятия как я это сделал но если честно работал методом тыка!!!!!! вот и натыкал
        // надо мне мапы подучить так как я вообще не знаю как с ними работать

        List<Integer> list = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(ran.nextInt(100 - 1 + 1) + 1);
        }
        list.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.print("["+e + "] "));
        System.out.println();
      List<Integer> listNums = list.stream().filter(e -> e % 2 != 0).map(e -> e + 10).collect(Collectors.toList());
        System.out.println(listNums);



    }
}

/**
 * Инструкции
 * Задача A.
 *
 * Заполнить HashMap10 строковыми объектами <Integer,String>.
 *
 * Через стримы получить строки у которых ключ > 5
 *
 * Если ключ % 3 == 0 вывести строки через запятую.
 *
 * Перемножить все ключи, где длина строки > 5.
 *
 *
 *
 * Задачa Б.
 *
 * Создать лист из целых случайных чисел в диапазоне от 1 до 100, при помощи стримов сделайте следующие действия:
 *
 * Выведите на консоль только четные числа
 *
 * При помощи фильтра, выберите только нечетные числа,
 * к каждому числу добавьте 10 при помощи мэп, и сохраните в отдельный список.
 */
