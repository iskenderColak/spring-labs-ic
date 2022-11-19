package com.icolak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestParam String email, @RequestParam String phoneNumber, Model model) {

        model.addAttribute("email", email);
        model.addAttribute("phoneNumber", phoneNumber);
        model.addAttribute("loginMessage", "Login Successful");

        return "login/login-info";
    }
/*
    @RequestMapping("/login/{email}/{phoneNumber}")
    public String login(@PathVariable String email, @PathVariable String phoneNumber, Model model) {

        model.addAttribute("email", email);
        model.addAttribute("phoneNumber", phoneNumber);
        model.addAttribute("loginMessage", "Login Successful");

        return "login/login-info";
    }

*/
}
