package org.example.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@jakarta.persistence.Entity()
@Table(name = "Movie")
@Setter
@Getter

public class UserEntity {
    @Id
    @GeneratedValue
    Long id;
    @Column
    String MovieTitle;
}
