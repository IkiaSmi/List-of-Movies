package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "movies")
@Entity
public class MovieEntity {
    @Id
    @Column
    public Long id;
    @Column
    public String name;
}
