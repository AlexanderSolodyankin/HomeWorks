package com.RandomSetupFamaly;

import java.util.ArrayList;

public class SetupHumansMalesTitles {

    private ArrayList<String> names;
    private ArrayList<String> serNames;
    private ArrayList<String> patronymic;


    public ArrayList<String> getNames() {
        return names;
    }

    public ArrayList<String> getSerNames() {
        return serNames;
    }

    public ArrayList<String> getPatronymic() {
        return patronymic;
    }

    public void setNames(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Александр");
        names.add("Владимир");
        names.add("Сергей");
        names.add("Андрей");
        names.add("Георгий");
        names.add("Кирилл");
        names.add("Дмитрий");
        names.add("Ярослав");
        names.add("Никита");
        names.add("Динис");
        names.add("Данил");
        names.add("Михаил");
        this.names = names;
    }
    public void setSerNames(){
        ArrayList<String> serNames = new ArrayList<>();
        serNames.add("Терещенко");
        serNames.add("Солодянкин");
        serNames.add("Паниклов");
        serNames.add("Спивак");
        serNames.add("Канавалов");
        serNames.add("Житников");
        serNames.add("Морозов");
        serNames.add("Зельвитский");
        serNames.add("Харинктон");
        serNames.add("Вебер");
        serNames.add("Стругатский");
        serNames.add("Городецкий");
        this.serNames = serNames;
    }
    public void setPatronymic(){
        ArrayList<String> patronymic = new ArrayList<>();
        patronymic.add("Александрович");
        patronymic.add("Владимирович");
        patronymic.add("Сергеевич");
        patronymic.add("Андреевич");
        patronymic.add("Георгиевич");
        patronymic.add("Кириллович");
        patronymic.add("Дмитриевич");
        patronymic.add("Ярославович");
        patronymic.add("Никитович");
        patronymic.add("Динисович");
        patronymic.add("Данилович");
        patronymic.add("Михаилович");
        this.patronymic = patronymic;
    }
}
