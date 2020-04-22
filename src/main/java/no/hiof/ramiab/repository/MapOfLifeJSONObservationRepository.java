package no.hiof.ramiab.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import no.hiof.ramiab.model.Location;
import no.hiof.ramiab.model.Observation;
import no.hiof.ramiab.model.Planet;
import no.hiof.ramiab.model.animal.Animal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MapOfLifeJSONObservationRepository implements IMapOfLifeRepository {
    private final ArrayList<Observation> observations = new ArrayList<>();

    public MapOfLifeJSONObservationRepository() {
        readObservationsFromFile("mal.json");
        writeObservationsToFile("mal.json");
    }

    public ArrayList<Observation> readObservationsFromFile(String fileName) {
        File observationFile = new File(fileName);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        if (!observationFile.isFile()) {
            return observations;
        }

        try {
            Observation[] observationArray = objectMapper.readValue(observationFile, Observation[].class);

            observations.addAll(Arrays.asList(observationArray));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return observations;
    }

    public void writeObservationsToFile(String fileName) {
        File writeObservations = new File(fileName);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(writeObservations, observations);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    @Override
    public Planet getAPlanet(String planetName) {
        return null;
    }

    @Override
    public Location getALocation(String planetName, String locationID) {
        return null;
    }

    @Override
    public ArrayList<Location> getLocations(String planetName) {
        return null;
    }

    @Override
    public Observation getOneObservation(String observationID) {
        for (Observation o : observations) {
            if (o.getId().equalsIgnoreCase(observationID)) {
                return o;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Observation> getAllObservations() {
        return new ArrayList<>(observations);
    }

    @Override
    public Animal getAnAnimal(String planetName, String locationID, String observationID, String animalID) {
        return null;
    }

    @Override
    public ArrayList<Animal> getAnimals(String planetName, String locationID, String observationID) {
        return null;
    }

    @Override
    public void createObservation(String planetName, String locationID, Observation observation) {

    }

    @Override
    public void updateObservation(String planetName, String locationID, String observationID, Observation updatedObservation) {

    }

    @Override
    public void deleteObservation(String planetName, String locationID, String observationID) {

    }

    @Override
    public void createLocation(String planetName, Location newLocation) {

    }

    @Override
    public void updateLocation(String planetName, String locationID, Location updatedLocation) {

    }

    @Override
    public void deleteLocation(String planetName, String locationID) {

    }

    @Override
    public void createAnimal(String planetName, String locationID, String observationID, Animal newAnimal) {

    }

    @Override
    public void updateAnimal(String planetName, String locationID, String observationID, String animalID, Animal updatedAnimal) {

    }

    @Override
    public void deleteAnimal(String planetName, String locationID, String observationID, String animalID) {

    }

    @Override
    public void createPlanet(String name, Planet planet) {

    }

    @Override
    public void updatePlanet(String name, Planet updatedPlanet) {

    }

    @Override
    public void deletePlanet(String name) {

    }
}
