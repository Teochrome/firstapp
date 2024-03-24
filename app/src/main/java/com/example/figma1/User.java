package com.example.figma1;

import java.io.Serializable;

public class User implements Serializable {
    private final String email;
    private final String password;

    public String Email() {
        return email;
    }

    public String Password() {
        return password;
    }

    public User(String email1, String password1) {
        email = email1;
        password = password1;
    }
}
