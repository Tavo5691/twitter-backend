package com.clone.twitterbackend.users.domain;

public class Username {
    private final String value;

    public Username(String username) {
        this.value = username;
    }

    public String getValue() {
        return value;
    }
}
