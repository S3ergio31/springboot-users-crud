package com.usersapiexample.users.services;

import java.util.Optional;

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

    public void delete(User user){
        this.userRepository.delete(user);
    }

    public Optional<User> find(Long id){
        return this.userRepository.findById(id);
    }

    public Iterable<User> findByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public Boolean delete(Long id) {
        try {
            this.userRepository.deleteById(id);
            return true;
        }
        catch(Exception ex){
            return false;
        }
    }
}
