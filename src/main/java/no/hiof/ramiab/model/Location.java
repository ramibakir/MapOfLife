package no.hiof.ramiab.model;

import java.util.ArrayList;

public class Location {
    private String locationName;
    private double latitude, longitude;
    private Biome locationBiome;
    private int observationsAtLocation;
    private ArrayList<Observation> observations;

    public Location(String locationName, double latitude, double longitude, Biome biome, int observationCounter) {
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.locationBiome = biome;
        this.observationsAtLocation = observationCounter;
    }

    /*Husk at denne returnerer en kopi av listen observations*/
    public ArrayList<Observation> getAllObservations(){
        return new ArrayList<>(observations);
    }

    public void addObservation(Observation observation){
        observations.add(observation);
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Biome getLocationBiome() {
        return locationBiome;
    }

    public void setLocationBiome(Biome locationBiome) {
        this.locationBiome = locationBiome;
    }
}
