package com.lucascesca.webserviceproject.resources;

import com.lucascesca.webserviceproject.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User("Maria", "maria@gmail.com", "32995201040", "123456789");

        return ResponseEntity.ok().body(u);
    }
}
