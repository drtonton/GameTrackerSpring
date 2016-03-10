package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by noellemachin on 3/8/16.
 */
@Entity  // this creates "Game" table in database
public class Game {
    @Id  // this is how spring labels "int id" as primary key"
    @GeneratedValue //makes it auto incrementing
    int id;

    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String platform;

    @Column(nullable = false)
    String genre;
    int releaseYear;

    @ManyToOne      // many games to one user
            User user;

    public Game(String name, String platform, String genre, int releaseYear, User user) {
        this.name = name;
        this.platform = platform;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.user = user;
    }
    public Game() {

    }
}
