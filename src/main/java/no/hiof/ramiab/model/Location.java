package no.hiof.ramiab.model;

public class Location {
    private String locationName, ID;
    private double latitude, longitude;
    private Biome locationBiome;
    private int observationsAtLocation;

    /*Remember to create empty constructors for deserializing*/
    public Location() {

    }

    public Location(String ID, String locationName, double latitude, double longitude, Biome locationBiome, int observationsAtLocation) {
        this.ID = ID;
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.locationBiome = locationBiome;
        this.observationsAtLocation = observationsAtLocation;
    }

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
        return String.format("Location %s is located at (%f, %f) and has a %s as a biome. There has been %d %s of animals at this location.", getLocationName(),
                getLatitude(), getLongitude(), getLocationBiome().getName(), getObservationsAtLocation(), getObservationsAtLocation() == 1 ? "observation" : "observations");
    }
}
