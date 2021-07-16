package com.SQL_Tables_Car;

import com.Connectors.PostgreSQL_Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarSQL extends PostgreSQL_Connect implements CarSetter {


    @Override
    public List<Car> getAll() {
        List<Car> cars = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try{
            connection = connect();
            statement = connection.prepareStatement("select * from car;");
            resultSet = statement.executeQuery();
            cars = new ArrayList<>();

            while(resultSet.next()){
                Car car = new Car();
                car.setId(resultSet.getInt("id"));
                car.setCarName(resultSet.getString("car_name"));
                cars.add(car);
            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                resultSet.close();
            }catch (SQLException sql){
                sql.printStackTrace();
            }
            try {
                statement.close();
            }catch (SQLException sql){
                sql.printStackTrace();
            }
            try{
                connection.close();
            }catch (SQLException sql){
                sql.printStackTrace();
            }
        }
        return cars;
    }
}
