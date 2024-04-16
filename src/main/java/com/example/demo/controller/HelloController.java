package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    //http://localhost:8080/hello/user
    @GetMapping(value = "/user", produces = "Application/json")
    public User getUser() {
        return new User("John", LocalDateTime.now());
    }
}

