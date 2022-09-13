package com.example.dependencyinjection;

import com.example.dependencyinjection.controllers.MyController;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(DependencyInjectionApplication.class, args);



        MyController myController = (MyController) ctx.getBean("myController");

        String  hello = myController.sayHello();

        System.out.println(hello);

    }





}
