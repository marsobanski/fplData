package com.marsob.fplData.appData.fdr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FdrCell {
    private Integer gw;
    private List<FdrGame> games = new ArrayList<>();

    public FdrCell(Integer gw) {
        this.gw = gw;
    }
}
