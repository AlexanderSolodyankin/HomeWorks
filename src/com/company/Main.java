package com.company;


public class Main {

    public static void main(String[] args) {
/**
 * -----------------Task A ----------------------------
 */
        Factorial fact1 = new Factorial() {
            @Override
            public int getNumber(int a) {
                if (a != 1) a = a * getNumber(a - 1);
                return a;

        /**
         * Хотел сделать рекурсию при помощи лямбда функции. Так оно не работает или я где-то неправильно сделал?
         */
            }
        };
        System.out.println(fact1.getNumber(10));

        Factorial fact2 = (n) -> {
            int result = 1;
            for (int i = 1; i <= n ; i++) {
                result = result * i;
            }
            return result;
        };

        System.out.println(fact2.getNumber(10));
        /**
         * -----------------Task B ----------------------------
         */

            RootPow root = (p,a) ->{
                double result = 0;
                for (int i = 1; i < (a / 2); i++) {
                    result = i;
                    for (int j = 0; j <= p; j++) {
                        result = result * i;
                        if(result == a){
                            System.out.println("Корень в степерни " + p + " от " + a + " = " + i);
                            return i;
                        }
                    }
                }
                return result;
            };

        System.out.println(root.getRootPow(4,81));
    }
}
