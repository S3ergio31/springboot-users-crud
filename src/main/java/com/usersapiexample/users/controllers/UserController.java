package com.usersapiexample.users.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.usersapiexample.users.models.User;
import com.usersapiexample.users.models.UserDeleteStatus;
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

    @PostMapping() 
    public User save(@RequestBody User user){
        return this.userService.save(user);
    }

    @GetMapping("/{id}")
    public Optional<User> find(@PathVariable Long id){
        return this.userService.find(id);
    }

    @GetMapping("/query")
    public ArrayList<User> findByEmail(@RequestParam String email) {
        return (ArrayList<User>) this.userService.findByEmail(email);
    }

    @DeleteMapping("/{id}")
    public UserDeleteStatus delete(@PathVariable Long id) {
        return this.userService.delete(id);
    }
}
