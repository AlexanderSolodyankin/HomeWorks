package org.example.model;

public class User {
    private String login;
    private String password;
    private String email;
    private String gender;

    public User() {
    }

    public User(String login, String password, String email, String gender) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format(" Логин пользователя: %s \n <br> " +
                "Пароль: %s \n <br>" +
                "Почта: %s \n <br>" +
                "Пол: %s \n <br>" , login, password, email, gender);
    }
}
