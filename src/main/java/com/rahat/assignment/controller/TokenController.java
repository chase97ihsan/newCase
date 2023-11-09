package com.rahat.assignment.controller;
import com.rahat.assignment.client.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.StringReader;

@RestController
@RequestMapping("/token")
public class TokenController {

    private TokenService tokenService;
    @Autowired
    public TokenController(TokenService tokenService) {
        this.tokenService = tokenService;
    }
@PostMapping("/get")
    public String get(){


    return "It worked.";


    }

    @GetMapping("/")
    public String  ex(){
        System.out.println("Çalıştı");
    return "Çalıştı";
    }
}
