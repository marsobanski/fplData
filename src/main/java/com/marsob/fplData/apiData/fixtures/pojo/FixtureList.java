package com.marsob.fplData.apiData.fixtures.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FixtureList {

    private List<Fixture> fixtures;

    public Integer findHomeTeamIdByGameId(Integer id) {
        return fixtures.stream().filter(fixture -> fixture.getId() == id)
            .map(Fixture::getTeamH)
            .findAny().orElse(null);
    }

    public Integer findAwayTeamIdByGameId(Integer id) {
        return fixtures.stream().filter(fixture -> fixture.getId() == id)
            .map(Fixture::getTeamA)
            .findAny().orElse(null);
    }

    public Integer findGameWeekIdByGameId(Integer id) {
        return fixtures.stream().filter(fixture -> fixture.getId() == id)
            .map(Fixture::getEvent)
            .filter(Objects::nonNull)
            .findAny().orElse(null);
    }

}
