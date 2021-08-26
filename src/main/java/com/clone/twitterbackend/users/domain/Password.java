package com.clone.twitterbackend.users.domain;

public class Password {
    public static final int MIN_LENGTH = 6;
    public static final int MAX_LENGTH = 20;

    private final String value;

    public Password(String password) {
        if (password.isBlank()) {
            //
        }

        if (!isBetweenCharacterLimit(password)) {
            //
        }

        this.value = password;
    }

    public String getValue() {
        return value;
    }

    private boolean isBetweenCharacterLimit(String password) {
        return password.length() < MIN_LENGTH || password.length() > MAX_LENGTH;
    }
}
