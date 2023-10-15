package org.example.controller;

import jakarta.annotation.Resource;
import org.example.Dto.*;
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
        return service.createdUser(new BodyDto(name, password));
    }

//    @GetMapping("/check")
    boolean checkUser(@RequestParam("id") Long id){
        return service.checkedUserById(new IdDto(id));
    }

//    @RequestMapping("")
    Long getId(@RequestParam("name") String name, @RequestParam("password") String password){
        return service.getUserId(new BodyDto(name, password));
    }

//    @PostMapping("")
    UserEntity updateUser(@RequestParam("id") Long id, @RequestParam("name") String name, @RequestParam("password") String password){
        return service.updatedUser(new FullUserDto(id, name, password));
    }
}
