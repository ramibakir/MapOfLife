package no.hiof.ramiab.model.animal;

import no.hiof.ramiab.model.animal.Animal;

public class Invertebrate extends Animal {
    private String group;

    public Invertebrate(String ID, String animalName, String latinName, String color, boolean livesInWater, boolean canFly, boolean laysEggs, double weight, String group, int legs) {
        super(ID, animalName, latinName, color, livesInWater, canFly, laysEggs, weight, legs);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getAnimalName() + " is a " + this.getClass().getSimpleName() + " and is part of the " + getGroup() + " family";
    }
}
