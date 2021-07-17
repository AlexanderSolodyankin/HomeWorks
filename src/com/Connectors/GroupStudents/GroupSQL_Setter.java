package com.Connectors.GroupStudents;

import com.Connectors.PostgreSQL_Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GroupSQL_Setter extends PostgreSQL_Connect implements ConnectSQL_Group  {

    @Override
    public List<Group> getAll() {
        List<Group> groups = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try{
            connection = connect();
            statement = connection.prepareStatement("select * from students_group;");
            resultSet = statement.executeQuery();
            groups = new ArrayList<>();

            while(resultSet.next()){
                Group group = new Group();
                group.setId(resultSet.getInt("id"));
                group.setName(resultSet.getString("group_name"));
                group.setStudent(getCountStudents(resultSet.getString("group_name")));
                groups.add(group);
            }

        }catch (Exception e){
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
        return groups;
    }


    public int getCountStudents (String group){
        int countStudents = 0;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = connect();
            statement = connection.prepareStatement(String.format("select count(*) from students s \n" +
                    "join students_group sg on sg.id = s.student_group\n" +
                    "where  sg.group_name = '%s';", group));
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                countStudents = resultSet.getInt(1);
            }
        }
        catch (Exception e){
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
        return countStudents;
    }
}
