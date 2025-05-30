package com.projects.f1leagueback.controller;

import com.projects.f1leagueback.model.League;
import com.projects.f1leagueback.model.Race;
import com.projects.f1leagueback.service.LeagueService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/leagues")
@CrossOrigin
public class LeagueController {

    private final LeagueService leagueService;

    public LeagueController(LeagueService leagueService) {
        this.leagueService=leagueService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public League createLeague(@RequestBody League league) {
        return leagueService.createLeague(league);
    }


    @PutMapping("/{leagueId}/races")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<League> updateLeague(@PathVariable UUID leagueId,
                               @RequestBody List<Race> updatedRaces) throws Exception {

        League updatedLeague = leagueService.updateGPs(leagueId,updatedRaces);
        return new ResponseEntity<>(updatedLeague, HttpStatus.OK);
    }
}
