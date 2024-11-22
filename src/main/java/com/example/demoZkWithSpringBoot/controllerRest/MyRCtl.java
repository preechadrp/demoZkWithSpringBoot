package com.example.demoZkWithSpringBoot.controllerRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyRCtl {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, ZK with Spring Boot and REST API!";
    }
}
