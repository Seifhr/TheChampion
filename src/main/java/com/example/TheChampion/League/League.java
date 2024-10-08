package com.example.TheChampion.League;

import com.example.TheChampion.Match.Match;
import com.example.TheChampion.Player.Player;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class League {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Match> matches;

    private boolean finished = false;

    private Long WinnerID;

    // Constructors
    public League() {}

    public League(List<Match> matches) {
        this.matches = matches;
        WinnerID = 0L;
    }

    //Setters and Getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public Long getWinnerID() {
        return WinnerID;
    }

    public void setWinnerID(Long winnerID) {
        WinnerID = winnerID;
    }
}
