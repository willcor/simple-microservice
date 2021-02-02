package com.cortez.willie.simplemicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = {"","/","/hello"})
    public String hello(){
        return "Hello from Azure Spring Cloud\n";
    }

    @GetMapping("/hola")
    public String hola(){
        return "En espaniol amigos!";
    }
}
