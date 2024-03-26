package com.marsob.fplData.appData.gameweek;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GameWeekRepository extends JpaRepository<GameWeek, Integer> {

    Optional<GameWeek> findById(Integer id);

}
