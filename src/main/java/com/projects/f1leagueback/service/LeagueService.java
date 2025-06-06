package com.projects.f1leagueback.service;

import com.projects.f1leagueback.exception.ResourceNotFoundException;
import com.projects.f1leagueback.model.League;
import com.projects.f1leagueback.model.Race;
import com.projects.f1leagueback.repository.LeagueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class LeagueService {
    Logger logger = LoggerFactory.getLogger(LeagueService.class);

    private final LeagueRepository leagueRepository;
    private League existingLeague;

    public LeagueService(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    public League createLeague(League league) {
        // ID Creation
        UUID leagueUUID = UUID.randomUUID();
        logger.info("League UUID: " + leagueUUID);

        league.setId(leagueUUID);
        league.updateLeagueGpIDs();

        League result = leagueRepository.save(league);

        logger.info("League created");
        return result;
    }

    @Transactional
    public League updateGPs(UUID leagueId, List<Race> updatedRaces) throws Exception {
        // Get League
        League existingLeague = leagueRepository.findById(leagueId).orElseThrow(() -> new ResourceNotFoundException("League not found"));

        existingLeague.updateLeagueGpIDs();

        return leagueRepository.save(existingLeague);
    }

}
