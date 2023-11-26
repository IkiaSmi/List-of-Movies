package org.example.entity;

import java.io.Serializable;

public class User_Movie_RelId implements Serializable {
    private Long userid;

    private Long movieid;

    // default constructor

    public User_Movie_RelId(Long userid, Long movieid) {
        this.userid = userid;
        this.movieid = movieid;
    }

    public User_Movie_RelId() {}
}
