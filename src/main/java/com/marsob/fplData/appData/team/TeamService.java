package com.marsob.fplData.appData.team;

import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;
    private final SessionFactory sessionFactory;


}
