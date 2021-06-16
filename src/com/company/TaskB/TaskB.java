package com.company.TaskB;

import java.util.ArrayList;
import java.util.LinkedList;

public class TaskB {
    public static void main(String[] args) {
        LinkedList<Object> animals = new LinkedList<>();
        // создал и вложив Лист обьекты из кошек и собак
        for (int i = 0; i < 50; i++) {
            animals.add(new Cat("Cat " + (i + 1), i + 1));
            animals.add(new Dog("Dog " + (i + 1), i + 1));
        }
        System.out.println(animals.size());

        int coutCat = 0; // счетчик для того что бы удолить каждую 5 кошку
        int coutDog = 0;// счетчик что бы добавить на каждую 3 собаку одну мышку
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat) {
                // если в листе класс кошка то плюсуем счетчик
                coutCat++;
                if (coutCat % 5 == 0) {
                    // удоляю каждую 5 кошку
                    animals.remove(i);
                }
            }
            if (animals.get(i) instanceof Dog) {
                // если клас собака до считаем счетчик
                coutDog++;
                if (coutDog % 3 == 0) {
                    // добавляю мышь на каждую 3-ю собаку мышку
                    animals.add(i + 1, new Mouse("Mouse " + i, i));
                }
            }
        }
        LinkedList<Object> catAndMouse = new LinkedList<>(); // Лист для переноса рядом стоящих мышей и кошек
        ArrayList<Object> newAnimals = new ArrayList<>(); //  Скопировать весь список из пункта 4 в ArrayList
        // если честно не совсем понял что именно нужно копировать и куда в итоге скопирывал изночальный лист в АрейЛист
        int countAgeMouse = 0; //  переменная для суммы возсроста мышей
        int countAgeCat = 0; // переменая для  суммы возроста котов
        int countAgeDog = 0;// переменая для  суммы возроста собак
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Mouse) {
                countAgeMouse = countAgeMouse + ((Mouse) animals.get(i)).getAge();
            }
            if (animals.get(i) instanceof Cat) {
                countAgeCat = countAgeCat + ((Cat) animals.get(i)).getAge();
            }
            if (animals.get(i) instanceof Dog) {
                countAgeDog = countAgeDog + ((Dog) animals.get(i)).getAge();
            }
            if (i != 0) {
                // я не понял как ячейка из Листа может оброщатся к предыдущей ячейки пришлось сделать так
                if (animals.get(i - 1) instanceof Mouse && animals.get(i) instanceof Cat) {
                    // если рядом с котом мышь то переношу их в другой лист
                    catAndMouse.add(animals.get(i - 1));
                    catAndMouse.add(animals.get(i));
                    // не совсем понял условия задачи по этому удоляю рядом стоящих мышей и кошек из старого листа
                    animals.remove(i - 1);
                    animals.remove(i);

                }
            }
            if (i < animals.size() - 1) {
                if (animals.get(i) instanceof Cat && animals.get(i + 1) instanceof Mouse) {
                    // если рядом с котом мышь то переношу их в другой лист
                    catAndMouse.add(animals.get(i + 1));
                    catAndMouse.add(animals.get(i));
                    // не совсем понял условия задачи по этому удоляю рядом стоящих мышей и кошек из старого листа
                    animals.remove(i + 1);
                    animals.remove(i);
                }
            }
        }



        // копирую все из старого листа в АррейЛист с сартировкой по условиям задачи
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat) {
                // если класс кошка то добовляю ее в ночало массива
                newAnimals.add(0, animals.get(i));

            }
            if (animals.get(i) instanceof Dog) {
                // если класс собака то дели размер по полам и прибовляю однерку так как получается бак со сдвигом и кошка оказывается рядом с мышами
                newAnimals.add(newAnimals.size() / 2 + 1, animals.get(i));
            }
            if (animals.get(i) instanceof Mouse) {
                // добовляю мышей в конец списка
                newAnimals.add(newAnimals.size(), animals.get(i));
            }
        }
        for (int i = 0; i < newAnimals.size(); i++) {
            // вывожу для проверки правельности распределения по списку всех животных
            System.out.println(newAnimals.get(i));
        }

        System.out.println();
        System.out.println("Общая сума возроста всех мышей " + countAgeMouse);
        System.out.println("Общая сума возроста всех кошек " + countAgeCat);
        System.out.println("Общая сума возроста всех собак " + countAgeDog);


    }
}

