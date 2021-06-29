package com.anycompany.anybackend.controller;

import com.anycompany.anybackend.model.Category;
import com.anycompany.anybackend.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUsers() {
        // todo: return list of users as JSON
        return null;
    }

    @PostMapping("/user/")
    public User createUser(@RequestBody User user) {
        // todo: adds a new user to a list of users
        return null;
    }

    @GetMapping("/user/{userId}")
    public User getUserInfo(@PathVariable int userId) {
        // todo: get info for a specific user
        return null;
    }

    @PutMapping("/user/{userId}")
    public User changeUserInfo(@PathVariable int userId) {
        // todo: change attributes of a specific user
        return null;
    }

    @DeleteMapping("/user/{userId}")
    public User removeUser(@PathVariable int userId){
        // todo: delete specific user from database
        return null;
    }

}
