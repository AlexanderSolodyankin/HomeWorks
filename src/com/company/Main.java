package com.company;


import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /**_________________________________________ Задача А ____________________________________________________*/
        ArrayList<String> song = new ArrayList<>();
        song.add("Ветер с моря дул");
        song.add("Нагонял беду");
        song.add("И сказал ты мне");
        song.add("Больше не приду");
        int cout = song.size();
        ArrayList<String> copySong = new ArrayList<>();

        for (int i = 0; i < song.size(); i++) {
            if (cout != 0) {
                song.add(i, song.get(i));
                cout--;
                i++;
            }
            if (cout == 0) break;
        }
        System.out.println(song);

        for (int i = 0; i < song.size(); i++) {
            if (song.get(i).length() >= 15 && !song.get(i).equals("И сказал ты мне")) {
                copySong.add(song.get(i));
            }
        }
        System.out.println(copySong);

        /**_________________________________________ Задача Б ____________________________________________________*/

        Random ran = new Random();
        int randomNambers;
        ArrayList<Integer> notEvenNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int i = 0; i <= 50; i++ ){
            randomNambers = ran.nextInt(100 - 1 + 1) + 1;
            if(randomNambers % 2 == 0){
                evenNumbers.add(randomNambers);
            }else {
                notEvenNumbers.add(randomNambers);
            }
        }
        System.out.println();
        System.out.println("___________________________________ Задача Б _________________________________________");
        System.out.println();
        System.out.println(evenNumbers);
        System.out.println(notEvenNumbers);
    }
}

/**
 * 1. Как вы понимаете массивы?
 * Массивы это переменная - переменных то есть какая то переменная которая хронит какоето количество
 * других переменных с какими то значениями. Ну или кластер обьектов.
 *
 * 2. Как вы понимаете ArrayList?
 *  это то же самый масив только с добавленными функциями и с более расширинными возможностями.
 *
 * 3. В чем отличия между обычным массивом и ArrayList?
 * В ArrayList есть методы и функции которые позволяют более удобнее работать с массивом
 * В обычном же массиве у нас нет каких либо функции и для работы с ним у нас есть только функция перебера или оброщения к ячейке
 * Еще в обычный массив нам нужно задать длину масива а ArrayList является динамическим.
 *
 *4. Как вы понимаете Wrapper классы и для чего они нужны?
 * Ну нас учили что Java это обьектно_орентированый язык програмирования где мы постоянно работаем с обьектами
 * но если подумать то примитивные переменные типа int double boolean char float не являются обьектами как токовыми
 * но поскольку мы можем их использовать как обьекты передвинуть прибавить умножить или еще что то с ними сделать
 * то получается так что мы работаем как бы с обьектами и получается порадокс. Wrapper нам нужен для того что бы мы могли
 * использовать наши приметивные переменные как обьекты или как классы в тех или иных случаях где по сути просто расширяются
 * фукции приметивной переменной путем добовление функции методов
 *
 *  5. Чем отличаются методы set(a, b) и add(a, b) у ArrayList?
 *  set дает нам возможность изменить элемент в масиве под нужным нам индексом
 *  add добовляет элемент в массив сдвигая все элементы после индекса
 */

