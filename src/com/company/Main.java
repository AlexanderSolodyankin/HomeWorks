package com.company;


import com.Connectors.ConnectSQL_BaseClass;
import com.Connectors.ConnectSQL_Interface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        createTableUsers();
        Users user = new Users();
//        System.out.print("Введите имя пользователя: ");
//        user.setUserName(sc.nextLine());
//
//        System.out.println("Введите почту: ");
//        user.setEmail(sc.nextLine());
//
//        System.out.println("Введите пароль: ");
//        user.setPossword(sc.nextLine());

//        register(user);


        autorise("89515014507@mail.ru", "4568");


    }

    public  static void register(Users user){
        UserDataBase register = new UserDataBase();
        if( register.insertUser(user))
        {
            System.out.println("Регистрация пользователя прошла успешно.");
        }
        else
        {
            System.out.println("Регистрация пользователя провалилась.");
        }
    }

    static void createTableUsers(){
        ConnectSQL_Interface createTable = new ConnectSQL_BaseClass();
        createTable.CreateTableSQL("create table if not exists Users(" +
                "user_id serial primary key," +
                "user_name varchar(100) not null," +
                "email varchar(100) not null unique," +
                "password varchar(50) not null," +
                "date_of_registration timestamp not null" +
                ");");

        createTable.CreateTableSQL("create table if not exists User_logs(" +
                "user_log_id serial primary key," +
                "user_id integer references Users(user_id) not null," +
                "login_time timestamp not null," +
                "login_result varchar(20) not null" +
                ");");
    }

    public static void autorise(String userMail, String password){
        Users user = UserDataBase.getUserByUserName(userMail);
        if(user == null){
            System.err.println("Неверный логин или пароль!");
            return;
        }

        if(user.getPossword().equals(password)){
            UserDataBase.addUserLog(user,"SUCCESS");
            System.out.println("Вход на учетную запись был успешен");
        }
        else {
            UserDataBase.addUserLog(user,"FAIL");
            System.out.println("Вход на учетную запись был не успешен");
        }

    }
}

