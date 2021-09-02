package com.company.dao.impl;

import com.company.config.DaoSQL;
import com.company.dao.UserDaoInterface;
import com.company.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl extends DaoSQL implements UserDaoInterface {
    @Override
    public User saveUser(User user) {

        try(Connection connection = connect();
            PreparedStatement  statement = connection.prepareStatement("INSERT INTO users(login,password) VALUES(?,?);");
            ResultSet resultSet = statement.getGeneratedKeys()){
            statement.setString(1, user.getLogin());
            statement.setString(2,user.getPassword());
            statement.executeUpdate();
            if(resultSet.next()){
                user.setId(resultSet.getLong(1));
            }
            return user;

        }catch (Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        List<User> allUsers;
        try(Connection connection = connect();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM users;");
        ResultSet set = statement.executeQuery()){
            allUsers = new ArrayList<>();
            while (set.next()){
                User user = new User(set.getLong("id"),
                        set.getString("login"), set.getString("password"));
                allUsers.add(user);
            }

            return allUsers;

        }catch (Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return null;
    }
}
