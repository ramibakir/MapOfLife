package no.hiof.ramiab.model;

import no.hiof.ramiab.model.animal.Animal;

import java.time.LocalDate;
import java.util.ArrayList;

public class Observation implements Comparable<Observation>{
    private String ID;
    private String observationName;
    private String notes;
    private LocalDate observationTime;
    private ArrayList<Animal> animals = new ArrayList<>();
    private static int observationCounter = 1;

    public Observation(String observationName, String notes, LocalDate observationTime) {
        this.ID = "OBSERVATION - " + observationCounter++;
        this.observationName = observationName;
        this.notes = notes;
        this.observationTime = observationTime;
    }

    public void addAnimals(Animal animal){
        animals.add(animal);
    }

    /*Retrieves an animal based on ID*/
    public Animal getAnAnimal(String ID){
        for(Animal a : animals){
            if(a.getID().equals(ID)){
                return a;
            }
        }
        return null;
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

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return getID() + ": " + getObservationName() + " was done at " + getObservationTime() + ". 5 different animals were seen during this observation. " + getNotes();
    }

    @Override
    public int compareTo(Observation observation) {
        return this.observationTime.compareTo(observation.getObservationTime());
    }
}
