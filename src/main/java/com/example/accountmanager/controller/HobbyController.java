package com.example.accountmanager.controller;

import com.example.accountmanager.model.Hobby;
import com.example.accountmanager.response.Response;
import com.example.accountmanager.service.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hobbies")
public class HobbyController {

    private final HobbyService hobbyService;

    @Autowired
    public HobbyController(HobbyService hobbyService) {
        this.hobbyService = hobbyService;
    }

    @PostMapping("/add")
    public Response addHobby(@RequestBody Hobby hobby) {
        return hobbyService.saveHobby(hobby);
    }

    @GetMapping("/get-all")
    public List<Hobby> getAllHobbies() {
        return hobbyService.getAllHobbies();
    }
}
