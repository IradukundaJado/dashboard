package com.uscboard.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/")
    public String authenticate(){
        return "index";
    }
    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard/index";
    }
}
