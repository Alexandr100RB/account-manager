package com.example.accountmanager.controller;

import com.example.accountmanager.model.User;
import com.example.accountmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userService.saveUser(user);
        return "OK";
    }

    @GetMapping("/get-all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
