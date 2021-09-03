package com.smartech.i2019.adaptiveinterviews.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Главная страница", description = "Управление корневой конечной точкой")
public class MainController {

    @Operation(summary = "Главная страница")
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}