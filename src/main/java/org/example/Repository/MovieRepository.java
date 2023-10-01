package org.example.Repository;

import org.example.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<UserEntity, Long> {
}
