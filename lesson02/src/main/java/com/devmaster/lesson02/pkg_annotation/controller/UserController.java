package com.devmaster.lesson02.pkg_annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private final UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
    @GetMapping("/user")
    public String getUser(){
        return userService.getUserDetails();
    }
    @GetMapping("/users")
    public String getUsers() {
        return "<h1>Get all users</h1>";
    }

    @PostMapping("/users")
    public String createUser() {
        return "<h1>User created</h1>";
    }

    @PutMapping("/users/{id}")
    public String updateUser(@PathVariable int id) {
        return "<h1>User with ID " + id + " updated</h1>";
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        return "<h1>User with ID " + id + " deleted</h1>";
    }
}
