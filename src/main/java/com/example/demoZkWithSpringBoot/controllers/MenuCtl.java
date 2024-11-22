package com.example.demoZkWithSpringBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")  //สร้างเพื่อให้พิมพ์ http://localhost:8080/menu   โดยไม่ต้องใส่ .zul ต่อท้าย
public class MenuCtl {
    
    @GetMapping()
    public String menu() {
        return "menu"; //ไม่ต้องใส่  .zul ต่อท้าย
    }

}
