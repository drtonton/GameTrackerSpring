package com.theironyard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by noellemachin on 3/8/16.
 */
@Entity  // this creates "Game" table in database
public class Game {
    @Id  // this is how spring labels "int id" as primary key"
    @GeneratedValue //makes it auto incrementing
    int id;

    String name;
    String platform;
    int releaseYear;

    public Game(String name, String platform, int releaseYear) {
        this.name = name;
        this.platform = platform;
        this.releaseYear = releaseYear;
    }
    public Game() {

    }
}
