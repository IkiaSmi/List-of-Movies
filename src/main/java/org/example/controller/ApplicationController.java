package org.example.controller;

import jakarta.annotation.Resource;
import org.example.Dto.*;
import org.example.entity.UserEntity;
import org.example.servise.AuthorizationUserService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Resource
    private AuthorizationUserService service;

    @GetMapping("create")
    UserEntity createUser(@RequestParam("name") String name, @RequestParam("password") String password){
        return service.createdUser(new BodyDto(name, password));
    }
}
