package com.marsob.fplData.appData.gameweek;

import com.marsob.fplData.appData.game.Game;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GameWeek {

    @Column
    @Id
    private Integer id;

    @OneToMany(mappedBy = "gameWeek")
    private List<Game> games;

    public GameWeek(Integer id) {
        this.id = id;
    }
}
