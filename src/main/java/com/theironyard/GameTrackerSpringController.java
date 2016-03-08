package com.theironyard;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by noellemachin on 3/8/16.
 */
@Controller
public class GameTrackerSpringController {
    @Autowired // this creates game repo
    GameRepository games;

    @RequestMapping(path = "/", method= RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("games", games.findAll());
        return "home";
    }
    @RequestMapping(path = "/add-game", method = RequestMethod.POST)
    public String addGame(String gameName, String gamePlatform, int gameYear) {
        Game game = new Game(gameName, gamePlatform, gameYear);
        games.save(game);
        return "redirect:/";
    }
}
