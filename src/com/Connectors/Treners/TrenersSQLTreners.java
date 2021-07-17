package com.Connectors.Treners;

import com.Connectors.PostgreSQL_Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrenersSQLTreners extends PostgreSQL_Connect implements ConnectSQL_Treners {
    @Override
    public List<Trener> getAll() {
        List<Trener> treners = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try{
            connection = connect();
            statement = connection.prepareStatement("select * from treners;");
            resultSet = statement.executeQuery();
            treners = new ArrayList<>();

            while (resultSet.next()){
                Trener trener = new Trener(resultSet.getInt("id"),
                        resultSet.getInt("wages"),
                        resultSet.getString("trener_name"),
                        resultSet.getString("trener_sername"));
                treners.add(trener);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                resultSet.close();
            }catch (SQLException sql){
                sql.printStackTrace();
            }

            try{
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
        return treners;
    }
}
