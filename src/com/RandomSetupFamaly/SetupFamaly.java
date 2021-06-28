package com.RandomSetupFamaly;

import com.company.AbstractHuman;
import com.company.Children;
import com.company.Parants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;


public class SetupFamaly {
    private HashSet<AbstractHuman> mans = new HashSet<>();

    public SetupFamaly() {
        Random random = new Random();
        ArrayList<AbstractHuman> mans = new ArrayList<AbstractHuman>();
        SetupHumansMalesTitles parametrMales = new SetupHumansMalesTitles();
        SetupHumansWomanTitles parametrsWoman = new SetupHumansWomanTitles();
        boolean randParam = random.nextBoolean();
        int nameFather = random.nextInt(parametrMales.getNames().size());
        int serNamesFather = random.nextInt(parametrMales.getSerNames().size());


        if (randParam) {
            mans.add(new Parants(parametrMales.getNames().get((Integer) nameFather),
                    parametrMales.getSerNames().get((Integer) serNamesFather),
                    parametrMales.getPatronymic().get(random.nextInt(parametrMales.getPatronymic().size())),
                    random.nextInt(75 - 20 + 1) + 20, randParam, setActiv()));
        } else {
            mans.add(new Parants(parametrsWoman.getNames().get(random.nextInt(parametrsWoman.getNames().size())),
                    parametrsWoman.getSerNames().get((Integer) serNamesFather),
                    parametrsWoman.getPatronymic().get(random.nextInt(parametrsWoman.getPatronymic().size())),
                    random.nextInt(75 - 20 + 1) + 20, randParam, setActiv()));
        }
        int numberOfPeople = random.nextInt(6);
        boolean fullFamaly = random.nextBoolean();

        while (numberOfPeople > 0){
            if(fullFamaly){ // если в семье два родителя
                if(mans.size() < 2){
                    if(mans.get(0).isGender()){ // параметр гендерного отличия если правда то отец, если лож то мать
                        // в данном случае добовляется мать(жена)
                        mans.add(mans.size() , new Parants(parametrsWoman.getNames().get(random.nextInt(parametrsWoman.getNames().size())),
                                parametrsWoman.getSerNames().get((Integer) serNamesFather),
                                parametrsWoman.getPatronymic().get(random.nextInt(parametrsWoman.getPatronymic().size())),
                                random.nextInt(75 - 20 + 1) + 20, false, setActiv()));
                        numberOfPeople--;
                    }else { // иначе добовляется муж
                        mans.add(mans.size(), new Parants(parametrMales.getNames().get((Integer) nameFather),
                                parametrMales.getSerNames().get((Integer) serNamesFather),
                                parametrMales.getPatronymic().get(random.nextInt(parametrMales.getPatronymic().size())),
                                random.nextInt(75 - 20 + 1) + 20, true, setActiv()));
                        numberOfPeople--;
                    }
                }
                if(random.nextBoolean()){// параметр определяющий ребенка мальчика или девочку
                    // в данном случае создается мальчик
                    mans.add(mans.size(), new Children(parametrMales.getNames().get(random.nextInt(parametrMales.getNames().size())),
                            mans.get(0).getSerName(),parametrMales.getPatronymic().get((Integer) nameFather),random.nextInt(18 - 1 + 1) + 1,
                            true,setStudy()));
                    numberOfPeople--;
                }else {
                    mans.add(mans.size(), new Children(parametrsWoman.getNames().get(random.nextInt(parametrsWoman.getNames().size())),
                            mans.get(0).getSerName(),parametrsWoman.getPatronymic().get((Integer) nameFather),random.nextInt(18 - 1 + 1) + 1,
                            false,setStudy()));
                    numberOfPeople--;
                }
            }
            numberOfPeople--;
        }

        for (AbstractHuman people: mans){
            this.mans.add(people);
        }

    }

    private static String setActiv() {
        Random ran = new Random();
        ArrayList<String> activ = new ArrayList<>();
        activ.add("Работает на заводе");
        activ.add("Работает Пповаром");
        activ.add("Ищет Работу");
        activ.add("Постоянно пьет");
        activ.add("Занимается Бизнесом");
        activ.add("Занимается Художеством");
        String setActive = activ.get(ran.nextInt(activ.size()));
        return setActive;
    }
    private static String setStudy() {
        Random ran = new Random();
        ArrayList<String> study = new ArrayList<>();
        study.add("Учится в школе");
        study.add("Учится в инстетуте");
        study.add("Ищет Работу");
        study.add("Играет в компьюткрные игры");
        study.add("Прогуливает школу");
        study.add("Занимается Художеством");
        String setStudy = study.get(ran.nextInt(study.size()));
        return setStudy;
    }

    public HashSet<AbstractHuman> getMans() {
        return mans;
    }
}
