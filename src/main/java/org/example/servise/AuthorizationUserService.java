package org.example.servise;

import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationUserService {

    @Autowired
    private static UserRepository repository;

    public void createdUser(String name){
        var userEntity = new UserEntity();
        userEntity.setName(name);
        repository.save(userEntity);
    }
}
