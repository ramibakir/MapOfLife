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

    Observation getOneObservation(String observationID);

    ArrayList<Observation> getAllObservations();

    Animal getAnAnimal(String planetName, String locationID, String observationID, String animalID);

    ArrayList<Animal> getAnimals(String planetName, String locationID, String observationID);


    void createObservation(String planetName, String locationID, Observation observation);

    void updateObservation(String planetName, String locationID, String observationID, Observation updatedObservation);

    void deleteObservation(String planetName, String locationID, String observationID);

    void createLocation(String planetName, Location newLocation);

    void updateLocation(String planetName, String locationID, Location updatedLocation);

    void deleteLocation(String planetName, String locationID);

    void createAnimal(String planetName, String locationID, String observationID, Animal newAnimal);

    void updateAnimal(String planetName, String locationID, String observationID, String animalID, Animal updatedAnimal);

    void deleteAnimal(String planetName, String locationID, String observationID, String animalID);

    void createPlanet(String name, Planet planet);

    void updatePlanet(String name, Planet updatedPlanet);

    void deletePlanet(String name);

}
