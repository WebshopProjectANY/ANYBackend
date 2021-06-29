package com.anycompany.anybackend.controller;

import com.anycompany.anybackend.model.Cart;
import com.anycompany.anybackend.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @GetMapping("/allCarts")
    public User getAllCarts() {
        // todo: show all carts of all users (for admin)
        return null;
    }
    @GetMapping("/user/{userId}/cart")
    public User getCart() {
        // todo: show cart of specific user
        return null;
    }

    @PostMapping("/user/{userId}/cart/")
    public User createCart(@RequestBody int userId) {
        // todo: creates a cart for user
        return null;
    }

    @PutMapping("/users/{userId}/cart")
    public User updateCart(@PathVariable int userId) {
        // todo: update products (add, delete, change amount)
        return null;
    }

    @DeleteMapping("/users/{userId}/cart")
    public User deleteCart(@PathVariable int userId){
        // todo: delete cart of specific user
        return null;
    }

}
