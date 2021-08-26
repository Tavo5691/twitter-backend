package com.clone.twitterbackend.users.application.create;

import com.clone.twitterbackend.users.domain.*;

public class UserCreator {
    private final UserRepository repository;

    public UserCreator(UserRepository repository) {
        this.repository = repository;
    }

    public void create(Username username, Email email, HashedPassword password) {
        var newUser = new User(username, email, password);

        repository.save(newUser);
    }
}
