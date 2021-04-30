package Task16.takA;

import java.util.Random;
//import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Random ran = new Random();
//        Scanner sc = new Scanner(System.in);
        Bird[] perro = new Bird[3];
        Cat[] cats = new Cat[3];
        Dog[] dogs = new Dog[3];
        Fish[] fishs = new Fish[3];

        for (int i = 0; i < cats.length; i++) {
            perro[i] = new Bird();
            cats[i] = new Cat();
            dogs[i] = new Dog();
            fishs[i] = new Fish();

            fishs[i].setName(getRandomNames());
            cats[i].setName(getRandomNames());
            dogs[i].setName(getRandomNames());
            perro[i].setName(getRandomNames());

            perro[i].setWeight(ran.nextInt(100 - 1 + 1) + 1);
            dogs[i].setWeight(ran.nextInt(100 - 1 + 1) + 1);
            cats[i].setWeight(ran.nextInt(100 - 1 + 1) + 1);
            fishs[i].setWeight(ran.nextInt(100 - 1 + 1) + 1);

            perro[i].setHeight(ran.nextInt(100 - 1 + 1) + 1);
            dogs[i].setHeight(ran.nextInt(100 - 1 + 1) + 1);
            cats[i].setHeight(ran.nextInt(100 - 1 + 1) + 1);
            fishs[i].setHeight(ran.nextInt(100 - 1 + 1) + 1);

            perro[i].setAge(ran.nextInt(100 - 1 + 1) + 1);
            dogs[i].setAge(ran.nextInt(100 - 1 + 1) + 1);
            cats[i].setAge(ran.nextInt(100 - 1 + 1) + 1);
            fishs[i].setAge(ran.nextInt(100 - 1 + 1) + 1);

            // Лень было делать постоянную пропись со скана так как очень долго это все происходит
            // вот закомитил как он пишется прошу строго не судить
            // Хочу чтобы код сам себя отрабатывал так как на все классы в масивах инфу прописывать реально лень.
//            perro[i].setAge(sc.nextInt());
//            dogs[i].setAge(sc.nextInt());
//            cats[i].setAge(sc.nextInt());
//            fishs[i].setAge(sc.nextInt());

            perro[i].setHome(ran.nextBoolean());
            dogs[i].setHome(ran.nextBoolean());
            cats[i].setHome(ran.nextBoolean());
            fishs[i].setHome(ran.nextBoolean());






        }
    }
    static String getRandomNames(){
        Random ran = new Random();
        int num = ran.nextInt(10 - 4 + 1) + 1;
        StringBuilder names = new StringBuilder();
        int numWord;
        for(int i = 0; i < num;i++){
            numWord = ran.nextInt(33 -1 + 1) + 1;
            switch (numWord){
                case (1): names.append("а");
                break;
                case (2): names.append("б");
                    break;
                case (3): names.append("в");
                    break;
                case (4): names.append("г");
                    break;
                case (5): names.append("д");
                    break;
                case (6): names.append("е");
                    break;
                case (7): names.append("ё");
                    break;
                case (8): names.append("ж");
                    break;
                case (9): names.append("з");
                    break;
                case (10): names.append("и");
                    break;
                case (11): names.append("й");
                    break;
                case (12): names.append("к");
                    break;
                case (13): names.append("л");
                    break;
                case (14): names.append("м");
                    break;
                case (15): names.append("н");
                    break;
                case (16): names.append("о");
                    break;
                case (17): names.append("п");
                    break;
                case (18): names.append("р");
                    break;
                case (19): names.append("с");
                    break;
                case (20): names.append("т");
                    break;
                case (21): names.append("у");
                    break;
                case (22): names.append("ф");
                    break;
                case (23): names.append("х");
                    break;
                case (24): names.append("ц");
                    break;
                case (25): names.append("ч");
                    break;
                case (26): names.append("ш");
                    break;
                case (27): names.append("щ");
                    break;
                case (28): names.append("ь");
                    break;
                case (29): names.append("ы");
                    break;
                case (30): names.append("ъ");
                    break;
                case (31): names.append("э");
                    break;
                case (32): names.append("ю");
                    break;
                case (33): names.append("я");
                    break;
                default:continue;

            }
        }
        return names.toString();
    }
}
