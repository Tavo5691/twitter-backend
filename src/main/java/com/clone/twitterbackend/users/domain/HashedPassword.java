package com.clone.twitterbackend.users.domain;

public class HashedPassword {
    private final String value;

    public HashedPassword(String password) {
        this.value = password;
    }

    public String getValue() {
        return value;
    }
}
