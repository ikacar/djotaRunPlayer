package game.dev.player.controller;

import game.dev.player.entity.Player;
import game.dev.player.repo.PlayerRepo;
import game.dev.player.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/player")
public class PlayerController {

    @Autowired
    PlayerRepo playerRepo;

    @Autowired
    PlayerService playerService;

    @GetMapping("/findByGId")
    public Player findPlayerByGoogleId(Long googleId)
    {
        return playerRepo.findByGoogleId(googleId);
    }
    @GetMapping("/findByName")
    public Player findPlayerByName(String name)
    {
        return playerRepo.findByName(name);
    }
    @PostMapping("/updateHSCoins")
    public void updateHSCoins(Long playerId, Long coins)
    {

        //TODO It should call ranglist micoservice first in order to update the table
        playerService.updateCoinTable(playerId, coins);

        //update svoj  highScore
//        if(tableUpdated)
//        {
//            *******
//        }
//        else
//        {
//            //greska trenutno nije moguce updateovati tabelu highscore-ovime
//        }

        //*******
        Player player = playerRepo.findById(playerId).get();
        player.setHighScoreCoins(coins);
        playerRepo.save(player);

    }
    @PostMapping("/updateHSDistance")
    public void updateHSDistance(Long playerId, Long distance)
    {
        //TODO It should call ranglist micoservice first in order to update the table
        playerService.updateDistanceTable(playerId, distance);
        //update svoj  highScore
//        if(tableUpdated)
//        {
//            *******
//        }
//        else
//        {
//            //greska trenutno nije moguce updateovati tabelu highscore-ovime
//        }

        //*******
        Player player = playerRepo.findById(playerId).get();
        player.setHighScoreDistance(distance);
        playerRepo.save(player);
    }
    @PostMapping("/updateHS")
    public void updateHS(Long playerId, Long hs)
    {
        //TODO It should call ranglist micoservice first in order to update the table
        playerService.updateHSTable(playerId, hs);
        //update svoj  highScore
//        if(tableUpdated)
//        {
//            *******
//        }
//        else
//        {
//            //greska trenutno nije moguce updateovati tabelu highscore-ovime
//        }

        //*******
        Player player = playerRepo.findById(playerId).get();
        player.setHighScore(hs);
        playerRepo.save(player);
    }
    @PostMapping("/addPlayer")
    public Player createPlayer(Player player)
    {
        return playerRepo.save(player);
    }
}
