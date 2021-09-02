package com.company.dao;

import com.company.model.User;

import java.util.List;

public interface UserDaoInterface {
    User saveUser(User user);
    List<User> getAll();
}
