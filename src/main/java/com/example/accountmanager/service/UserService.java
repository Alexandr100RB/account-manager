package com.example.accountmanager.service;

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

    public ResponseStatus saveUser(User user) {
        if (userRepository.existsByLogin(user.getLogin()))  {
            return ResponseStatus.ERROR;
        }
        userRepository.save(user);
        return ResponseStatus.OK;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
