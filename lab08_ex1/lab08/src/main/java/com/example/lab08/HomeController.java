package com.example.lab08;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/contact")
    public String showContactForm() {
        return "contact";
    }

    @PostMapping("/contact")
    public String submitContactForm(@RequestParam String name, @RequestParam String email, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "contact-result";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping(value = "/about", method = RequestMethod.POST)
    public String handleUnsupportedMethod() {
        return "error";
    }

    // Fallback for all other paths
    @RequestMapping("/**")
    public String handleError() {
        return "error";
    }
}
