package no.hiof.ramiab.repository;

import no.hiof.ramiab.model.Observation;

import java.util.ArrayList;

public interface IMapOfLifeRepository {
    Observation getOneObservation(String observationID);

    ArrayList<Observation> getAllObservations();

    void createObservation(Observation observation);

    void updateObservation(Observation updatedObservation);

    void deleteObservation(Observation observation);

}
