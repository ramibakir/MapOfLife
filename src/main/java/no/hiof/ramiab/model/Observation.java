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
    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<Observation> observations = new ArrayList<>();

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

    public void addAnimals(Animal animal) {
        animals.add(animal);
    }

    /*Retrieves an animal based on ID*/
    public Animal getAnAnimal(String ID) {
        for (Animal a : animals) {
            if (a.getID().equals(ID)) {
                return a;
            }
        }
        return null;
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    //Retrieves an observation based on the ID*/
    public Observation getOneObservation(String ID) {
        for (Observation o : observations) {
            if (o.getId().equals(ID)) {
                return o;
            }
        }
        return null;
    }

    /*Remember that this returns a copy of observations*/
    public ArrayList<Observation> getAllObservations() {
        return observations;
    }

    public void addObservation(Observation observation) {
        observations.add(observation);
    }

    public void removeObservation(Observation observation) {
        observations.remove(observation);
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

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
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

    public ArrayList<Observation> getObservations() {
        return observations;
    }

    public void setObservations(ArrayList<Observation> observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return getId() + ": " + getName() + " was done at " + getObservationTime() + ". " + animals.size() + " different animals were seen during this observation. " + getNotes();
    }

    @Override
    public int compareTo(Observation observation) {
        return this.observationTime.compareTo(observation.getObservationTime());
    }
}
