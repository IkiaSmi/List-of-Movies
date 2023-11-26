package org.example.repository;

import org.example.entity.MovieEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<MovieEntity, Long> {

    @Query(value = "select * from movies where name = :name", nativeQuery = true)
    MovieEntity findByName(String name);


}
