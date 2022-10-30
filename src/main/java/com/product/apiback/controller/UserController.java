package com.product.apiback.controller;

import com.product.apiback.entity.UserEntity;
import com.product.apiback.entity.UserListEntity;
import com.product.apiback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserController {

    @Autowired
    private UserService service;


    @GetMapping("/users")
    public ResponseEntity list() {
        return service.listAll();
    }

    @PostMapping("/register")
    public ResponseEntity add(@RequestBody UserEntity user) {
        return service.save(user);
    }


//    @GetMapping
//    public ResponseEntity getAll() {
//        var user1 = new User();
//        user1.setName("user1");
//        var user2 = new User();
//        user2.setName("user2");
//
//
//        var userList = List.of(user1,user2);
//        var userResponse = new UserResponse();
//        userResponse.setUsers(userList);
//
//        return new ResponseEntity(userResponse, HttpStatus.OK);
//
////        return new ResponseEntity(productRepository.findAll(), HttpStatus.OK);
//    }


    //    @GetMapping("/products/{id}")
//    public ResponseEntity<Product> get(@PathVariable Integer id) {
//        try {
//            Product product = service.get(id);
//            return new ResponseEntity<Product>(product, HttpStatus.OK);
//        } catch (NoSuchElementException e) {
//            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
//        }
//    }


//    @PutMapping("/products/{id}")
//    public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer id) {
//        try {
//            Product existProduct = service.get(id);
//            service.save(product);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (NoSuchElementException e) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

//    @DeleteMapping("/products/{id}")
//    public void delete(@PathVariable Integer id) {
//        service.delete(id);
//    }
}
