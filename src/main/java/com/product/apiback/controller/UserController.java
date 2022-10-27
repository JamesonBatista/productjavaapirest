package com.product.apiback.controller;

import com.product.apiback.entity.UserEntity;
import com.product.apiback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public ResponseEntity<List<UserEntity>> list() {
        return service.listAll();
    }

    @PostMapping("/register")
    public void add(@RequestBody UserEntity user) {
        service.save(user);
    }
}
