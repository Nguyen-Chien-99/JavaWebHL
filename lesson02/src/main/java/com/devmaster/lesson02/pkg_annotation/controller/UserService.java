package com.devmaster.lesson02.pkg_annotation.controller;

import org.springframework.stereotype.Service;
@Service
public class UserService {
    public String getUserDetails(){
        return "<h1>User Details";
    }
}
