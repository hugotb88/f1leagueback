package com.projects.f1leagueback.model;

import java.util.List;
import java.util.UUID;

public class Race {

    // Attributes
    private UUID leagueId;
    private long raceId;
    private Tracks track;
    private List<DriverRace> racers;
    private boolean isFinished = false;

    public Race() {
    }

    public Race(UUID leagueId, long raceId, Tracks track, List<DriverRace> racers, boolean isFinished) {
        this.leagueId = leagueId;
        this.raceId = raceId;
        this.track = track;
        this.racers = racers;
        this.isFinished = isFinished;
    }

    public Race(UUID leagueId, long raceId, Tracks track) {
        this.leagueId = leagueId;
        this.raceId = raceId;
        this.track = track;
    }

    // Getters and setters
    public UUID getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(UUID leagueId) {
        this.leagueId = leagueId;
    }

    public long getRaceId() {
        return raceId;
    }

    public void setRaceId(long raceId) {
        this.raceId = raceId;
    }

    public Tracks getTrack() {
        return track;
    }

    public void setTrack(Tracks track) {
        this.track = track;
    }

    public List<DriverRace> getRacers() {
        return racers;
    }

    public void setRacers(List<DriverRace> racers) {
        this.racers = racers;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}