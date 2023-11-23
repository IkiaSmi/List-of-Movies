package org.example.repository;

import org.example.entity.User_Movie_Rel_Entity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Movies_RelRepository extends CrudRepository<User_Movie_Rel_Entity, Long> {
}
