package com.company;


import com.RandomSetupNames.Gender;
import com.RandomSetupNames.RandomName;
import com.RandomSetupNames.SetupName;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
            RandomName name; // параметр для создания случайного имени
            Random ran = new Random();
        ArrayList<AbstractDog> cheksDog = new ArrayList<>();
        Set<AbstractDog> dogs = new HashSet<>(); // создаю Set-массив для того чтобы не было повторений
        for (int i = 0; i < 40; i++) {
            if (ran.nextBoolean()){ // параметр для того чтобы выбрать мужское или женское имя для собаки
                name = SetupName.getName(Gender.MALES); // задает мужское имя для собаки
            }else {
                name = SetupName.getName(Gender.WOMANS); // задает женское имя для собаки
            }
            cheksDog.add(new Dolmatin(name.getName(), ran.nextInt(15 - 2 +1) +1)); // Вношу значение в новую собаку

        }

        for (int i = 0; i <cheksDog.size(); i++) {
            dogs.add(cheksDog.get(i));
            System.out.println(cheksDog.get(i));
            System.out.println();
        }
        System.out.println(cheksDog.size());
        System.out.println();

        System.out.println("_------------------- Вывод Set-Массива на индевидуальность-------------------------------");

        for(AbstractDog dog: dogs){ // создал цикл для вывода на консольк собак
            System.out.println(dog);

            System.out.println();
        }
        System.out.println(dogs.size()); // вывел длину масива для проверки работоспособности

        /**
         * Надеюсь я правельно понял смысл домашки
         * Для данной домашки я создал возможность создания нового имени в отдельном пакете код на данную функцию
         * Если я правельно понял нужно было переопределить метод equals и hashCode что и было сделано
         * Сам массив
         */
    }

    /** -------------------------------Таск Б---------------------------------------------
     * 1. Как вы понимаете hashCode?
     * это индекс который проверяет на то что обьект похож на тот или иной
     *
     * 2. Для чего мы можем переписать метод генерирования hashCode?
     * для того чтобы исключить уменьшить вероятность возможного повторения хешкода а так же для удобства его отслеживания
     *
     * 3. Как работает HashSet?
     * работает как масив только не вклажывает в себя повторяющиеся обьекты по хэшкоду
     *
     * 4. Какие отличия есть у HashSet & ArrayList?
     * АрейЛист вкладывает в себя любые обьекты относящиеся к классу
     * а Хешсет в себя вкладывает только уникальные обьекты которые не повторяются
     *
     * 5. Как вы думаете, как мы можем избавиться от дубликатов в ArrayList при помощи HashSet?
     * перенести всю информацию которая хронится в АррейЛисте в ХешСет который уберет дубликаты
     *
     *
     */
}

