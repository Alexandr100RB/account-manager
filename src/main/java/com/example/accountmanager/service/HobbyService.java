package com.example.accountmanager.service;

import com.example.accountmanager.model.Hobby;
import com.example.accountmanager.repository.HobbiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbyService {

    private HobbiesRepository hobbiesRepository;
    @Autowired
    public HobbyService(HobbiesRepository hobbiesRepository) {
        this.hobbiesRepository = hobbiesRepository;
    }

    public ResponseStatus saveHobby(Hobby hobby) {
        hobbiesRepository.save(hobby);
        return ResponseStatus.OK;
    }

    public List<Hobby> getAllHobbies() {
        return hobbiesRepository.findAll();
    }
}
