package org.example.controller;

import jakarta.annotation.Resource;
import org.example.Dto.Column.Id_NameDto;
import org.example.Dto.Column.NameDto;
import org.example.Dto.Instance.*;
import org.example.servise.MovieService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Resource
    public MovieService movie_service;

    @GetMapping("addMovie")
    public MovieInstanceDto MovieCreate(@RequestParam("name") String name){
        return movie_service.createdMovies(new NameDto(name));
    }

    @PostMapping("createMovieEntry")
    public Id_NameDto Movie_Entry_cr(@RequestParam("UserId") Long userId, @RequestParam("movieName") String movieName){
        return movie_service.create_Movie_Entry(new Id_NameDto(userId, movieName));
    }

    @DeleteMapping("deleteMovieEntry")
    public Id_NameDto Movie_Entry_del(@RequestParam("userId") Long userId, @RequestParam("movieName") String movieName){
        return movie_service.delete_Movie_Entry(new Id_NameDto(userId, movieName));
    }

}
