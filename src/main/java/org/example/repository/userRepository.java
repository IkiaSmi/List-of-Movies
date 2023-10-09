package org.example.repository;

import org.example.entity.userEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface userRepository<userEntity> extends CrudRepository<userEntity,Long> {
}
