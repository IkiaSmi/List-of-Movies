package org.example.controller;

import jakarta.annotation.Resource;
import org.example.Dto.UserCreateUpdateDto;
import org.example.entity.UserEntity;
import org.example.servise.AuthorizationUserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Resource
    private AuthorizationUserService service;

    @GetMapping("")
    UserEntity createUser(@RequestParam("name") String name, @RequestParam("password") String password){
        return service.createdUser(new UserCreateUpdateDto(name, password));
    }
}
