package com.projects.f1leagueback.model;

import javax.sound.midi.Track;
import java.util.List;

public class Race {

    // Attributes
    private long raceId;
    private Tracks track;
    private List<DriverRace> racers;

    public Race() {
    }

    public Race(long raceId, Tracks track) {
        this.raceId = raceId;
        this.track = track;
    }

    public Race(int raceId, Tracks track, List<DriverRace> racers) {
        this.raceId = raceId;
        this.track = track;
        this.racers = racers;
    }

    // Getters and Setters
    public long getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
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
}
