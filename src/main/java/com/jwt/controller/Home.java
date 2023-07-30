package com.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/welcome")
    public String welcome(){

        return "This is private page you are accessing";
    }

    @GetMapping("/getusers")
    public String getUsers(){

        return "{\"name\":\"Akash\"}";
    }

}
