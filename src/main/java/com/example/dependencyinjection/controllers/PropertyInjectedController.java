package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {


    @Autowired
    public HelloService helloService;

        public String getGreeting(){

        return  helloService.sayGreting();
    }
}
