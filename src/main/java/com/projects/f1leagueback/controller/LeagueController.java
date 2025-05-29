package com.projects.f1leagueback.controller;

import com.projects.f1leagueback.model.League;
import com.projects.f1leagueback.service.LeagueService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
        League result = leagueService.createLeague(league);
        return result;
    }

}
