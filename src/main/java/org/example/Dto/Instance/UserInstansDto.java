package org.example.Dto.Instance;

import org.example.entity.UserEntity;

public record UserInstansDto(
        Long id,
        String name,
        String password
) {
   static public UserInstansDto ofEntity(UserEntity entity){
        return new UserInstansDto(entity.getId(), entity.getName(), entity.getPassword());
    }
}
