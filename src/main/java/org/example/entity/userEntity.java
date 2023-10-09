package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "users")
public class userEntity {
    @Id
    @GeneratedValue
    public Long id;
    @Column
    public String name;
}
