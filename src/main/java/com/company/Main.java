package com.company;

import com.company.dao.UserDaoInterface;
import com.company.dao.impl.UserDaoImpl;
import com.company.model.Clock;
import com.company.model.User;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
//        User user = new User();
//        user.setLogin("Бакай");
//        user.setPassword("qwerty");
//        UserDaoInterface userDB = new UserDaoImpl();
//        User outUser = userDB.saveUser(user);
//        System.out.println(outUser);

        System.out.println(new Clock());
    }
}
