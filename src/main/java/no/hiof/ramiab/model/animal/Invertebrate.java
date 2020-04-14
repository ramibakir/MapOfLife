package no.hiof.ramiab.model.animal;

import no.hiof.ramiab.model.animal.Animal;

public class Invertebrate extends Animal {
    private String group, subGroup;

    public Invertebrate(String ID, String animalName, String latinName, String color, String pictureURL, boolean livesInWater, boolean canFly, boolean laysEggs, double weight, int legs, String group, String subGroup) {
        super(ID, animalName, latinName, color, pictureURL, livesInWater, canFly, laysEggs, weight, legs);
        this.group = group;
        this.subGroup = subGroup;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSubGroup() {
        return subGroup;
    }

    public void setSubGroup(String subGroup) {
        this.subGroup = subGroup;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getAnimalName() + " is a " + this.getClass().getSimpleName() + " and is part of the " + getGroup() + " family";
    }
}
