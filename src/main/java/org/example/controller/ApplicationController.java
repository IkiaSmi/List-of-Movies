package org.example.controller;

import org.example.Dto.FullUserDto;
import org.example.Dto.UserCreateUpdateDto;
import org.example.entity.UserEntity;
import org.example.servise.AuthorizationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    private static AuthorizationUserService service;

    @GetMapping("")
    static UserEntity createUser(@RequestParam String name){
        return service.createdUser(new UserCreateUpdateDto(name));
    }
}
