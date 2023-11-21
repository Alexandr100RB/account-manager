package com.example.accountmanager.service;

import com.example.accountmanager.response.Response;
import com.example.accountmanager.response.ResponseStatus;
import com.example.accountmanager.model.User;
import com.example.accountmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Response saveUser(User user) {
        if (userRepository.existsByLogin(user.getLogin()))  {
            return Response.ResponseBuilder.aResponse()
                    .withMessage("Account already exists")
                    .withResponseStatus(ResponseStatus.ACCOUNT_ALREADY_EXISTS)
                    .build();
        }
        userRepository.save(user);
        return Response.ResponseBuilder.aResponse()
                .withResponseStatus(ResponseStatus.OK)
                .build();
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
