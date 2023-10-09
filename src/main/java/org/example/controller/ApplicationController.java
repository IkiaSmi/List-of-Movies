package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @GetMapping("")
    static void createUser(@RequestParam String name){}
}
