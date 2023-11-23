package org.example.servise;

import jakarta.annotation.Resource;
import org.example.Dto.Instance.User_Movies_RelInstanceDto;
import org.example.entity.User_Movie_Rel_Entity;
import org.example.repository.UserRepository;
import org.example.repository.User_Movies_RelRepository;
import org.springframework.stereotype.Service;

@Service
public class User_Movies_RelService {

    @Resource
    private User_Movies_RelRepository repository;

    public User_Movies_RelInstanceDto createdEntry(User_Movies_RelInstanceDto dto){
        var entry = new User_Movie_Rel_Entity();
        entry.setUserid(dto.UserId());
        entry.setMovieid(dto.MovieId());
        entry = repository.save(entry);
        return User_Movies_RelInstanceDto.ofEntity(entry);
    }

}
