package com.clone.twitterbackend.users.application.create;

import com.clone.twitterbackend.users.domain.*;

public final class UserRegistrar {

    private final UserRepository repository;

    public UserRegistrar(UserRepository repository) {
        this.repository = repository;
    }

    public void register(final UserId id, final Username username, final Email email,
                         final SecurePassword securePassword) {

        final var newUser = new User(id, username, email, securePassword);

        repository.save(newUser);
    }
}
