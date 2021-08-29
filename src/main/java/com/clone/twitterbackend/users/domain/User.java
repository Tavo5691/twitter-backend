package com.clone.twitterbackend.users.domain;

public final class User {
    private final UserId id;
    private final Username username;
    private final Email email;
    private final SecurePassword password;

    public User(UserId id, Username username, Email email, SecurePassword password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

}
