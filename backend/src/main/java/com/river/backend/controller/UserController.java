package com.river.backend.controller;

import com.river.backend.model.UserModel;
import com.river.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/users")
    ResponseEntity<Boolean> addUser(@RequestBody UserModel user){
        System.out.println(user.toString());
        return userService.addUser(user);
    }
}
