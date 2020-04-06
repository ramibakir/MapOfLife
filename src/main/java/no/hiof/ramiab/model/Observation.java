package no.hiof.ramiab.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Observation {
    private String ID, observationName, pictureURL, notes;
    private LocalDateTime observationTime;
    private ArrayList<Animal> animals;

    public Observation(String observationName, String pictureURL, String notes, LocalDateTime observationTime, ArrayList<Animal> animals) {
        this.ID = UUID.randomUUID().toString();
        this.observationName = observationName;
        this.pictureURL = pictureURL;
        this.notes = notes;
        this.observationTime = observationTime;
        this.animals = animals;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getObservationName() {
        return observationName;
    }

    public void setObservationName(String observationName) {
        this.observationName = observationName;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDateTime getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(LocalDateTime observationTime) {
        this.observationTime = observationTime;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
}
