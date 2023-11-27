package org.example.repository;

import org.example.entity.User_Movie_Rel_Entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User_Movies_RelRepository extends CrudRepository<User_Movie_Rel_Entity, Long> {
    @Query(value = "select * from user_movies_rel where userid = :userId and movieid = :movieId", nativeQuery = true)
    User_Movie_Rel_Entity findByUseridAndMovieid(Long userId, Long movieId);

    @Query(value = "select count(*) from user_movies_rel where movieId = :id", nativeQuery = true)
    long findCountEntity(Long id);

    @Query(value = "SELECT m.name from users join user_movies_rel umr on users.id = umr.userId join movies m on m.id = umr.movieId where userId = :userId", nativeQuery = true)
    List<String> findMoviesByUserId(Long userId);
}
