package com.smartech.i2019.adaptiveinterviews.api;

import com.smartech.i2019.adaptiveinterviews.model.UserAutorities;

import java.util.List;

public interface UsersAutoritiesService {

    void add(UserAutorities user);

    void edit(UserAutorities user);

    void delete(long id);

    List<UserAutorities> findAll();

    UserAutorities findByUsername(String username);

}
