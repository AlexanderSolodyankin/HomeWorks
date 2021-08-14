package org.example.taskC.model;

import java.util.Date;

public class User {
    private String login;
    private String password;
    private String email;
    private Date date;
    private boolean gender;
    private String text;

    public User(String login, String password, String email, Date date, boolean gender, String text) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.date = date;
        this.gender = gender;
        this.text = text;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("Логин: %s\n" +
                "Пароль: %s \n" +
                "Почта: %s \n" +
                "Дата рождения: %s %s %s  \n" +
                "Пол: %s\n" +
                "Коротко о себе: %s \n", login, password, email,date, gender?"Мужской" : "Женский", text);
    }
}
