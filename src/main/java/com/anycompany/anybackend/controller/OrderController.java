package com.anycompany.anybackend.controller;

import com.anycompany.anybackend.model.Order;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @GetMapping("/allOrders")
    public Order getAllOrders() {
        // todo: show all orders (admin view)
        return null;
    }

    @GetMapping("/user/{userId}/order")
    public Order showSingleOder() {
        // todo: show order user's order
        return null;
    }

    @PostMapping("/user/{userId}/cart")
    public Order createOrder() {
        return null;
    }

    @PutMapping("/user/{userId}/cart")
    public Order updateOrder() {
        return null;
    }

    @DeleteMapping("/user/{userId}/cart")
    public Order cancelOrder() {
        return null;
    }



}
