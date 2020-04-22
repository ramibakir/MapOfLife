package no.hiof.ramiab.model.animal;

public class Mammalia extends Animal {
    private boolean domesticated;
    private double totalBodySize;
    private String family;

    /*Remember to create empty constructors for deserializing*/
    public Mammalia() {

    }

    public Mammalia(String ID, String animalName, String latinName, String color, String pictureURL, boolean livesInWater, boolean canFly, boolean laysEggs,
                    double weight, int legs, String family, double totalBodySize, boolean domesticated) {
        super(ID, animalName, latinName, color, pictureURL, livesInWater, canFly, laysEggs, weight, legs);
        this.family = family;
        this.totalBodySize = totalBodySize;
        this.domesticated = domesticated;
    }

    public boolean isDomesticated() {
        return domesticated;
    }

    public void setDomesticated(boolean domesticated) {
        this.domesticated = domesticated;
    }

    public double getTotalBodySize() {
        return totalBodySize;
    }

    public void setTotalBodySize(double totalBodySize) {
        this.totalBodySize = totalBodySize;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return String.format("%s belongs to the group %s and is of type %s. %s weighs %.2fkgs and the total body size is %f.", super.toString(), this.getClass().getSimpleName(), getFamily(),
                getName(), getWeight(), getTotalBodySize());
    }
}
