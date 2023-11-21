package com.example.accountmanager.repository;

import com.example.accountmanager.model.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface HobbiesRepository extends JpaRepository<Hobby, String> {
    List<Hobby> findByLogin(String login);
}
