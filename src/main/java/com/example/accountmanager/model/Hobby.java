package com.example.accountmanager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hobbies")
public class Hobby {

    @Id
    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "hobby_name", nullable = false)
    private String hobbyName;

    public Hobby(String login, String hobbyName) {
        this.login = login;
        this.hobbyName = hobbyName;
    }

    public Hobby() {

    }

    public String getLogin() {
        return login;
    }

    public String getHobbyName() {
        return hobbyName;
    }


    public static final class HobbyBuilder {
        private String login;
        private String hobbyName;

        private HobbyBuilder() {
        }

        public HobbyBuilder withLogin(String login) {
            this.login = login;
            return this;
        }

        public HobbyBuilder withHobbyName(String hobbyName) {
            this.hobbyName = hobbyName;
            return this;
        }

        public Hobby build() {
            return new Hobby(login, hobbyName);
        }
    }
}
