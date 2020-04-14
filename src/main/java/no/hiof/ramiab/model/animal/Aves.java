package no.hiof.ramiab.model.animal;

import no.hiof.ramiab.model.animal.Animal;

public class Aves extends Animal {
    private double wingspan;
    private double height;
    private boolean hasWings;

    public Aves(String ID, String animalName, String latinName, String color, String pictureURL, boolean livesInWater, boolean canFly, boolean laysEggs, double weight, double wingspan, double height, boolean hasWings, int legs) {
        super(ID, animalName, latinName, color, pictureURL, livesInWater, canFly, laysEggs, weight, legs);
        this.wingspan = wingspan;
        this.height = height;
        this.hasWings = hasWings;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasWings() {
        return hasWings;
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getAnimalName() + " is a " + this.getClass().getSimpleName() + " and has a wingspan of " + getWingspan() + " and a height of " + getHeight();
    }
}
