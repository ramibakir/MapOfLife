package no.hiof.ramiab.controller;

import io.javalin.http.Context;
import no.hiof.ramiab.repository.IMapOfLifeRepository;

public class ObservationController {
    private IMapOfLifeRepository mapOfLifeRepository;

    public ObservationController(IMapOfLifeRepository mapOfLifeRepository) {
        this.mapOfLifeRepository = mapOfLifeRepository;
    }

    public void deleteObservation(Context context){
        String planet = context.pathParam("planet-id");
        String location = context.pathParam("location-id");
        String observation = context.pathParam("observation-id");

        mapOfLifeRepository.deleteObservation(planet, location, observation);
    }
}
