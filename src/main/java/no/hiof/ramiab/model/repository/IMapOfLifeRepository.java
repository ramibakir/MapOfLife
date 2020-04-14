package no.hiof.ramiab.model.repository;

import no.hiof.ramiab.model.Location;
import no.hiof.ramiab.model.Observation;
import no.hiof.ramiab.model.Planet;
import no.hiof.ramiab.model.animal.Animal;

public interface IMapOfLifeRepository {
    boolean createObservation(String ID);
    boolean updateObservation(String ID, Observation updatedObservation);
    boolean deleteObservation(String ID);

    boolean createLocation(String ID);
    boolean updateLocation(String ID, Location updatedLocation);
    boolean deleteLocation(String ID);

    boolean createAnimal(String ID, String animalName);
    boolean updateAnimal(String ID, Animal animal);
    boolean deleteAnimal(String ID);

    boolean createPlanet(String name, String planetSystem);
    boolean updatePlanet(String name, String planetSystem, Planet updatedPlanet);
    boolean deletePlanet(String name, String planetSystem);

}
