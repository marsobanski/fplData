package com.marsob.fplData.appData.fdr;

import com.marsob.fplData.appData.team.Team;
import lombok.Value;

@Value
public class FdrGame {

    Team team;
    HomeAway homeAway;
    Integer difficulty;
}
