package com.minhnhat.demodocker.demodocker.controller;

import com.minhnhat.demodocker.demodocker.entity.User;
import com.minhnhat.demodocker.demodocker.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    private final UserRepository userRepository;

    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String getCountUser(){
        return "Numbers of user: " + userRepository.count();
    }
    @GetMapping("/add-user")
    public String addUser(){
        User user = new User();
        user.setName("Minh Nhat");
        user.setAge(22);
        userRepository.save(user);
        return "Hello world";
    }
}
