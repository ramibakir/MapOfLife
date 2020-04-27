package no.hiof.ramiab.model;

import no.hiof.ramiab.model.animal.Animal;

import java.time.LocalDate;
import java.util.ArrayList;

public class Observation implements Comparable<Observation> {
    private static int observationCounter = 1;
    private String id;
    private String name;
    private String notes;
    private LocalDate observationTime;
    private Animal observationAnimals;
    private Location location;

    /*Remember to create empty constructors for deserializing*/
    public Observation() {

    }

    public Observation(String name, String notes, LocalDate observationTime, Location location, Animal observationAnimals) {
        this.id = "OBSERVATION00" + observationCounter++;
        this.name = name;
        this.notes = notes;
        this.observationTime = observationTime;
        this.location = location;
        this.observationAnimals = observationAnimals;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(LocalDate observationTime) {
        this.observationTime = observationTime;
    }

    public Animal getObservationAnimals() {
        return observationAnimals;
    }

    public void setObservationAnimals(Animal observationAnimals) {
        this.observationAnimals = observationAnimals;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return getId() + ": " + getName() + " was done at " + getObservationTime() + ". " + observationAnimals.getName() + " was seen during this observation. " + getNotes();
    }

    @Override
    public int compareTo(Observation observation) {
        return this.observationTime.compareTo(observation.getObservationTime());
    }
}
