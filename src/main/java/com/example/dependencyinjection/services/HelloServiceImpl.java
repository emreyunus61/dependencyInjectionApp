package com.example.dependencyinjection.services;


import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayGreting() {

        return "Hello Guys";
    }
}
