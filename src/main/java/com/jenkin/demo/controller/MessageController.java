package com.jenkin.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/")
    public String showMessage() {
        return "Welcome to Jenkins! Application is running successfully.";
    }
}