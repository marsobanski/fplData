package com.marsob.fplData.apiData.fixtures;

import com.marsob.fplData.apiData.fixtures.pojo.Fixture;
import com.marsob.fplData.apiData.fixtures.pojo.FixtureList;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@NoArgsConstructor
@Controller
public class FixtureReceiver {

    @Value("${endpoint.fixtures}")
    private String endpoint;

    @SuppressWarnings("unchecked")
    public Object receive() {
        RestTemplate restTemplate = new RestTemplate();
        FixtureList fixtureList = new FixtureList();
        Fixture[] fixtures = restTemplate.getForObject(endpoint, Fixture[].class);
        fixtureList.setFixtures(Arrays.asList(fixtures));
        return fixtureList;
    }
}
