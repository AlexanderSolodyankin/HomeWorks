package org.example.taskA;

import org.example.Connectors.PostgreSQL_Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

public class CarSQLBase extends PostgreSQL_Connect {

    public  HashMap<CarReester, Car> setCarDataBase(){
        HashMap<CarReester,Car> carsMap = new HashMap<>();

        try(Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(
                    "select c.car_id , c.car_numbers,  ci.model, ci.color, ci.manufacture_year,\n" +
                    "ci.price from  cars c\n" +
                    "join car_info ci on ci.id_car = c.car_id ;");
            ResultSet resultSet = statement.executeQuery()){
            while(resultSet.next()){
                CarReester carReester = new CarReester();
                Car car = new Car();
                carReester.setId(resultSet.getInt("car_id"));
                carReester.setNumber(resultSet.getString("car_numbers"));
                car.setModel(resultSet.getString("model"));
                car.setColor(resultSet.getString("color"));
                car.setManufactureYear(resultSet.getInt("manufacture_year"));
                car.setPrice(resultSet.getInt("price"));
                carsMap.put(carReester,car);
            }

        }catch (Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return  carsMap;
    }
}
