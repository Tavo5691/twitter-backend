package com.clone.twitterbackend.users.domain;

import java.util.Objects;

public class User {
    private final Username username;
    private final Email email;
    private final HashedPassword password;

    public User(Username username, Email email, HashedPassword password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Username getUsername() {
        return username;
    }

    public Email getEmail() {
        return email;
    }

    public HashedPassword getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, password);
    }
}
