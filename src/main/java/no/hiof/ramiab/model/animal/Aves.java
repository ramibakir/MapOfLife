package no.hiof.ramiab.model.animal;

public class Aves extends Animal {
    private double wingspan;
    private double height;
    private boolean hasWings;

    /*Remember to create empty constructors for deserializing*/
    public Aves() {

    }

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
        return String.format("%s is an %s and weighs %.2fg and has %d legs. %s has a wingspan of %fm and a height of %fcm", super.toString(), this.getClass().getSimpleName(), getWeight(), getLegs(), getName(), getWingspan(), getHeight());
    }
}
