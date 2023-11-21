package com.example.accountmanager.service;

import com.example.accountmanager.response.Response;
import com.example.accountmanager.response.ResponseStatus;
import com.example.accountmanager.model.Hobby;
import com.example.accountmanager.repository.HobbiesRepository;
import com.example.accountmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbyService {

    private HobbiesRepository hobbiesRepository;
    private UserRepository userRepository;
    @Autowired
    public HobbyService(HobbiesRepository hobbiesRepository,
                        UserRepository userRepository) {
        this.hobbiesRepository = hobbiesRepository;
        this.userRepository = userRepository;
    }

    public Response saveHobby(Hobby hobby) {
        if (!userRepository.existsByLogin(hobby.getLogin())) {
            return Response.ResponseBuilder.aResponse()
                    .withMessage("Account doesn't exists")
                    .withResponseStatus(ResponseStatus.ACCOUNT_NOT_FOUND)
                    .build();
        }
        hobbiesRepository.save(hobby);
        return Response.ResponseBuilder.aResponse()
                .withResponseStatus(ResponseStatus.OK)
                .build();
    }

    public List<Hobby> getAllHobbies() {
        return hobbiesRepository.findAll();
    }
}
