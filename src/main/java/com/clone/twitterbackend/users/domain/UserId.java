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
        //TODO: Throw domain exception
        UUID.fromString(id);
    }

}
