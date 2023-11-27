package org.example.controller;

import jakarta.annotation.Resource;
import org.example.Dto.Column.*;
import org.example.Dto.*;
import org.example.Dto.Column.NameDto;
import org.example.Dto.Instance.UserInstansDto;
import org.example.repository.User_Movies_RelRepository;
import org.example.servise.UserService;
import org.example.servise.User_Movies_RelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService service_user;

    @Resource
    private User_Movies_RelService service_UMRS;

    @GetMapping("create")
    UserInstansDto createUser(@RequestParam("name") String name, @RequestParam("password") String password){
        return service_user.createdUser(new CreateUpdateDto(name, password));
    }

    @PostMapping("update")
    UserInstansDto updateUser(@RequestParam("name") String name, @RequestParam("password") String password){
    return service_user.updatedUser(new CreateUpdateDto(name, password));
    }

    @DeleteMapping("deleteUserByName")
    void deleteUserByName(@RequestParam("name") String name){
        service_user.deletedUserByName(new NameDto(name));
    }

    @DeleteMapping("deleteUserById")
    void deleteUserById(@RequestParam("id") Long id){
        service_user.deletedUserById(new IdDto(id));
    }

    @GetMapping("getUserByName")
    UserInstansDto getUserByName(@RequestParam("name") String name){
        return service_user.getedUserByName(new NameDto(name));
    }

    @GetMapping("getUserById")
    UserInstansDto getUserByNaId(@RequestParam("id") Long id){
        return service_user.getedUserById(new IdDto(id));
    }

    @GetMapping("getMoviesByUser")
    ListDto getMoviesByUser(@RequestParam("userId") Long userId) {
        var movies = service_UMRS.getMoviesByUser(new IdDto(userId));
        return new ListDto(movies);
    }

    @PostMapping("identificationUser")
    String authorizationUser(@RequestParam("name") String name, @RequestParam("password") String password){
        return service_user.identedUser(new CreateUpdateDto(name, password));
    }
}
