package com.marsob.fplData.appData.fdr;

import com.marsob.fplData.appData.game.Game;
import com.marsob.fplData.appData.game.GameRepository;
import com.marsob.fplData.appData.gameweek.GameWeekRepository;
import com.marsob.fplData.appData.team.Team;
import com.marsob.fplData.appData.team.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class FdrMatrixCreator {
    final private GameRepository gameRepository;
    final private TeamRepository teamRepository;
    final private GameWeekRepository gameWeekRepository;

    public FdrMatrix create() {
        List<FdrRow> rows =  createRows();
        rows.forEach(this::createAndAddCellsForRow);
        FdrMatrix matrix = new FdrMatrix();
        matrix.setFdrRows(rows);
        return matrix;
    }

    private List<FdrRow> createRows() {
        List<Team> teams = teamRepository.findAll().stream().sorted(Comparator.comparing(Team::getName)).collect(Collectors.toList());
        List<FdrRow> rows = teams.stream().map(FdrRow::new).collect(Collectors.toList());
        return rows;
    }

    private void createAndAddCellsForRow(FdrRow row) {
        Team rowTeam = row.getMainRowTeam();
        int numberOfGameWeeks = gameWeekRepository.findAll().size();
        for (int i = 1; i <= numberOfGameWeeks; i++) {
            FdrCell fdrCell = new FdrCell(i);
            List<Game> gamesForGameWeek = gameRepository.findByAnyTeamIdAndGameWeekId(rowTeam, gameWeekRepository.findById(i).get());
            List<FdrGame> fdrGamesForCell = gamesForGameWeek.stream()
                .map(g -> g.mapToFdrGameFromTeam(rowTeam))
                .collect(Collectors.toList());
            fdrCell.setGames(fdrGamesForCell);
            row.getFdrCells().add(fdrCell);
        }
    }
}
