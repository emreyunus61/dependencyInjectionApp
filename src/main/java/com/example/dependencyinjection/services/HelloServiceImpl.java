package com.example.dependencyinjection.services;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayGreting() {
        return "Hello Guys";
    }
}
