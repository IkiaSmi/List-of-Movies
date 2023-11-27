package org.example.repository;

import org.example.entity.MovieEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<MovieEntity, Long> {

    @Query(value = "select * from movies where name = :name", nativeQuery = true)
    MovieEntity findByName(String name);

    @Query(value = "select * from movies where id = :id", nativeQuery = true)
    MovieEntity findMovieEntitiesById(Long id);

    @Query(value = "select id from movies", nativeQuery = true)
    List<Long> findAllBy();
}
