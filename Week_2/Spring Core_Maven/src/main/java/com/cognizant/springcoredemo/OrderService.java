package com.cognizant.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final NotificationService notificationService;

    @Autowired
    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder(String item) {
        System.out.println("Order placed for: " + item);
        notificationService.sendNotification("Your order for " + item + " is confirmed");
    }
}