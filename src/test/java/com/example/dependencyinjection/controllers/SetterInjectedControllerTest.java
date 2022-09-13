package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.HelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

     SetterInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new SetterInjectedController();

        controller.setHelloService(new HelloServiceImpl());

    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}