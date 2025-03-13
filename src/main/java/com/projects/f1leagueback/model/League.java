package com.projects.f1leagueback.model;

public class League {

    // Attributes
    private int leagueId;
    private String leagueName;
    private String leagueDescription;
    private Race[] leagueGPs;
    private DriverLeague[] leagueDrivers;

    // Constructor
    public League(int leagueId, String leagueName, String leagueDescription, Race[] leagueGPs, DriverLeague[] leagueDrivers) {
        this.leagueId = leagueId;
        this.leagueName = leagueName;
        this.leagueDescription = leagueDescription;
        this.leagueGPs = leagueGPs;
        this.leagueDrivers = leagueDrivers;
    }

    // Getters and Setters
    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
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
