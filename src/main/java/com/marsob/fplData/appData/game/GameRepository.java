package com.marsob.fplData.appData.game;

import com.marsob.fplData.appData.gameweek.GameWeek;
import com.marsob.fplData.appData.team.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

    @Query("select g from Game g where (homeTeam = :teamId or awayTeam = :teamId) and gameWeek = :gameWeekId")
    public List<Game> findByAnyTeamIdAndGameWeekId(@Param("teamId") Team team, @Param("gameWeekId") GameWeek gameWeek);

    public List<Game> findAllByAwayTeam_IdOrHomeTeam_IdAndGameWeek_Id(Integer awayTeam_id, Integer homeTeam_id, Integer gameWeek_id);
}
