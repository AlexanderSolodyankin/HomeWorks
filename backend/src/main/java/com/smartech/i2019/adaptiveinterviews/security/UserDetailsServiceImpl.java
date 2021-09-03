package com.smartech.i2019.adaptiveinterviews.security;

import com.smartech.i2019.adaptiveinterviews.api.UsersAutoritiesService;
import com.smartech.i2019.adaptiveinterviews.model.UserAutorities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UsersAutoritiesService usersAutoritiesService;

    @Override
    public UserDetails loadUserByUsername(String username) {
        UserAutorities user = usersAutoritiesService.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        ArrayList<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority("ROLE_" + user.getRole()));
        return new User(user.getUsername(), user.getPassword(), roles);
    }

}
