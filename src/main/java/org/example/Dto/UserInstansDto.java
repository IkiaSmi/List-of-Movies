package org.example.Dto;

import org.example.entity.UserEntity;

public record UserInstansDto(
        String name,
        String password,
        Long id
) {
   static public UserInstansDto ofEntity(UserEntity entity){
        return new UserInstansDto(entity.getName(), entity.getPassword(), entity.getId());
    }
}
