package com.clone.twitterbackend.users.infrastructure.http;

import com.clone.twitterbackend.users.domain.SecurePassword;

public final class RawPassword {
    public static final int MIN_LENGTH = 6;
    public static final int MAX_LENGTH = 20;

    private final String value;

    public RawPassword(String password) {
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

    private boolean isBetweenCharacterLimit(final String password) {
        return password.length() < MIN_LENGTH || password.length() > MAX_LENGTH;
    }

    public SecurePassword hash() {
        // TODO
        return null;
    }
}
