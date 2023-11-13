package com.example.accountmanager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hobbies")
public class Hobbie {

    @Id
    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "hobbie_name", nullable = false)
    private String hobbieName;

    public Hobbie(String login, String hobbieName) {
        this.login = login;
        this.hobbieName = hobbieName;
    }

    public Hobbie() {

    }

    public String getLogin() {
        return login;
    }

    public String getHobbieName() {
        return hobbieName;
    }


    public static final class HobbieBuilder {
        private String login;
        private String hobbieName;

        private HobbieBuilder() {
        }

        public HobbieBuilder withLogin(String login) {
            this.login = login;
            return this;
        }

        public HobbieBuilder withHobbieName(String hobbieName) {
            this.hobbieName = hobbieName;
            return this;
        }

        public Hobbie build() {
            return new Hobbie(login, hobbieName);
        }
    }
}
