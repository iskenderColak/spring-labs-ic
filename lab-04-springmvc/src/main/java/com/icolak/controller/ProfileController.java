package com.icolak.controller;

import com.icolak.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

    @RequestMapping("/profile")
    public String showProfile(Model model) {

        model.addAttribute("profile", DataGenerator.createProfile());

        return "profile/profile-info";
    }
}
