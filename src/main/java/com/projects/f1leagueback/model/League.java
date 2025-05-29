package com.projects.f1leagueback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class League {

    // Attributes
    @Id
    private UUID leagueId;

    @Field("leagueName")
    private String leagueName;

    @Field("leagueDescription")
    private String leagueDescription;

    @Field("leagueGPs")
    private List<Race> leagueGPs;

    @Field("leagueDrivers")
    private List<DriverLeague> leagueDrivers;

    // Constructor
    public League() {
        loadGPsToLeague();
    }

    public League(String leagueName, String leagueDescription, List<Race> leagueGPs, List<DriverLeague> leagueDrivers) {
        this.leagueName = leagueName;
        this.leagueDescription = leagueDescription;
        this.leagueGPs = leagueGPs;
        this.leagueDrivers = leagueDrivers;
    }

    public League(String leagueName, String leagueDescription) {
        this.leagueName = leagueName;
        this.leagueDescription = leagueDescription;

    }

    private void loadGPsToLeague() {
        AtomicLong gpId = new AtomicLong(1);
        this.leagueGPs = new ArrayList<>();
        for(Tracks track : Tracks.values()) {
            this.leagueGPs.add(new Race(gpId.getAndIncrement(),track));
        }
    }

    // Getters and Setters
    public UUID getId() {
        return leagueId;
    }

    public void setId(UUID leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueDescription() {
        return leagueDescription;
    }

    public void setLeagueDescription(String leagueDescription) {
        this.leagueDescription = leagueDescription;
    }

    public List<Race> getLeagueGPs() {
        return leagueGPs;
    }

    public void setLeagueGPs(List<Race> leagueGPs) {
        this.leagueGPs = leagueGPs;
    }

    public List<DriverLeague> getLeagueDrivers() {
        return leagueDrivers;
    }

    public void setLeagueDrivers(List<DriverLeague> leagueDrivers) {
        this.leagueDrivers = leagueDrivers;
    }
}
