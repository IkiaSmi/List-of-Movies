package org.example.servise;

import jakarta.annotation.Resource;
import org.example.Dto.Column.*;
import org.example.Dto.Column.NameDto;
import org.example.Dto.CreateUpdateDto;
import org.example.Dto.Instance.UserInstansDto;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.example.servise.User_Movies_RelService;

@Service
public class UserService {

    @Resource
    private UserRepository repository;

    @Resource
    private MovieService service_Movie;

    public UserInstansDto createdUser(CreateUpdateDto dto) {
        var createUser = new UserEntity();
        createUser.setName(dto.name());
        createUser.setPassword(dto.password());
        var createdUser = repository.save(createUser);
        return UserInstansDto.ofEntity(createdUser);
    }

    public UserInstansDto updatedUser(CreateUpdateDto dto){
        var user = repository.findUserEntityByName(dto.name());
        user.setPassword(dto.password());
        var updatedUser =  repository.save(user);
        return UserInstansDto.ofEntity(updatedUser);
    }

    public void deletedUserByName(NameDto dto){
        var user = repository.findUserEntityByName(dto.name());
        repository.delete(user);
    }

    public void deletedUserById(IdDto dto){
        var user = repository.findUserEntityById(dto.id());
        repository.delete(user);
    }

    public UserInstansDto getedUserByName(NameDto dto){
        var user = repository.findUserEntityByName(dto.name());
        return UserInstansDto.ofEntity(user);
    }

    public UserInstansDto getedUserById(IdDto dto){
        var user = repository.findUserEntityById(dto.id());
        return UserInstansDto.ofEntity(user);
    }

    public String identedUser(CreateUpdateDto dto){
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
