package game.dev.player.service;

import game.dev.player.repo.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    PlayerRepo playerRepo;

    public boolean updateCoinTable(Long playerId, Long coins)
    {
        //call table microservice and put this new higscore for this user
        //todo change when implement table microservice
        return true;
    }
    public boolean updateDistanceTable(Long playerId, Long distance)
    {
        //call table microservice and put this new higscore for this user
        //todo change when implement table microservice
        return true;
    }
    public boolean updateHSTable(Long playerId, Long hs)
    {
        //call table microservice and put this new higscore for this user
        //todo change when implement table microservice
        return true;
    }
}
