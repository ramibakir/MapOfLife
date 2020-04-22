package no.hiof.ramiab.model.animal;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/*Needs to be added for the deserializing to know how to construct each animal*/
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Amphibia.class, name = "Amphibia"),
        @JsonSubTypes.Type(value = Aves.class, name = "Aves"),
        @JsonSubTypes.Type(value = Invertebrate.class, name = "Invertebrate"),
        @JsonSubTypes.Type(value = Mammalia.class, name = "Mammalia")
})

public abstract class Animal implements Comparable<Animal> {
    private String ID, name, latinName, color, pictureURL;
    private boolean livesInWater, canFly, laysEggs;
    private double weight;
    private int legs;

    /*Remember to create empty constructors for deserializing*/
    public Animal() {

    }

    public Animal(String ID, String name, String latinName, String color, String pictureURL, boolean livesInWater, boolean canFly, boolean laysEggs, double weight, int legs) {
        this.ID = ID;
        this.name = name;
        this.latinName = latinName;
        this.color = color;
        this.pictureURL = pictureURL;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
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
        return String.format("%s", getName());
    }

    @Override
    public int compareTo(Animal a) {
        if (this.weight < a.getWeight()) {
            return -1;
        } else if (this.weight > a.getWeight()) {
            return 1;
        }
        return 0;
    }
}
