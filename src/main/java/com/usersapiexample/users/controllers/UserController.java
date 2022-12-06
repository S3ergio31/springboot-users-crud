package com.usersapiexample.users.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.usersapiexample.users.models.User;
import com.usersapiexample.users.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ArrayList<User> all(){
        return (ArrayList<User>) this.userService.all();
    }

    @PostMapping("/save") 
    public User save(@RequestBody User user){
        return this.userService.save(user);
    }
}
