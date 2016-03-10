package com.theironyard.services;

import com.theironyard.entities.Game;
import com.theironyard.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by noellemachin on 3/8/16.
 */
public interface GameRepository extends CrudRepository<Game, Integer> {
    List<Game> findByUser(User user);
    List<Game> findByUserAndGenre(User user, String genre);
    List<Game> findByUserAndGenreAndReleaseYear(User user, String genre, int releaseYear);
    List<Game> findByUserAndGenreAndReleaseYearIsGreaterThanEqual(User user, String genre, int minReleaseYear);
    // THESE ARE QUERY METHODS. THEIR NAMES MATTER! WEEEEE!
    Game findFirstByGenre(String genre);
    int countByGenre(String genre);
    List<Game> findByGenreOrderByNameAsc(String genre);


    // messing with @Query is messy. try not to.
    @Query("SELECT g FROM Game g WHERE g.platform LIKE ?1%")
    List<Game> findByPlatformStartsWith(String platform);
}
