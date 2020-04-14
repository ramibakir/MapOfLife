package no.hiof.ramiab.repository;

import no.hiof.ramiab.model.Location;
import no.hiof.ramiab.model.Observation;
import no.hiof.ramiab.model.Planet;
import no.hiof.ramiab.model.animal.Animal;

import java.util.ArrayList;

public interface IMapOfLifeRepository {
    Planet getAPlanet(String planetName);
    Location getALocation(String planetName, String locationID);
    ArrayList<Location> getLocations(String planetName);
    Observation getOneObservation(String planetName, String locationID, String observationID);
    ArrayList<Observation> getObservations(String planetName, String locationID);
    Animal getAnAnimal(String planetName, String locationID, String observationID, String animalID);
    ArrayList<Animal> getAnimals(String planetName, String locationID, String observationID);




    void createObservation(String ID);
    void updateObservation(String ID, Observation updatedObservation);
    void deleteObservation(String planetName, String locationID, String observationID);

    void createLocation(String ID);
    void updateLocation(String ID, Location updatedLocation);
    void deleteLocation(String planetName, String locationID);

    void createAnimal(String ID, String animalName);
    void updateAnimal(String ID, Animal animal);
    void deleteAnimal(String planetName, String locationID, String observationID, String animalID);

    void createPlanet(String name, String planetSystem);
    void updatePlanet(String name, String planetSystem, Planet updatedPlanet);
    void deletePlanet(String name, String planetSystem);

}
