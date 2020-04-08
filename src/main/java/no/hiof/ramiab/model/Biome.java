package no.hiof.ramiab.model;

import no.hiof.ramiab.model.climate.ClimateGroup;

public class Biome {
    private String biomeName;
    private ClimateGroup biomeClimateGroup;

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
        return "Fiks denne";
    }
}
