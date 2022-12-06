package com.usersapiexample.users.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usersapiexample.users.models.User;
import com.usersapiexample.users.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Iterable<User> all(){
        return this.userRepository.findAll();
    }

    public User save(User user){
        return this.userRepository.save(user);
    }
}
