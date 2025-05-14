package com.projects.f1leagueback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

public class League {

    // Attributes
    @Id
    private UUID leagueId;

    @Field("leagueName")
    private String leagueName;

    @Field("leagueDescription")
    private String leagueDescription;

    @Field("leagueGPs")
    private Race[] leagueGPs;

    @Field("leagueDrivers")
    private DriverLeague[] leagueDrivers;

    // Constructor
    public League() {
    }

    public League(String leagueName, String leagueDescription, Race[] leagueGPs, DriverLeague[] leagueDrivers) {
        this.leagueName = leagueName;
        this.leagueDescription = leagueDescription;
        this.leagueGPs = leagueGPs;
        this.leagueDrivers = leagueDrivers;
    }

    public League(String leagueName, String leagueDescription) {
        this.leagueName = leagueName;
        this.leagueDescription = leagueDescription;
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

    public Race[] getLeagueGPs() {
        return leagueGPs;
    }

    public void setLeagueGPs(Race[] leagueGPs) {
        this.leagueGPs = leagueGPs;
    }

    public DriverLeague[] getLeagueDrivers() {
        return leagueDrivers;
    }

    public void setLeagueDrivers(DriverLeague[] leagueDrivers) {
        this.leagueDrivers = leagueDrivers;
    }
}
