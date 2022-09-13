package com.example.dependencyinjection.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){

        System.out.println("Merhaba");

        return "Hi Yunus";
    }

}
