package com.marsob.fplData.appData.game;

import com.marsob.fplData.appData.fdr.FdrGame;
import com.marsob.fplData.appData.fdr.HomeAway;
import com.marsob.fplData.appData.gameweek.GameWeek;
import com.marsob.fplData.appData.team.Team;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Game {

    @Id
    @Column
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "home_team_id")
    private Team homeTeam;
    @ManyToOne
    @JoinColumn(name = "away_team_id")
    private Team awayTeam;
    @Column(name = "home_team_difficulty")
    private Integer homeTeamDifficulty;
    @Column(name = "away_team_difficulty")
    private Integer awayTeamDifficulty;
    @Column(name = "home_team_score")
    private Integer homeTeamScore;
    @Column(name = "away_team_score")
    private Integer awayTeamScore;
    @ManyToOne
    @JoinColumn(name = "game_week_id")
    private GameWeek gameWeek;

    public Game(Integer id, Integer homeTeamDifficulty, Integer awayTeamDifficulty, GameWeek gameWeek) {
        this.id = id;
        this.homeTeamDifficulty = homeTeamDifficulty;
        this.awayTeamDifficulty = awayTeamDifficulty;
        this.gameWeek = gameWeek;
    }

    public Game(Integer id, Integer homeTeamDifficulty, Integer awayTeamDifficulty, Object homeTeamScore, Object awayTeamScore) {
        this.id = id;
        this.homeTeamDifficulty = homeTeamDifficulty;
        this.awayTeamDifficulty = awayTeamDifficulty;
        this.homeTeamScore = homeTeamScore == null ? null : Integer.valueOf(homeTeamScore.toString());
        this.awayTeamScore = awayTeamScore == null ? null : Integer.valueOf(awayTeamScore.toString());
    }

    public Team getOtherTeam(Team team) {
        if (team != null) {
            if (team.equals(getAwayTeam())) {
                return getHomeTeam();
            } else if (team.equals(getHomeTeam())) {
                return getAwayTeam();
            }
        }
        return null;
    }

    public HomeAway getHomeAwayForTeam(Team team) {
        if (team != null) {
            if (team.equals(getAwayTeam())) {
                return HomeAway.AWAY;
            } else if (team.equals(getHomeTeam())) {
                return HomeAway.HOME;
            }
        }
        return null;
    }

    public Integer getTeamDifficulty(Team team) {
        if (team != null) {
            if (team.equals(getAwayTeam())) {
                getAwayTeamDifficulty();
            } else if (team.equals(getHomeTeam())) {
                getHomeTeamDifficulty();
            }
        }
        return null;
    }

    public FdrGame mapToFdrGameFromTeam(Team team) {
        return new FdrGame(getOtherTeam(team), getHomeAwayForTeam(team), getTeamDifficulty(team));
    }
}
