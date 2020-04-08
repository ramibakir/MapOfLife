package no.hiof.ramiab.model;

import java.util.ArrayList;

public class Planet {
    private String name, climate;
    private double mass, radius, orbitalPeriod, temperature;
    private boolean isBreathable;
    private ArrayList<Location> locations;

    public Planet(String name, String climate, double mass, double radius, double orbitalPeriod, double temperature, boolean isBreathable, ArrayList<Location> planetLocations) {
        this.name = name;
        this.climate = climate;
        this.mass = mass;
        this.radius = radius;
        this.orbitalPeriod = orbitalPeriod;
        this.temperature = temperature;
        this.isBreathable = isBreathable;
        this.locations = planetLocations;
    }

    /*Remember that this returns a copy of observations*/
    public ArrayList<Location> getAllLocations(){
        return new ArrayList<>(locations);
    }

    public Location getOneLocation(String name){
        for(Location l : locations){
            if(l.getLocationName().equals(name)){
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

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
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

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isBreathable() {
        return isBreathable;
    }

    public void setBreathable(boolean breathable) {
        isBreathable = breathable;
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
                getName(), getMass(), getRadius(), getName(), getOrbitalPeriod(), getTemperature());
    }
}
