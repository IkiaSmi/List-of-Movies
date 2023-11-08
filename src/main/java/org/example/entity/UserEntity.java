package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public Long id;

    @Column
    public String name;
    @Column
    public String password;
}
