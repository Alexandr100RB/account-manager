package com.example.accountmanager.repository;

import com.example.accountmanager.model.Hobbie;
import com.example.accountmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface HobbieRepository extends JpaRepository<Hobbie, String> {
    List<Hobbie> findByLogin(String login);
}
