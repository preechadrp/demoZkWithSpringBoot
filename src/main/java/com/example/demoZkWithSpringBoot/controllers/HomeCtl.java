package com.example.demoZkWithSpringBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")  //สร้างเพื่อให้พิมพ์ http://localhost:8080/home   โดยไม่ต้องใส่ .zul ต่อท้าย
public class HomeCtl {
 
    @GetMapping()
    public String menu() {
        return "home"; //ไม่ต้องใส่  .zul ต่อท้าย
    }

}
