package com.smartech.i2019.adaptiveinterviews.controller;

import com.smartech.i2019.adaptiveinterviews.api.UserService;
import com.smartech.i2019.adaptiveinterviews.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/users")
@Tag(name = "Пользователи", description = "Взаимодействие с пользователями")
public class UserController {
    @Autowired
    private UserService userService;

    @Operation(summary = "Список всех пользователей")
    @GetMapping()
    ResponseEntity<List<User>> findAll() {
        List<User> users = userService.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @Operation(summary = "Найти пользователя по ID")
    @GetMapping("/find/{id}")
    ResponseEntity<User> findUser(@PathVariable @Min(1) Long id) throws EntityNotFoundException {
        User user = userService.findById(id);
        if (user == null) {
            throw new EntityNotFoundException();
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Operation(summary = "Обновить данные пользователя")
    @PutMapping("/update/{id}")
    ResponseEntity<User> updateUser(@RequestBody User user) {
        userService.edit(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Operation(summary = "Удалить пользователя")
    @DeleteMapping("/delete/{id}")
    @Secured("ROLE_ADMIN")
    ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return new ResponseEntity<>("User deleted", HttpStatus.OK);
    }

    @Operation(summary = "Добавить нового пользователя")
    @PostMapping("/add")
    ResponseEntity<User> addUser(@RequestBody User user) {
        userService.add(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
