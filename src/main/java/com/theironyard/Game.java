package com.theironyard;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

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

    public Game(String name, String platform, String genre, int releaseYear) {
        this.name = name;
        this.platform = platform;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }
    public Game() {

    }
}
