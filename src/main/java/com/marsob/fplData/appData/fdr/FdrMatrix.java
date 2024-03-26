package com.marsob.fplData.appData.fdr;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class FdrMatrix {
    List<FdrRow> fdrRows = new ArrayList<>();
}
