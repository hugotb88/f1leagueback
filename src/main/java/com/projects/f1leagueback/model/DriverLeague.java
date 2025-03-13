package com.projects.f1leagueback.model;

public class DriverLeague extends Driver{

    // Attributes
    private int leagueId;
    private int leaguePosition;
    private int leaguePoints;

    // Constructor
    public DriverLeague(int leagueId, int leaguePosition, int leaguePoints) {
        this.leagueId = leagueId;
        this.leaguePosition = leaguePosition;
        this.leaguePoints = leaguePoints;
    }

    public DriverLeague(String name, String gamertag, String email, String description, String photo, int leagueId, int leaguePosition, int leaguePoints) {
        super(name, gamertag, email, description, photo);
        this.leagueId = leagueId;
        this.leaguePosition = leaguePosition;
        this.leaguePoints = leaguePoints;
    }

    // Getters and Setters
    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public int getLeaguePosition() {
        return leaguePosition;
    }

    public void setLeaguePosition(int leaguePosition) {
        this.leaguePosition = leaguePosition;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(int leaguePoints) {
        this.leaguePoints = leaguePoints;
    }
}
