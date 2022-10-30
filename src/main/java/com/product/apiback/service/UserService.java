package com.product.apiback.service;


import com.product.apiback.entity.UserEntity;
import com.product.apiback.models.ListUsers;
import com.product.apiback.repository.UserList;
import com.product.apiback.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserList userListRepository;

    public ResponseEntity listAll() {
        ListUsers listUsers = new ListUsers();
        listUsers.setUsersList(userRepository.findAll());
        return new ResponseEntity(listUsers, HttpStatus.OK);
    }

    public ResponseEntity save(UserEntity user) {
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.CREATED);
    }

}
