package Task16.takA;

import java.util.Random;
//import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Random ran = new Random();



    }

    static String getRandomNames(){
        // создал генератор случайного имени (Бред конечно но ине было интересно как это реализовано

        Random ran = new Random();
        int num = ran.nextInt(10 - 4 + 1) + 4;
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
