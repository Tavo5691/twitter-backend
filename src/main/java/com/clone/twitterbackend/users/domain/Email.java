package com.clone.twitterbackend.users.domain;

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
        //TODO: Throw error in case is not
    }
}
