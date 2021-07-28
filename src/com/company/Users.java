package com.company;

import java.util.Date;

public class Users {
    private int id;
    private String userName;
    private String email;
    private String possword;
    private Date dateOfRegistration;

    public Users(){}

    public Users(int id, String userName, String email, String possword, Date dateOfRegistration) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.possword = possword;
        this.dateOfRegistration = dateOfRegistration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPossword() {
        return possword;
    }

    public void setPossword(String possword) {
        this.possword = possword;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }
}
