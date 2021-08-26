package com.clone.twitterbackend.users.domain;

public class Email {
    private final String value;

    public Email(String email) {
        this.value = email;
    }

    public String getValue() {
        return value;
    }
}
