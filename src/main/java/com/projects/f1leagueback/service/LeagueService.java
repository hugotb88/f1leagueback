package com.projects.f1leagueback.service;

import com.projects.f1leagueback.model.League;
import com.projects.f1leagueback.repository.LeagueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LeagueService {
    Logger logger = LoggerFactory.getLogger(LeagueService.class);

    private final LeagueRepository leagueRepository;

    public LeagueService(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    public League createLeague(League league) {
        // ID Creation
        UUID leagueUUID = UUID.randomUUID();
        logger.info("League UUID: " + leagueUUID);

        league.setId(leagueUUID);
        League result = leagueRepository.save(league);

        logger.info("League created");
        return result;
    }


}
