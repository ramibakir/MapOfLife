package no.hiof.ramiab.model;

import java.util.ArrayList;

public class Planet {
    private String name, climate;
    private double mass, radius, orbitalPeriod, surfaceGravity, temperature;
    private boolean isBreathable;
    private ArrayList<Location> locations = new ArrayList<>();

    public Planet(String name, String climate, double mass, double radius, double orbitalPeriod, double surfaceGravity, double temperature, boolean isBreathable) {
        this.name = name;
        this.climate = climate;
        this.mass = mass;
        this.radius = radius;
        this.orbitalPeriod = orbitalPeriod;
        this.surfaceGravity = surfaceGravity;
        this.temperature = temperature;
        this.isBreathable = isBreathable;
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

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public void setSurfaceGravity(double surfaceGravity) {
        this.surfaceGravity = surfaceGravity;
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

    @Override
    public String toString() {
        return String.format("%s has a mass of %.2fkg, and a radius of %.2fkm. The orbital period of %s is %.2f, the surface gravity is %.2f, and the temperature is %.2fkg.",
                getName() + getMass() + getRadius() + getOrbitalPeriod() + getSurfaceGravity() + getTemperature());
    }
}
