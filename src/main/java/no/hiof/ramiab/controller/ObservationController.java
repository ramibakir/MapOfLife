package no.hiof.ramiab.controller;

import io.javalin.http.Context;
import no.hiof.ramiab.repository.IMapOfLifeRepository;

public class ObservationController {
    private final IMapOfLifeRepository mapOfLifeRepository;

    public ObservationController(IMapOfLifeRepository mapOfLifeRepository) {
        this.mapOfLifeRepository = mapOfLifeRepository;
    }

    public void getAllObservations(Context context) {
        context.json(mapOfLifeRepository.getAllObservations());
    }

    public void createObservation(Context context) {
    }

    public void deleteObservation(Context context) {
    }
}
