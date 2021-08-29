package com.clone.twitterbackend.users.infrastructure.http;

import com.clone.twitterbackend.users.application.create.UserRegistrar;
import com.clone.twitterbackend.users.domain.Email;
import com.clone.twitterbackend.users.domain.UserId;
import com.clone.twitterbackend.users.domain.Username;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class UsersPostController {

    private final UserRegistrar registrar;

    public UsersPostController(UserRegistrar registrar) {
        this.registrar = registrar;
    }

    @PostMapping("users/{id}")
    public ResponseEntity<String> registerUser(@PathVariable String id, @RequestBody Request request) {
        final var userId = new UserId(id);
        final var username = new Username(request.getUsername());
        final var email = new Email(request.getEmail());

        final var rawPassword = new RawPassword(request.getPassword());
        final var securePassword = rawPassword.hash();

        registrar.register(userId, username, email, securePassword);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

final class Request {
    private final String username;
    private final String email;
    private final String password;

    public Request(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
