package com.example.NewProjekt.controllers;

import com.example.NewProjekt.models.Users;
import com.example.NewProjekt.models.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OControllers {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/")
    public String usersAdd(@RequestParam String first_name, @RequestParam String last_name, @RequestParam String role, Model model) {
        Users post = new Users(first_name, last_name, role);
        userRepository.save(post);
        return "redirect:/";
    }
}
