package com.company;


public class Main {

    public static void main(String[] args) {
       MyLinkedList<String> list = new MyLinkedList<>();
        list.addFerstElem("frstWrite");
       list.addLastElem("LastWrite");
       list.addFerstElem("IntermediaWrite");

        System.out.println(list.getIndexElement(2));

        /**
         * реализацию получения следующего элемента я реализовал в элементе контейнере
         * так как логически только от элемента нужно отсылаться к предыдущему
         * в самом списке хранятся только два элемента это первый и последний
         *
         * Если я правильно понял в данном упражнении был явная реализация Принципа агрегации
         *
         */

    }
}
