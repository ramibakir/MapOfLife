package no.hiof.ramiab.controller;

import io.javalin.http.Context;
import no.hiof.ramiab.repository.IMapOfLifeRepository;

public class LocationController {
    private IMapOfLifeRepository mapOfLifeRepository;

    public LocationController(IMapOfLifeRepository mapOfLifeRepository) {
        this.mapOfLifeRepository = mapOfLifeRepository;
    }

    public void createALocation(Context context){
        String id = context.pathParam("id");

        mapOfLifeRepository.createLocation(id);
    }

    public void updateALocation(Context context){

    }

    public void deleteALocation(Context context){

    }
}
