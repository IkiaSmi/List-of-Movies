package org.example.Controller;

import org.example.Dto.UserDto;
import org.example.Service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class ApplicationController {
//    @Autowired
//    private ApplicationService service;

    @PostMapping
    public void createUser(UserDto dto){
    }
}
