package com.clone.twitterbackend.users.domain;

import java.util.regex.Pattern;

public final class Email {
    private final String value;

    public Email(final String email) {
        ensureIsValid(email);

        this.value = email;
    }

    public String getValue() {
        return value;
    }

    private void ensureIsValid(final String email) {
        if (null == email || email.isBlank()) {
            throw new RuntimeException("Email is required");
        }

        boolean isValid = Pattern.compile("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")
                .matcher(email)
                .find();

        if (!isValid) {
            throw new RuntimeException("Invalid email");
        }
    }
}
