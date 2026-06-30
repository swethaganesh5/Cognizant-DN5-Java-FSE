package com.cognizant.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringcoredemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringcoredemoApplication.class, args);

        Greeting greeting = context.getBean(Greeting.class);
        System.out.println(greeting.getMessage());

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder("Laptop");
    }
}