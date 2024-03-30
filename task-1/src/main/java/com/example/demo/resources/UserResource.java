package com.example.demo.resources;

import com.example.demo.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> getList() {
        return new ResponseEntity<List<User>>(List.of(new User().setName("Anuj Saxena").setUserId(UUID.randomUUID().toString()).setEmail("anujanu319@gmail.com"),
                new User().setName("Anuj Kumar").setUserId(UUID.randomUUID().toString()).setEmail("an@gmail.com")),
                HttpStatus.OK);
    }
}
