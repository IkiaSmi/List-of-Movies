package org.example.servise;

import jakarta.annotation.Resource;
import org.example.Dto.*;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationUserService {

    @Resource
    private UserRepository repository;

    public UserEntity createdUser(BodyDto dto){
        var userEntity = new UserEntity();
        try {
            var User = repository.findUserEntityByNameAndPassword(dto.name(), dto.password());
            return userEntity;
        } catch (Exception e){
            userEntity.setName(dto.name());
            userEntity.setPassword(dto.password());
            return repository.save(userEntity);
        }
    }

    public boolean checkedUserById(IdDto dto){
        try {
            var User = repository.findUserEntityById(dto.id());
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public Long getUserId(BodyDto dto){
        try {
            var User = repository.findUserEntityByNameAndPassword(dto.name(), dto.password());
            return User.id;
        } catch (Exception e) {
            return 0L;
        }
    }

    public UserEntity updatedUser(FullUserDto dto){
        if (checkedUserById(new IdDto(dto.id()))){
            var User = repository.findUserEntityById(dto.id());
            User.setName(dto.name());
            User.setPassword(dto.password());
            return repository.save(User);
        } else {
            return new UserEntity();
        }
    }
}
