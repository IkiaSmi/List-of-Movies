package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.Relational;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="user_movies_rel")
@Entity
public class User_Movie_Rel_Entity {
    @Id
    @Column
    public Long userid;
    @Id
    @Column
    public Long movieid;

}
