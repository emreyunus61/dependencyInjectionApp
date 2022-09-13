package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final  HelloService helloService;

    @Autowired
    public ConstructorInjectedController(HelloService helloService) {
        this.helloService = helloService;
    }

    public String getGreeting(){

        return  helloService.sayGreting();
    }


}
