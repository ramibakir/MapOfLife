package no.hiof.ramiab.model;

public class Biome {
    private String biomeName;
    private ClimateGroup biomeClimateGroup;

    /*Remember to create empty constructors for deserializing*/
    public Biome() {

    }

    public Biome(String name, ClimateGroup biomeClimateGroup) {
        this.biomeName = name;
        this.biomeClimateGroup = biomeClimateGroup;
    }

    public String getName() {
        return biomeName;
    }

    public void setName(String name) {
        this.biomeName = name;
    }

    public ClimateGroup getBiomeClimateGroup() {
        return biomeClimateGroup;
    }

    public void setBiomeClimateGroup(ClimateGroup biomeClimateGroup) {
        this.biomeClimateGroup = biomeClimateGroup;
    }

    @Override
    public String toString() {
        return String.format("%s biome is part of group %c, also known as a %s. The average temperature of group %c is %f celcius.", getName(), getBiomeClimateGroup().getGroupLetter(),
                getBiomeClimateGroup().getGroupName(), getBiomeClimateGroup().getGroupLetter(), getBiomeClimateGroup().getAvgTemperature());
    }
}
