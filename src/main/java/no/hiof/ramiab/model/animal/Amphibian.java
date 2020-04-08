package no.hiof.ramiab.model.animal;

public class Amphibian extends Animal {
    private String group, subGroup;

    public Amphibian(String ID, String animalName, String latinName, String color, boolean livesInWater, boolean canFly, boolean laysEggs, double weight, String group, String subGroup, int legs) {
        super(ID, animalName, latinName, color, livesInWater, canFly, laysEggs, weight, legs);
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
        return super.toString() + " " + getAnimalName() + " is a " + this.getClass().getSimpleName() + " and belong to the group " + getGroup() + " and is a part of the " + getSubGroup() + " family";
    }
}
