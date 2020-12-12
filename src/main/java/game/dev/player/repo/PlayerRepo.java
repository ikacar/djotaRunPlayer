package game.dev.player.repo;

import game.dev.player.entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends CrudRepository<Player, Long> {
    Player findByGoogleId(Long googleId);
    Player findByName(String name);
}
