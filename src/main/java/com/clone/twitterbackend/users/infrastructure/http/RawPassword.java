package com.clone.twitterbackend.users.infrastructure.http;

import com.clone.twitterbackend.users.domain.SecurePassword;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import static java.lang.String.format;

public final class RawPassword {
    public static final int MIN_LENGTH = 6;
    public static final int MAX_LENGTH = 20;

    private final String value;

    public RawPassword(String password) {
        ensureIsValid(password);

        this.value = password;
    }

    public String getValue() {
        return value;
    }

    private void ensureIsValid(final String password) {
        if (password.isBlank()) {
            throw new RuntimeException("Password is required");
        }

        if (!isBetweenCharacterLimit(password)) {
            throw new RuntimeException(format("Password must have between %s and %s characters", MIN_LENGTH, MAX_LENGTH));
        }
    }


    private boolean isBetweenCharacterLimit(final String password) {
        return password.length() >= MIN_LENGTH && password.length() <= MAX_LENGTH;
    }

    public SecurePassword hash(PasswordEncoder encoder) {
        String encoded = encoder.encode(this.value);
        return new SecurePassword(encoded);
    }
}
