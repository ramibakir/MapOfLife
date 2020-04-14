package no.hiof.ramiab.model.animal;

public class Mammalia extends Animal {
    private boolean domesticated;
    private double size;
    private String type;

    public Mammalia(String ID, String animalName, String latinName, String color, String pictureURL, boolean livesInWater, boolean canFly, boolean laysEggs, double weight, int legs, String type, double size, boolean domesticated) {
        super(ID, animalName, latinName, color, pictureURL, livesInWater, canFly, laysEggs, weight, legs);
        this.type = type;
        this.size = size;
        this.domesticated = domesticated;
    }

    public boolean isDomesticated() {
        return domesticated;
    }

    public void setDomesticated(boolean domesticated) {
        this.domesticated = domesticated;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Mammalia{" +
                "domesticated=" + domesticated +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
