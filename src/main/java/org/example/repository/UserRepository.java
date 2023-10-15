package org.example.repository;

import org.example.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {

    @Query(value = "SELECT * from users where name :name and password :password", nativeQuery = true)
    UserEntity findUserEntityByNameAndPassword(String name, String password);

}
