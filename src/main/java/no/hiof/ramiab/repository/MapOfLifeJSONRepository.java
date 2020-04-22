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

public class MapOfLifeJSONRepository implements IMapOfLifeRepository {
    private List<Planet> planets = new ArrayList<>();

    public MapOfLifeJSONRepository(String file) {
        writeToFile(file);
        readFromFile(file);
    }

    public List<Planet> readFromFile(String fileName) {
        File planetFile = new File(fileName);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        if (!planetFile.isFile()) {
            return planets;
        }

        try {
            Planet[] planetArray = objectMapper.readValue(planetFile, Planet[].class);

            this.planets = Arrays.asList(planetArray);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return planets;
    }

    public void writeToFile(String fileName) {
        File writePlanets = new File(fileName);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(writePlanets, planets);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    @Override
    public Planet getAPlanet(String planetName) {
        for (Planet p : planets) {
            if (p.getPlanetName().equals(planetName)) {
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
    public Observation getOneObservation(String observationID) {
        return null;
    }

    @Override
    public ArrayList<Observation> getAllObservations() {
        return new ArrayList<>();
    }

    @Override
    public Animal getAnAnimal(String planetName, String locationID, String observationID, String animalID) {
        //return getAPlanet(planetName).getOneLocation(locationID).getOneObservation(observationID).getAnAnimal(animalID);
        return null;
    }

    @Override
    public ArrayList<Animal> getAnimals(String planetName, String locationID, String observationID) {
        //return getAPlanet(planetName).getOneLocation(locationID).getOneObservation(observationID).getAnimals();
        return null;
    }

    @Override
    public void createObservation(String planetName, String locationID, Observation observation) {
        Planet planet = getAPlanet(planetName);
        Location location = planet.getOneLocation(locationID);

        //location.addObservation(observation);

        writeToFile("test.json");

    }

    @Override
    public void updateObservation(String planetName, String locationID, String observationID, Observation updatedObservation) {
        Planet planet = getAPlanet(planetName);
        Location location = planet.getOneLocation(locationID);
        //Observation oldObservation = location.getOneObservation(observationID);

        /*oldObservation.setName(updatedObservation.getName());
        oldObservation.setNotes(updatedObservation.getNotes());
        oldObservation.setAnimals(updatedObservation.getAnimals());*/

        writeToFile("test.json");

    }

    @Override
    public void deleteObservation(String planetName, String locationID, String observationID) {
        Planet planet = getAPlanet(planetName);
        Location location = planet.getOneLocation(locationID);

        //location.removeObservation(location.getOneObservation(observationID));

        writeToFile("test.json");
    }

    @Override
    public void createLocation(String planetName, Location newLocation) {
        Planet planet = getAPlanet(planetName);
        planet.addLocation(newLocation);

        writeToFile("test.json");
    }

    @Override
    public void updateLocation(String planetName, String locationID, Location updatedLocation) {
        Planet planet = getAPlanet(planetName);
        Location oldLocation = planet.getOneLocation(locationID);

        oldLocation.setID(updatedLocation.getID());
        oldLocation.setLocationName(updatedLocation.getLocationName());
        oldLocation.setLatitude(updatedLocation.getLatitude());
        oldLocation.setLongitude(updatedLocation.getLongitude());
        oldLocation.setLocationBiome(updatedLocation.getLocationBiome());
        oldLocation.setObservationsAtLocation(updatedLocation.getObservationsAtLocation());

        writeToFile("test.json");
    }

    @Override
    public void deleteLocation(String planetName, String locationID) {
        Planet planet = getAPlanet(planetName);
        planet.removeLocation(planet.getOneLocation(locationID));
    }

    @Override
    public void createAnimal(String planetName, String locationID, String observationID, Animal newAnimal) {
        Planet planet = getAPlanet(planetName);
        Location location = planet.getOneLocation(locationID);
        //Observation observation = location.getOneObservation(observationID);

        //observation.addAnimals(newAnimal);

        writeToFile("test.json");
    }

    @Override
    public void updateAnimal(String planetName, String locationID, String observationID, String animalID, Animal updatedAnimal) {
        Planet planet = getAPlanet(planetName);
        Location location = planet.getOneLocation(locationID);
        //Observation observation = location.getOneObservation(observationID);
        //Animal oldAnimal = observation.getAnAnimal(animalID);

        /*oldAnimal.setID(updatedAnimal.getID());
        oldAnimal.setName(updatedAnimal.getName());
        oldAnimal.setLatinName(updatedAnimal.getLatinName());
        oldAnimal.setColor(updatedAnimal.getColor());
        oldAnimal.setPictureURL(updatedAnimal.getPictureURL());
        oldAnimal.setLivesInWater(updatedAnimal.isLivesInWater());
        oldAnimal.setCanFly(oldAnimal.isCanFly());
        oldAnimal.setLaysEggs(updatedAnimal.isLaysEggs());
        oldAnimal.setWeight(updatedAnimal.getWeight());
        oldAnimal.setLegs(updatedAnimal.getLegs());*/

        writeToFile("test.json");
    }

    @Override
    public void deleteAnimal(String planetName, String locationID, String observationID, String animalID) {
        Planet planet = getAPlanet(planetName);
        Location location = planet.getOneLocation(locationID);
        /*Observation observation = location.getOneObservation(observationID);
        Animal oldAnimal = observation.getAnAnimal(animalID);

        observation.removeAnimal(oldAnimal);*/

        writeToFile("test.json");
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
