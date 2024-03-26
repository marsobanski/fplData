package com.marsob.fplData.appData.team;

import com.marsob.fplData.appData.game.Game;
import com.marsob.fplData.appData.player.Player;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Team {

    @Id
    @Column
    private Integer id;

    @Column
    private String name;

    @OneToMany(mappedBy = "team")
    private List<Player> players;

    @OneToMany(mappedBy = "homeTeam")
    private List<Game> homeGames;

    @OneToMany(mappedBy = "awayTeam")
    private List<Game> awayGames;

    public Team(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
