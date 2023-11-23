package org.example.Dto.Instance;

import org.example.entity.MovieEntity;

public record MovieInstanceDto(
        Long id,
        String name
) {
    static public MovieInstanceDto ofEntity(MovieEntity entity){
        return new MovieInstanceDto(entity.getId(), entity.getName());
    }
}
