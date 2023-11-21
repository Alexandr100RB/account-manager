package com.example.accountmanager.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column (name = "login", nullable = false)
    private String login;

    @Column (name = "name")
    private String name;

    @Column (name = "password", nullable = false)
    private String password;


    public User(String login, String name, String password) {
        this.login = login;
        this.name = name;
        this.password = password;
    }

    public User() {

    }

    public static final class UserBuilder {
        private String login;
        private String name;
        private String password;

        private UserBuilder() {
        }

        public UserBuilder withLogin(String login) {
            this.login = login;
            return this;
        }

        public UserBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public User build() {
            return new User(login, name, password);
        }
    }


    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
