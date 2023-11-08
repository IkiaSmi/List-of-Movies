package org.example.controller;

import jakarta.annotation.Resource;
import org.example.Dto.*;
import org.example.servise.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Resource
    private UserService service;

    @GetMapping("create")
    UserInstansDto createUser(@RequestParam("name") String name, @RequestParam("password") String password){
        return service.createdUser(new CreateUpdateIdentDto(name, password));
    }

    @PostMapping("update")
    UserInstansDto updateUser(@RequestParam("name") String name, @RequestParam("password") String password){
    return service.updatedUser(new CreateUpdateIdentDto(name, password));
    }

    @DeleteMapping("deleteUserByName")
    void deleteUserByName(@RequestParam("name") String name){
        service.deletedUserByName(new UserNameDto(name));
    }

    @DeleteMapping("deleteUserById")
    void deleteUserById(@RequestParam("id") Long id){
        service.deletedUserById(new UserIdDto(id));
    }

    @GetMapping("getUserByName")
    UserInstansDto getUserByName(@RequestParam("name") String name){
        return service.getedUserByName(new UserNameDto(name));
    }

    @GetMapping("getUserById")
    UserInstansDto getUserByNaId(@RequestParam("id") Long id){
        return service.getedUserById(new UserIdDto(id));
    }

    @PostMapping("identificationUser")
    String authorizationUser(@RequestParam("name") String name, @RequestParam("password") String password){
        return service.identedUser(new CreateUpdateIdentDto(name, password));
    }
}
