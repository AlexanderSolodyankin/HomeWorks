package Task16.takA;

import java.util.Random;
import java.util.Scanner;


public class TaskA {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        Cats[] cat = new Cats[3];
        Dogs[] dog = new Dogs[3];
        Fishs[] fish = new Fishs[3];
        Parrots[] parrot = new Parrots[3];

        for (int i = 0; i < cat.length; i++) {
            cat[i] = new Cats();
            dog[i] = new Dogs();
            fish[i] = new Fishs();
            parrot[i] = new Parrots();

            cat[i].setName(getRandomNames());
            cat[i].setAge(ran.nextInt(100 - 1 + 1) + 1);
            cat[i].setHome(ran.nextBoolean());

            dog[i].setName(getRandomNames());
            dog[i].setAge(ran.nextInt(100 - 1 + 1) + 1);
            dog[i].setHome(ran.nextBoolean());

            fish[i].setName(getRandomNames());
            fish[i].setAge(ran.nextInt(100 - 1 + 1) + 1);
            fish[i].setHome(ran.nextBoolean());

            parrot[i].setName(getRandomNames());
            parrot[i].setAge(ran.nextInt(100 - 1 + 1) + 1);
            parrot[i].setHome(ran.nextBoolean());
        }

        for (int i = 0; i < cat.length; i++) {
            System.out.println("Имя Кошки " + i + ": " + cat[i].getName());
            System.out.println("Возраст кошки: " + cat[i].getAge());
            if (cat[i].getHome()) {
                System.out.println("Кошка домашняя.");
            } else {
                System.out.println("Кошка бродячая.");
            }
            System.out.println();
        }
        System.out.println("количество кошек: " + cat.length);
        System.out.println();
        System.out.println();

        for (int i = 0; i < dog.length; i++) {
            System.out.println("Имя собаки " + i + ": " + dog[i].getName());
            System.out.println("Возраст собаки: " + dog[i].getAge());
            if (dog[i].getHome()) {
                System.out.println("Собака домашняя.");
            } else {
                System.out.println("Собака бродячая.");
            }
            System.out.println();
        }
        System.out.println("количество сабак: " + dog.length);
        System.out.println();
        System.out.println();

        for (int i = 0; i < fish.length; i++) {
            System.out.println("Имя рыбы " + i + ": " + fish[i].getName());
            System.out.println("Возраст рыбы: " + fish[i].getAge());
            if (fish[i].getHome()) {
                System.out.println("Рыба домашняя.");
            } else {
                System.out.println("Рыба бродячая.");
            }
            System.out.println();
        }
        System.out.println("количество рыбок: " + fish.length);
        System.out.println();
        System.out.println();

        for (int i = 0; i < parrot.length; i++) {
            System.out.println("Имя попугая " + i + ": " + parrot[i].getName());
            System.out.println("Возраст попугая: " + parrot[i].getAge());
            if (parrot[i].getHome()) {
                System.out.println("Попугай домашний.");
            } else {
                System.out.println("Попугай бродячий.");
            }
            System.out.println();
        }
        System.out.println("количество попугайчиков: " + parrot.length);
        System.out.println();
        System.out.println();

        System.out.println("проверка на негативный возраст!!!!!");
        // так как все сделал через рандом так как задолбался все время прописывать возраст
        // запускаю тестоввый образец который работает на всех классах!!

        Cats cat1 = new Cats();
        cat1.setName("Проверочный кот на отрицание возраста!!!");
        System.out.println("Введите проверочный отрицательный возраст!!!");
        cat1.setAge(sc.nextInt());
        cat1.setHome(false);

        System.out.println(cat1.getName());
        System.out.println("Возратс проверочного кота: " + cat1.getAge());
        System.out.println(cat1.getHome() + " Не должен быть домашним");

    }

    static String getRandomNames() {
        // создал генератор случайного имени (Бред конечно но ине было интересно как это реализовано

        Random ran = new Random();
        int num = ran.nextInt(10 - 4 + 1) + 4;
        StringBuilder names = new StringBuilder();
        int numWord;
        for (int i = 0; i < num; i++) {
            numWord = ran.nextInt(33 - 1 + 1) + 1;
            switch (numWord) {
                case (1):
                    names.append("а");
                    break;
                case (2):
                    names.append("б");
                    break;
                case (3):
                    names.append("в");
                    break;
                case (4):
                    names.append("г");
                    break;
                case (5):
                    names.append("д");
                    break;
                case (6):
                    names.append("е");
                    break;
                case (7):
                    names.append("ё");
                    break;
                case (8):
                    names.append("ж");
                    break;
                case (9):
                    names.append("з");
                    break;
                case (10):
                    names.append("и");
                    break;
                case (11):
                    names.append("й");
                    break;
                case (12):
                    names.append("к");
                    break;
                case (13):
                    names.append("л");
                    break;
                case (14):
                    names.append("м");
                    break;
                case (15):
                    names.append("н");
                    break;
                case (16):
                    names.append("о");
                    break;
                case (17):
                    names.append("п");
                    break;
                case (18):
                    names.append("р");
                    break;
                case (19):
                    names.append("с");
                    break;
                case (20):
                    names.append("т");
                    break;
                case (21):
                    names.append("у");
                    break;
                case (22):
                    names.append("ф");
                    break;
                case (23):
                    names.append("х");
                    break;
                case (24):
                    names.append("ц");
                    break;
                case (25):
                    names.append("ч");
                    break;
                case (26):
                    names.append("ш");
                    break;
                case (27):
                    names.append("щ");
                    break;
                case (28):
                    names.append("ь");
                    break;
                case (29):
                    names.append("ы");
                    break;
                case (30):
                    names.append("ъ");
                    break;
                case (31):
                    names.append("э");
                    break;
                case (32):
                    names.append("ю");
                    break;
                case (33):
                    names.append("я");
                    break;
            }
        }
        return names.toString();
    }


}
