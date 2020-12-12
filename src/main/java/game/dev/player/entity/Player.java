package game.dev.player.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    //todo check with bosko
    Long googleId;
    String name;
    Long highScoreCoins;
    Long highScoreDistance;
    Long highScore;
    Long coins;
    Time giftTime;

    public Player() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoogleId() {
        return googleId;
    }

    public void setGoogleId(Long googleId) {
        this.googleId = googleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getHighScoreCoins() {
        return highScoreCoins;
    }

    public void setHighScoreCoins(Long highScoreCoins) {
        this.highScoreCoins = highScoreCoins;
    }

    public Long getHighScoreDistance() {
        return highScoreDistance;
    }

    public void setHighScoreDistance(Long highScoreDistance) {
        this.highScoreDistance = highScoreDistance;
    }

    public Long getHighScore() {
        return highScore;
    }

    public void setHighScore(Long highScore) {
        this.highScore = highScore;
    }

    public Long getCoins() {
        return coins;
    }

    public void setCoins(Long coins) {
        this.coins = coins;
    }

    public Time getGiftTime() {
        return giftTime;
    }

    public void setGiftTime(Time giftTime) {
        this.giftTime = giftTime;
    }
}
