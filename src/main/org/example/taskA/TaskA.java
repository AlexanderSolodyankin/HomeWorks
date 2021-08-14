package org.example.taskA;

import org.example.Connectors.ConnectSQL_BaseClass;

import java.util.HashMap;
import java.util.Scanner;

public class TaskA {
    public static void startTaskA(){

        System.out.println("Вы хотите создать таблицы в базе данных и внести в них данные?!!!");
        System.out.println("Если да то дажмите да");
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        if(key.equals("да")) {
            sqlSetupPArametrCar();
        }
        CarSQLBase dataBase = new CarSQLBase();
        HashMap<CarReester, Car> carHashMap = dataBase.setCarDataBase();
        System.out.println(carHashMap);

    }
    static void sqlSetupPArametrCar(){
        ConnectSQL_BaseClass sqlbase = new ConnectSQL_BaseClass();
        sqlbase.createTableSQL("CREATE TABLE IF NOT EXISTS cars(" +
                "car_id serial primary key," +
                "car_numbers varchar(10) not null unique" +
                ");");
        sqlbase.createTableSQL("CREATE TABLE IF NOT EXISTS car_info(" +
                "car_info_id serial primary key," +
                "color varchar(30) not null," +
                "manufacture_year int not null," +
                "model varchar(30) not null," +
                "price int not null," +
                "id_car int references cars(car_id)" +
                ");");

        sqlbase.insertTable("INSERT INTO cars(car_numbers)" +
                "values('ac8950'), ('br8070'),('fr7080'),('ab1549z'),('RB3377q'),('DD8888t');");

        sqlbase.insertTable("INSERT INTO car_info(color,manufacture_year, model, price, id_car)" +
                "VALUES('Серый', 2015, 'Nissan', 3000, 1),('Черный', 2008, 'BMW', 500, 2)," +
                "('Желтый', 1990, 'Жигули', 1000, 3)," +
                "('Серый', 2021, 'Mazda', 6000, 4),('Розовый', 1995, 'Toyota', 2500, 5)," +
                "('Корчневый', 2000, 'Tesla', 13000, 6);");
    }
}
