package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

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
    @UniqueElements
    public String name;
}
