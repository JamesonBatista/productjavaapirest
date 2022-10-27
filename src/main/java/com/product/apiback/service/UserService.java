package com.product.apiback.service;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.product.apiback.entity.UserEntity;
import com.product.apiback.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService {



    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<List<UserEntity>> listAll() {
        List<UserEntity> user = new ArrayList<>();
        user = userRepository.findAll();
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    public ResponseEntity<UserEntity> save(UserEntity user) {
        userRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
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
