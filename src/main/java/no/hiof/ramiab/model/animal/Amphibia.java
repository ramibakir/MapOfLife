package no.hiof.ramiab.model.animal;

public class Amphibia extends Animal {
    private String group, subGroup;
    private static int amphibiaCounter = 1;

    public Amphibia(String ID, String animalName, String latinName, String color, String pictureURL, boolean livesInWater, boolean canFly, boolean laysEggs, double weight, String group, String subGroup, int legs) {
        super(Amphibia.class.getSimpleName() + " " +amphibiaCounter++, animalName, latinName, color, pictureURL, livesInWater, canFly, laysEggs, weight, legs);
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
        return String.format("%s is an %s and belongs to the group %s and is a part of the %s family. %s weighs %.2fg and has %d legs", super.toString(), this.getClass().getSimpleName(), getGroup(), getSubGroup(),
                getAnimalName(), getWeight(), getLegs());
    }
}
