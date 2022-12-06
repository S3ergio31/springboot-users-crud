package com.usersapiexample.users.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.usersapiexample.users.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    
}
