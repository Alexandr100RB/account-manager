package com.example.accountmanager.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Getter
@Builder(toBuilder = true)
@Entity
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Setter(value = AccessLevel.PUBLIC)
@Table(name = "users")
public class User {

    @Id
    @Column (name = "login", nullable = false)
    private final String login;

    @Column (name = "name")
    private final String name;

    @Column (name = "password", nullable = false)
    private final String password;
}
