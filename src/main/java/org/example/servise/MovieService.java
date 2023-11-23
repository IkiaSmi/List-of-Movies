package org.example.servise;

import jakarta.annotation.Resource;
import org.example.Dto.Column.*;
import org.example.Dto.Instance.MovieInstanceDto;
import org.example.Dto.Instance.User_Movies_RelInstanceDto;
import org.example.entity.MovieEntity;
import org.example.repository.MovieRepository;
import org.example.repository.User_Movies_RelRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Resource
    public MovieRepository repository;

    @Resource
    public User_Movies_RelService service_UMRS;

    public MovieInstanceDto createdMovies(NameDto dto){
        var movie = new MovieEntity();
        movie.setName(dto.name());
        movie = repository.save(movie);
        return MovieInstanceDto.ofEntity(movie);
    }

    public Id_NameDto Movie_Entry(Id_NameDto dto){
        MovieInstanceDto movie;

        try {
            var movie_Entity = repository.findByName(dto.name());
            movie = MovieInstanceDto.ofEntity(movie_Entity);
        } catch (Exception e){
            movie = createdMovies(new NameDto(dto.name()));
        }

        var Dto = new User_Movies_RelInstanceDto(dto.id(),movie.id());
        var User_Movie = service_UMRS.createdEntry(Dto);
        return dto;
    }

}
