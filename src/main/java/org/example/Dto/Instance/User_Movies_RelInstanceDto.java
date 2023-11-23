package org.example.Dto.Instance;

import org.example.entity.User_Movie_Rel_Entity;

public record User_Movies_RelInstanceDto(
        Long UserId,
        Long MovieId
) {
    static public User_Movies_RelInstanceDto ofEntity(User_Movie_Rel_Entity entity){
        return new User_Movies_RelInstanceDto(entity.getUserid(), entity.getMovieid());
    }
}
