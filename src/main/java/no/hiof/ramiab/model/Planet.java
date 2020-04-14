package no.hiof.ramiab.model;

import java.util.ArrayList;

public class Planet {
    private String name, planetSystem;
    private double mass, radius, orbitalPeriod, meanSurfaceTemperature;
    private ArrayList<Location> locations = new ArrayList<>();

    public Planet(String name, String planetSystem, double mass, double radius, double orbitalPeriod, double meanSurfaceTemperature) {
        this.name = name;
        this.planetSystem = planetSystem;
        this.mass = mass;
        this.radius = radius;
        this.orbitalPeriod = orbitalPeriod;
        this.meanSurfaceTemperature = meanSurfaceTemperature;
    }

    /*Remember that this returns a copy of observations*/
    public ArrayList<Location> getAllLocations(){
        return new ArrayList<>(locations);
    }

    public Location getOneLocation(String id){
        for(Location l : locations){
            if(l.getID().equals(id)){
                return l;
            }
        }
        return null;
    }

    public void addLocation(Location location){
        locations.add(location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanetSystem() {
        return planetSystem;
    }

    public void setPlanetSystem(String planetSystem) {
        this.planetSystem = planetSystem;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public double getMeanSurfaceTemperature() {
        return meanSurfaceTemperature;
    }

    public void setMeanSurfaceTemperature(double meanSurfaceTemperature) {
        this.meanSurfaceTemperature = meanSurfaceTemperature;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return String.format("%s has a mass of %.2fkg, and a radius of %.2fkm. The orbital period of %s is %.2f, and the temperature is %.2f celsius.",
                getName(), getMass(), getRadius(), getName(), getOrbitalPeriod(), getMeanSurfaceTemperature());
    }
}
