package com.clone.twitterbackend.users.domain;

import java.util.UUID;

public final class UserId {

    private final String value;

    public UserId(String id) {
        ensureIsValidUUID(id);

        this.value = id;
    }

    public String getValue() {
        return value;
    }

    private void ensureIsValidUUID(final String id) throws IllegalArgumentException {
        try {
            UUID.fromString(id);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Invalid userId");
        }
    }

}
