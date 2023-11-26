package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "movies")
@Entity
public class MovieEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    public Long id;
    @Column
    public String name;
}
