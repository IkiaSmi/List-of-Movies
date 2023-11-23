package org.example.controller;

import jakarta.annotation.Resource;
import org.example.Dto.Column.*;
import org.example.Dto.*;
import org.example.Dto.Column.NameDto;
import org.example.Dto.Instance.UserInstansDto;
import org.example.servise.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService user_service;

    @GetMapping("create")
    UserInstansDto createUser(@RequestParam("name") String name, @RequestParam("password") String password){
        return user_service.createdUser(new CreateUpdateDto(name, password));
    }

    @PostMapping("update")
    UserInstansDto updateUser(@RequestParam("name") String name, @RequestParam("password") String password){
    return user_service.updatedUser(new CreateUpdateDto(name, password));
    }

    @DeleteMapping("deleteUserByName")
    void deleteUserByName(@RequestParam("name") String name){
        user_service.deletedUserByName(new NameDto(name));
    }

    @DeleteMapping("deleteUserById")
    void deleteUserById(@RequestParam("id") Long id){
        user_service.deletedUserById(new IdDto(id));
    }

    @GetMapping("getUserByName")
    UserInstansDto getUserByName(@RequestParam("name") String name){
        return user_service.getedUserByName(new NameDto(name));
    }

    @GetMapping("getUserById")
    UserInstansDto getUserByNaId(@RequestParam("id") Long id){
        return user_service.getedUserById(new IdDto(id));
    }

    @PostMapping("identificationUser")
    String authorizationUser(@RequestParam("name") String name, @RequestParam("password") String password){
        return user_service.identedUser(new CreateUpdateDto(name, password));
    }
}
