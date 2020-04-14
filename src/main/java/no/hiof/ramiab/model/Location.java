package no.hiof.ramiab.model;

import java.util.ArrayList;

public class Location {
    private String locationName, ID;
    private double latitude, longitude;
    private Biome locationBiome;
    private int observationsAtLocation;
    private ArrayList<Observation> observations;

    public Location(String ID, String locationName, double latitude, double longitude, Biome locationBiome, int observationsAtLocation) {
        this.ID = ID;
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.locationBiome = locationBiome;
        this.observationsAtLocation = observationsAtLocation;
    }

    /*Retrieves an observation based on the unique UUID*/
    public Observation getOneObservation(String ID){
        for(Observation o : observations){
            if(o.getID().equals(ID)){
                return o;
            }
        }
        return null;
    }

    /*Remember that this returns a copy of observations*/
    public ArrayList<Observation> getAllObservations(){
        return new ArrayList<>(observations);
    }

//    public void addObservation(Observation observation){
//        observations.add(observation);
//    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public int getObservationsAtLocation() {
        return observationsAtLocation;
    }

    public void setObservationsAtLocation(int observationsAtLocation) {
        this.observationsAtLocation = observationsAtLocation;
    }

    @Override
    public String toString() {
        return String.format("Location %s is located at (%f, %f) and has a %s as a biome. There has been %d observations of animals at this location.", getLocationName(),
                getLatitude(), getLongitude(), getLocationBiome().getName(), getObservationsAtLocation());
    }
}
