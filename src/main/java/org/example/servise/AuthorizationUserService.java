package org.example.servise;

import org.example.Dto.FullUserDto;
import org.example.Dto.UserCreateUpdateDto;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationUserService {

    @Autowired
    private static UserRepository repository;

    public UserEntity createdUser(UserCreateUpdateDto dto){
        var userEntity = new UserEntity();
        userEntity.setName(dto.name());
        return repository.save(userEntity);
    }
}
