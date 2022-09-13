package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.HelloService;

public class SetterInjectedController {

    private  HelloService helloService;

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public String getGreeting(){

        return  helloService.sayGreting();
    }

}
