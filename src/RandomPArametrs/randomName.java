package RandomPArametrs;

import java.util.ArrayList;
import java.util.Random;

public interface randomName {
    ArrayList<String> names = new ArrayList<>();

  static void randomName(){
        names.add("Павел");
        names.add("Михаил");
        names.add("Владимир");
        names.add("Сергей");
        names.add("Дмитрий");
        names.add("Александр");
    }
    default String name(){
        Random ran = new Random();
        randomName();
        return names.get(ran.nextInt(names.size()));
    }
}
