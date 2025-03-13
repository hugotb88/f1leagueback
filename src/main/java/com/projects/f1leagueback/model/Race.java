package com.projects.f1leagueback.model;

public class Race {

    // Attributes
    private int raceId;
    private String trackName;
    private String dateOfRace;
    private DriverRace[] racers;

    public Race(int raceId, String trackName, String dateOfRace, DriverRace[] racers) {
        this.raceId = raceId;
        this.trackName = trackName;
        this.dateOfRace = dateOfRace;
        this.racers = racers;
    }

    // Getters and Setters
    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getDateOfRace() {
        return dateOfRace;
    }

    public void setDateOfRace(String dateOfRace) {
        this.dateOfRace = dateOfRace;
    }

    public DriverRace[] getRacers() {
        return racers;
    }

    public void setRacers(DriverRace[] racers) {
        this.racers = racers;
    }
}
