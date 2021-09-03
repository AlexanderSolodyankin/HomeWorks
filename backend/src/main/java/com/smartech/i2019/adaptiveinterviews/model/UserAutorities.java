package com.smartech.i2019.adaptiveinterviews.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users_autorities")
public class UserAutorities {
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "role", nullable = false)
    private String role;
    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    @MapsId
    private User user;
    @Id
    private long user_id;

}
