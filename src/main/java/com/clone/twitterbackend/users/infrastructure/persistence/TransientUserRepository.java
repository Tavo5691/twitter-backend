package com.clone.twitterbackend.users.infrastructure.persistence;

import com.clone.twitterbackend.users.domain.User;
import com.clone.twitterbackend.users.domain.UserRepository;

import java.util.ArrayList;
import java.util.List;

public final class TransientUserRepository implements UserRepository {
    private List<User> users = new ArrayList<>();

    @Override
    public void save(User user) {
        users.add(user);
    }
}
