package no.hiof.ramiab.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import no.hiof.ramiab.model.Observation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MapOfLifeJSONObservationRepository implements IMapOfLifeRepository {
    private final ArrayList<Observation> observations = new ArrayList<>();

    public MapOfLifeJSONObservationRepository() {
        readObservationsFromFile("observations.json");
        writeObservationsToFile("observations.json");
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
    public void createObservation(Observation observation) {

    }

    @Override
    public void updateObservation(Observation updatedObservation) {

    }

    @Override
    public void deleteObservation(Observation observation) {

    }
}
