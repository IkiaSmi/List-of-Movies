package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="user_movies_rel")
@Entity
@IdClass(User_Movie_RelId.class)
public class User_Movie_Rel_Entity {
    @Id
    public Long userid;

    @Id
    public Long movieid;

}
