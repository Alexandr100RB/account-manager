package com.example.accountmanager.repository;

import com.example.accountmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    List<User> findByLogin(String login);

    boolean existsByLogin(String login);

}
