package com.marsob.fplData.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EntityScan("com.marsob.fplData.appData")
@EnableJpaRepositories("com.marsob.fplData.appData")
@EnableScheduling
public class FplDataConfiguration {

}
