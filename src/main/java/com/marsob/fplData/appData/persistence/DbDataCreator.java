package com.marsob.fplData.appData.persistence;

import com.marsob.fplData.apiData.fixtures.FixtureReceiver;
import com.marsob.fplData.apiData.fixtures.pojo.FixtureList;
import com.marsob.fplData.apiData.generalInfo.GeneralInfoReceiver;
import com.marsob.fplData.apiData.generalInfo.pojo.GeneralInfo;
import com.marsob.fplData.appData.game.Game;
import com.marsob.fplData.appData.game.GameRepository;
import com.marsob.fplData.appData.gameweek.GameWeek;
import com.marsob.fplData.appData.gameweek.GameWeekRepository;
import com.marsob.fplData.appData.player.Player;
import com.marsob.fplData.appData.player.PlayerRepository;
import com.marsob.fplData.appData.team.Team;
import com.marsob.fplData.appData.team.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class DbDataCreator {

    private final GeneralInfoReceiver generalInfoReceiver;
    private final FixtureReceiver fixtureReceiver;
    private final TeamRepository teamRepository;
    private final PlayerRepository playerRepository;
    private final GameWeekRepository gameWeekRepository;
    private final GameRepository gameRepository;

    public void create() {
        GeneralInfo generalInfo = (GeneralInfo) generalInfoReceiver.receive();
        FixtureList fixtureList = (FixtureList) fixtureReceiver.receive();
        List<Team> teams = createTeams(generalInfo);
        List<Game> games = createGames(fixtureList);
        List<GameWeek> gameWeeks = createGameWeeks(generalInfo);
        List<Player> players = createPlayers(generalInfo);
        setGamesData(teams, games, fixtureList, gameWeeks);
        setPlayerData(players, teams, generalInfo);
        teams.forEach(teamRepository::save);
        players.forEach(playerRepository::save);
        gameWeeks.forEach(gameWeekRepository::save);
        games.forEach(gameRepository::save);

    }

    private void setPlayerData(List<Player> players, List<Team> teams, GeneralInfo generalInfo) {
        players.forEach(player -> {
            Integer teamId = generalInfo.findTeamIdByPlayerId(player.getId());
            Team team = teams.stream().filter(t -> t.getId() == teamId).findAny().orElse(null);
            player.setTeam(team);
        });
    }

    private void setGamesData(List<Team> teams, List<Game> games, FixtureList fixtureList, List<GameWeek> gameWeeks) {
        games.forEach(game -> {
            Integer homeTeamId = fixtureList.findHomeTeamIdByGameId(game.getId());
            Team homeTeam = teams.stream().filter(team -> team.getId() == homeTeamId).findAny().orElse(null);
            game.setHomeTeam(homeTeam);

            Integer awayTeamId = fixtureList.findAwayTeamIdByGameId(game.getId());
            Team awayTeam = teams.stream().filter(team -> team.getId() == awayTeamId).findAny().orElse(null);
            game.setAwayTeam(awayTeam);

            Integer gameWeekId = fixtureList.findGameWeekIdByGameId(game.getId());
            GameWeek gameWeek = gameWeeks.stream().filter(gw -> gw.getId() == gameWeekId).findAny().orElse(null);
            game.setGameWeek(gameWeek);
        });
    }

    private List<GameWeek> createGameWeeks(GeneralInfo generalInfo) {
        List<GameWeek> gameWeeks = generalInfo.getEvents().stream()
            .map(event -> new GameWeek(event.getId()))
            .collect(Collectors.toList());
        gameWeeks.forEach(gameWeekRepository::save);
        return gameWeeks;
    }

    private void createGames(List<GameWeek> gameWeeks, FixtureList fixtureList, List<Team> teams) {
        gameWeeks.forEach(gameWeek -> {
            List<Game> games = fixtureList.getFixtures().stream()
                .filter(fixture -> fixture.getEvent() == gameWeek.getId())
                .map(fixture -> new Game(fixture.getId(), fixture.getTeamHDifficulty(), fixture.getTeamADifficulty(), gameWeek))
                .collect(Collectors.toList());
            games.forEach(game -> {});
            games.forEach(gameRepository::save);
        });
    }

    private List<Game> createGames(FixtureList fixtureList) {
        List<Game> games = fixtureList.getFixtures().stream()
            .map(fixture -> new Game(fixture.getId(), fixture.getTeamHDifficulty(), fixture.getTeamADifficulty(), fixture.getTeamHScore(), fixture.getTeamAScore()))
            .collect(Collectors.toList());
        return games;
    }

    private List<Team> createTeams(GeneralInfo generalInfo) {
        List<Team> teams = generalInfo.getTeams().stream()
            .map(team -> new Team(team.getId(), team.getName()))
            .collect(Collectors.toList());
        teams.forEach(teamRepository::save);
        return teams;
    }

    private void createPlayers(List<Team> teams, GeneralInfo generalInfo) {
        teams.forEach(team -> {
            List<Player> players = generalInfo.getElements().stream()
                .filter(player -> player.getTeam() == team.getId())
                .map(player -> new Player(player.getId(), player.getFirstName(), player.getSecondName(), team))
                .collect(Collectors.toList());
            players.forEach(playerRepository::save);
        });
    }

    private List<Player> createPlayers(GeneralInfo generalInfo) {
        List<Player> players = generalInfo.getElements().stream()
            .map(player -> new Player(player.getId(), player.getFirstName(), player.getSecondName()))
            .collect(Collectors.toList());
        return players;
    }
}
