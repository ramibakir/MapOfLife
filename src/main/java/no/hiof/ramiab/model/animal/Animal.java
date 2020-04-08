package no.hiof.ramiab.model.animal;

import java.util.UUID;

public class Animal {
    private String ID, animalName, latinName, color;
    private boolean livesInWater, canFly, laysEggs;
    private double weight;
    private int legs;

    public Animal(String ID, String animalName, String latinName, String color, boolean livesInWater, boolean canFly, boolean laysEggs, double weight, int legs) {
        this.ID = UUID.randomUUID().toString();
        this.animalName = animalName;
        this.latinName = latinName;
        this.color = color;
        this.livesInWater = livesInWater;
        this.canFly = canFly;
        this.laysEggs = laysEggs;
        this.weight = weight;
        this.legs = legs;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLivesInWater() {
        return livesInWater;
    }

    public void setLivesInWater(boolean livesInWater) {
        this.livesInWater = livesInWater;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isLaysEggs() {
        return laysEggs;
    }

    public void setLaysEggs(boolean laysEggs) {
        this.laysEggs = laysEggs;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return getAnimalName() + " or "+ getLatinName() + "in Latin is a " +  getColor() + "colored animal. " + getAnimalName() + " weighs " + getWeight() + " and has " + getLegs() + " legs.";
    }
}
