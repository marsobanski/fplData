package com.marsob.fplData.service;

import com.marsob.fplData.appData.persistence.DbDataCreator;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CreateApiDataService {
    private final DbDataCreator dbDataCreator;

    @PostConstruct
    public void run() {
        dbDataCreator.create();
    }
}
