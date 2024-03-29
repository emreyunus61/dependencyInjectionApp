package com.example.dependencyinjection;

import com.example.dependencyinjection.controllers.ConstructorInjectedController;
import com.example.dependencyinjection.controllers.MyController;
import com.example.dependencyinjection.controllers.PropertyInjectedController;
import com.example.dependencyinjection.controllers.SetterInjectedController;
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


        System.out.println("------------Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());


        System.out.println("--------- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-------- Constructor" );
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());


    }





}
