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
import java.util.List;

public class MapOfLifeRepository implements IMapOfLifeRepository{
    private List<Planet> planets = new ArrayList<>();

    public MapOfLifeRepository(String file) {
        readPlanetsFromFile(file);
        writeObservationToFile(planets, file);
    }

    public List<Planet> readPlanetsFromFile(String fileName) {
        File planetFile = new File(fileName);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        if(!planetFile.isFile()){
            return planets;
        }

        try{
            Planet[] planetArray = objectMapper.readValue(planetFile, Planet[].class);

            this.planets = Arrays.asList(planetArray);
        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }

        return planets;
    }

    public void writeObservationToFile(List<Planet> observations, String file){
        File writeLocations = new File(file);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        try{
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(writeLocations, observations);
        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Override
    public Planet getAPlanet(String planetName) {
        for(Planet p : planets){
            if(p.getName().equals(planetName)){
                return p;
            }
        }
        return null;
    }

    @Override
    public Location getALocation(String planetName, String locationID) {
        return getAPlanet(planetName).getOneLocation(locationID);
    }

    @Override
    public ArrayList<Location> getLocations(String planetName) {
        return getAPlanet(planetName).getAllLocations();
    }

    @Override
    public Observation getOneObservation(String planetName, String locationID, String observationID) {
        return getAPlanet(planetName).getOneLocation(locationID).getOneObservation(observationID);
    }

    @Override
    public ArrayList<Observation> getObservations(String planetName, String locationID) {
        return getAPlanet(planetName).getOneLocation(locationID).getAllObservations();
    }

    @Override
    public Animal getAnAnimal(String planetName, String locationID, String observationID, String animalID) {
        return getAPlanet(planetName).getOneLocation(locationID).getOneObservation(observationID).getAnAnimal(animalID);
    }

    @Override
    public ArrayList<Animal> getAnimals(String planetName, String locationID, String observationID) {
        return getAPlanet(planetName).getOneLocation(locationID).getOneObservation(observationID).getAnimals();
    }

    @Override
    public void createObservation(String ID) {

    }

    @Override
    public void updateObservation(String ID, Observation updatedObservation) {

    }

    @Override
    public void deleteObservation(String planetName, String locationID, String observationID) {
        Planet planet = getAPlanet(planetName);
        Location location = planet.getOneLocation(locationID);

        location.removeObservation(location.getOneObservation(observationID));
    }

    @Override
    public void createLocation(String ID) {

    }

    @Override
    public void updateLocation(String ID, Location updatedLocation) {

    }

    @Override
    public void deleteLocation(String planetName, String locationID) {

    }

    @Override
    public void createAnimal(String ID, String animalName) {

    }

    @Override
    public void updateAnimal(String ID, Animal animal) {

    }

    @Override
    public void deleteAnimal(String planetName, String locationID, String observationID, String animalID) {

    }

    @Override
    public void createPlanet(String name, String planetSystem) {

    }

    @Override
    public void updatePlanet(String name, String planetSystem, Planet updatedPlanet) {

    }

    @Override
    public void deletePlanet(String name, String planetSystem) {

    }
}
