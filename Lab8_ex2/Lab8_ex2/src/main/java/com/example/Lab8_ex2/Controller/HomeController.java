package com.example.Lab8_ex2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Trang giới thiệu
    @GetMapping("/about")
    public String about() {
        return "about";
    }
}