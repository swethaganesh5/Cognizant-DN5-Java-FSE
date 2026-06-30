package com.cognizant.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class Greeting {
    public String getMessage() {
        return "Hello from Spring Core!";
    }
}