package com.company;

public class Main {

    public static void main(String[] args) {

        double num = 5;

        CompositionThread compositionThread1 = new CompositionThread(num);
        compositionThread1.start();
        num = compositionThread1.getNum();
        DifferensThread differensThread1 = new DifferensThread(num);
        differensThread1.start();
        num = differensThread1.getNum();
        QuotientThread quotientThread1 = new QuotientThread(num);
        quotientThread1.start();
        num = quotientThread1.getNum();
        SumThread sumThread1 = new SumThread(num);
        sumThread1.start();
        num = sumThread1.getNum();

        System.out.println("Итог вывода числа: " + num);
    }
}

/**
 * Что для вас поток?
 * это независимая ветка времени за которое выполнется алгоритм действи.
 *
 * Как вы понимаете многопоточное программирование?
 * Одновременное выполнение веток алгоритмов не зависящих друг от друга
 *
 * Для чего по-вашему нам нужны потоки?
 * Для одновременного ввода нескольких пользователей в одну базу данных из разных точек или терминалов.
 *
 * Представьте себе, что люди работают параллельно над одной задачей, какие проблемы могут всплыть из-за этого?
 * Такая работа может привести к спутыванию информации или ее замещения при несоблюдений договоренностей.
 *
 *
 * Что такое synchronized?
 * синхронезированное действие 
 *
 *
 */
