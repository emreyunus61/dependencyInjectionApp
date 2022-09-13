package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.HelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new ConstructorInjectedController(new HelloServiceImpl());


    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}