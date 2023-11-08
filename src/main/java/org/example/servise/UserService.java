package org.example.servise;

import jakarta.annotation.Resource;
import org.example.Dto.*;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Resource
    private UserRepository repository;

    public UserInstansDto createdUser(CreateUpdateIdentDto dto) {
        var createUser = new UserEntity();
        createUser.setName(dto.name());
        createUser.setPassword(dto.password());
        var createdUser = repository.save(createUser);
        return UserInstansDto.ofEntity(createdUser);
    }

    public UserInstansDto updatedUser(CreateUpdateIdentDto dto){
        var user = repository.findUserEntityByName(dto.name());
        user.setPassword(dto.password());
        var updatedUser =  repository.save(user);
        return UserInstansDto.ofEntity(updatedUser);
    }

    public void deletedUserByName(UserNameDto dto){
        var user = repository.findUserEntityByName(dto.name());
        repository.delete(user);
    }

    public void deletedUserById(UserIdDto dto){
        var user = repository.findUserEntityById(dto.id());
        repository.delete(user);
    }

    public UserInstansDto getedUserByName(UserNameDto dto){
        var user = repository.findUserEntityByName(dto.name());
        return UserInstansDto.ofEntity(user);
    }

    public UserInstansDto getedUserById(UserIdDto dto){
        var user = repository.findUserEntityById(dto.id());
        return UserInstansDto.ofEntity(user);
    }

    public String identedUser(CreateUpdateIdentDto dto){
        try {
            var user = repository.findUserEntityByNameAndPassword(dto.name(), dto.password());
            if (user != null){
                return "True";
            } else {
                return "False";
            }
        } catch (Exception e){
            return "False";
        }
    }
}
