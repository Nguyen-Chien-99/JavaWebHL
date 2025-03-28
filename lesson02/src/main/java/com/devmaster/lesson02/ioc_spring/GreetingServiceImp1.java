package com.devmaster.lesson02.ioc_spring;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp1 implements GreetingService {
    @Override
    public String greet(String name) {
        return "<h2>Devmaster[Spring Boot!] Xin chào,</h2> " +
                "<h1 style='color:red; text-align:center'>" + name;
    }
}
