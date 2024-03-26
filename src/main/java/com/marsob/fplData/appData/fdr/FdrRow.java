package com.marsob.fplData.appData.fdr;

import com.marsob.fplData.appData.team.Team;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class FdrRow {

    Team mainRowTeam;
    List<FdrCell> fdrCells = new ArrayList<>();


}
