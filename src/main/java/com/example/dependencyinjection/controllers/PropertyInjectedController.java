package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.HelloService;

public class PropertyInjectedController {

    public HelloService helloService;

    public String getGreeting(){

        return  helloService.sayGreting();
    }
}
