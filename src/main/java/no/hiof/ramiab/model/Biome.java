package no.hiof.ramiab.model;

public class Biome {
    private String biomeName;
    private Climate biomeClimate;

    public Biome(String name, Climate biomeClimate) {
        this.biomeName = name;
        this.biomeClimate = biomeClimate;
    }

    public String getName() {
        return biomeName;
    }

    public void setName(String name) {
        this.biomeName = name;
    }

    public Climate getBiomeClimate() {
        return biomeClimate;
    }

    public void setBiomeClimate(Climate biomeClimate) {
        this.biomeClimate = biomeClimate;
    }
}
