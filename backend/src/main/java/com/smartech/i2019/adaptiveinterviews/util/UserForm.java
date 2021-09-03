package com.smartech.i2019.adaptiveinterviews.util;

import com.smartech.i2019.adaptiveinterviews.model.UserAutorities;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class UserForm {
    @NotBlank(message = "Заполните обязательное поле")
    private String name;
    @NotBlank(message = "Заполните обязательное поле")
    @Email(message = "Некорректный email адрес")
    private String email;
    @NotBlank(message = "Заполните обязательное поле")
    private String username;
    @NotBlank(message = "Заполните обязательное поле")
    private String password;
    private UserAutorities userAutorities;
    private String role;
}

