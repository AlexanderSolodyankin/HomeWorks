package com.RandomSetupFamaly;

import java.util.ArrayList;
import java.util.Random;

public class SetupHumansWomanTitles {
    Random ranTitls = new Random();
    private ArrayList<String> names;
    private ArrayList<String> serNames;
    private ArrayList<String> patronymic;



    public void setNames(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Александра");
        names.add("Лариса");
        names.add("Елизовета");
        names.add("Светлана");
        names.add("Кристина");
        names.add("Дарья");
        names.add("Карина");
        names.add("Алина");
        names.add("Наталья");
        names.add("Мария");
        names.add("Маша");
        names.add("Юля");
        this.names = names;
    }
    public void setSerNames(){
        ArrayList<String> serNames = new ArrayList<>();
        serNames.add("Терещенко");
        serNames.add("Солодянкина");
        serNames.add("Паниклова");
        serNames.add("Спивак");
        serNames.add("Канавалова");
        serNames.add("Житникова");
        serNames.add("Морозова");
        serNames.add("Зельвитская");
        serNames.add("Харинктон");
        serNames.add("Вебер");
        serNames.add("Стругатская");
        serNames.add("Городецкая");
        this.serNames = serNames;
    }
    public void setPatronymic(){
        ArrayList<String> patronymic = new ArrayList<>();
        patronymic.add("Александровна");
        patronymic.add("Владимировна");
        patronymic.add("Сергеевна");
        patronymic.add("Андреевна");
        patronymic.add("Георгиевна");
        patronymic.add("Кирилловна");
        patronymic.add("Дмитриевна");
        patronymic.add("Ярославовна");
        patronymic.add("Никитовна");
        patronymic.add("Динисовна");
        patronymic.add("Даниловна");
        patronymic.add("Михаиловна");
        this.patronymic = patronymic;
    }
}
