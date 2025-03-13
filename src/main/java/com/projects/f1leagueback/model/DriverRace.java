package com.projects.f1leagueback.model;

public class DriverRace extends Driver{

    // Attributes
    private int raceId;
    private String racePoints;
    private boolean didFastLap;


    // Constructor
    public DriverRace(String name, String gamertag, String email, String description, String photo, int raceId, String racePoints, boolean didFastLap) {
        super(name, gamertag, email, description, photo);
        this.raceId = raceId;
        this.racePoints = racePoints;
        this.didFastLap = didFastLap;
    }

    // Getters and Setters
    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public String getRacePoints() {
        return racePoints;
    }

    public void setRacePoints(String racePoints) {
        this.racePoints = racePoints;
    }

    public boolean isDidFastLap() {
        return didFastLap;
    }

    public void setDidFastLap(boolean didFastLap) {
        this.didFastLap = didFastLap;
    }
}
