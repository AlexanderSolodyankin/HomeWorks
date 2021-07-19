package com.company;

import com.Connectors.TaskC_SQL.*;
import com.RandomStringParametr.RandomString;

import java.util.ArrayList;
import java.util.Random;

public class TaskC {
    public static void main(String[] args) {
        /**
         * Задание выполнено по принципу чтобы программа сама создовала таблицы и заполняла их
         * на работу программы уйдет примерно от 5 до 20 минут в зависимости от мощности компа
         * тренировка перед тем как сделать все рабочей уневерсальной станцией для работы с БД
         * из компелятора. Извеняюсь что код большой и запутаный из за того что отстал решил еще за одно поразбиратся
         * что да куда так как не понимал тему в опреоре.
         * что бы проверить домашку наверное будет проще запустить программу предворительно не забудьте поменять пароль
         * от своей БД в PostgreSQL!!!!!!!!!!!!
         */

        ConnectTaskC_SQL taskC_sql = new CreatSQL();
        String creteTableFerst = "create table peoples(" +
                "id integer primary key not null," +
                "people_name varchar not null," +
                "people_serName varchar not null," +
                "people_patronymic varchar not null," +
                "people_birthday date not null);";
        taskC_sql.CreateTableSQL(creteTableFerst);

        String createContryTable = "create table contry(" +
                "id integer primary key," +
                "contry_name varchar not null," +
                "contry_code integer not null," +
                "popular integer not null," +
                "president integer references peoples(id) not null);";
        taskC_sql.CreateTableSQL(createContryTable);

        String createCityTable = "create table City(" +
                "id integer primary key not null," +
                " city_name varchar not null," +
                " contry_Id integer references Contry(id) not null," +
                " meyor_id integer references peoples(id) not null," +
                " popular_city integer not null);";
        taskC_sql.CreateTableSQL(createCityTable);

        Cantry[] cantries = getCantries();


        for (int i = 0; i < cantries.length; i++) {
            for (int j = 0; j < cantries[i].getCities().size(); j++) {
                for (int k = 0; k < cantries[i].getCities().get(j).getPopular().size(); k++) {
                    String insertPeople = String.format
                            ("Insert into peoples(id, people_name, people_sername, people_patronymic, people_birthday)\n" +
                                    "values(%s, '%s','%s','%s','%s-%s-%s');",
                                    cantries[i].getCities().get(j).getPopular().get(k).getIdPeople(),
                                    cantries[i].getCities().get(j).getPopular().get(k).getName(),
                                    cantries[i].getCities().get(j).getPopular().get(k).getSerName(),
                                    cantries[i].getCities().get(j).getPopular().get(k).getPatronymic(),
                                    cantries[i].getCities().get(j).getPopular().get(k).getYear(),
                                    cantries[i].getCities().get(j).getPopular().get(k).getMonth(),
                                    cantries[i].getCities().get(j).getPopular().get(k).getDay());
                    taskC_sql.InsertTable(insertPeople);
                }
            }
        }

        for (int i = 0; i < cantries.length; i++) {
            String insertContrySQL = String.format
                    ("Insert into contry(id, contry_name, contry_code, popular, president) \n" +
                                    "values(%s,    '%s',            %s,       %s,       %s);",
                            cantries[i].getIdContry(), cantries[i].getName(), cantries[i].getCode(),
                            cantries[i].getPopulation(), cantries[i].getPresident().getIdPeople());
            taskC_sql.InsertTable(insertContrySQL);
            for (int j = 0; j < cantries[i].getCities().size(); j++) {
                String insertCitySQL = String.format
                        ("Insert into city(id, city_name, contry_id, meyor_id, popular_city)\n" +
                                        "values(%s, '%s', %s, %s, %s);",
                                cantries[i].getCities().get(j).getIdCity(), cantries[i].getCities().get(j).getName(),
                                cantries[i].getIdContry(), cantries[i].getCities().get(j).getMayor().getIdPeople(),
                                cantries[i].getCities().get(j).getPopular().size());
                taskC_sql.InsertTable(insertCitySQL);
            }
        }



        taskC_sql.addColumsInTable("contry", "language");
        for (int i = 0; i < cantries.length; i++) {
            String language = String.format("update contry\n" +
                    "set %slanguage%s = '%s'\n" +
                    "where id = %s;\n" +
                    "commit;",'"', '"', RandomString.getCantryLanguage(), i+1);
            taskC_sql.InsertTable(language);
        }
        String outSQL = "select ci.id, ci.city_name from contry c \n" +
                "join city ci on ci.contry_id = c.id \n" +
                "where c.contry_name like 'К%';";
        taskC_sql.InsertTable(outSQL);


    }

    static Cantry[] getCantries() {
        Random ran = new Random();
        Cantry[] cantries = new Cantry[5];
        for (int i = 0; i < cantries.length; i++) {
            int popularContry = 0;
            cantries[i] = new Cantry();
            cantries[i].setName(RandomString.getCantry());
            cantries[i].setCode(ran.nextInt(1000));
            cantries[i].setLanguage(RandomString.getCantryLanguage());
            ArrayList<City> cities = new ArrayList<>();
            for (int j = 0; j < ran.nextInt(10 - 3 + 1) + 3; j++) {
                cities.add(new City());
                cities.get(j).setName(RandomString.getCity());
                ArrayList<People> popular = new ArrayList<>();
                for (int k = 0; k < ran.nextInt(10000 - 10 + 1) + 10; k++) {
                    popular.add(new People());
                    if (ran.nextBoolean()) {
                        popular.get(k).setName(RandomString.getName_Male());
                        popular.get(k).setSerName(RandomString.getSerName_Male());
                        popular.get(k).setPatronymic(RandomString.getPatronymic_Male());
                    } else {
                        popular.get(k).setName(RandomString.getName_Woman());
                        popular.get(k).setSerName(RandomString.getSerName_Woman());
                        popular.get(k).setPatronymic(RandomString.getPatronymic_Woman());
                    }
                    popular.get(k).setDay(ran.nextInt(28 - 1 + 1) + 1);
                    popular.get(k).setMonth(ran.nextInt(12 - 1 + 1) + 1);
                    popular.get(k).setYear(ran.nextInt(2021 - 1970 + 1) + 1970);
                }
                cities.get(j).setPopular(popular);
                cities.get(j).setMayor(popular.get(ran.nextInt(popular.size())));
                popularContry += popular.size();
            }
            cantries[i].setPopulation(popularContry);
            cantries[i].setCities(cities);
            int ranCity = ran.nextInt(cities.size());
            cantries[i].setPresident(cities.get(ranCity).getPopular().get
                    (ran.nextInt(cities.get(ranCity).getPopular().size())));
        }
        return cantries;
    }


}
