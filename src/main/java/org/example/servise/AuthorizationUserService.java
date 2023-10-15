package org.example.servise;

import jakarta.annotation.Resource;
import org.example.Dto.BodyDto;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationUserService {

    @Resource
    private UserRepository repository;

    public UserEntity createdUser(BodyDto dto){
        var userEntity = new UserEntity();
        userEntity.setName(dto.name());
        userEntity.setPassword(dto.password());
        return repository.save(userEntity);
    }
}
