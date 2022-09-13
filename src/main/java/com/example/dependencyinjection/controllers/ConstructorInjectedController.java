package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.HelloService;

public class ConstructorInjectedController {

    private final  HelloService helloService;

    public ConstructorInjectedController(HelloService helloService) {
        this.helloService = helloService;
    }

    public String getGreeting(){

        return  helloService.sayGreting();
    }


}
