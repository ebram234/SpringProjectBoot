package com.example.demo.controller;

import com.example.demo.service.AuthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    public AuthService authService;
    public AuthController(AuthService s) {
       this.authService = s;
    }

    @GetMapping("/login")
    public String login() {
        return authService.s();
    }


}
