package no.hiof.ramiab.model;

public class ClimateGroup implements Comparable<ClimateGroup> {

    /*Simplified Köppen climate classification*/
    private char groupLetter;
    private String groupName;
    private double avgTemperature;

    /*Remember to create empty constructors for deserializing*/
    public ClimateGroup() {

    }

    public ClimateGroup(char groupLetter, String groupName, double avgTemperature) {
        this.groupLetter = groupLetter; //A
        this.groupName = groupName; //Tropical climate
        this.avgTemperature = avgTemperature;
    }

    public char getGroupLetter() {
        return groupLetter;
    }

    public void setGroupLetter(char groupLetter) {
        this.groupLetter = groupLetter;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public double getAvgTemperature() {
        return avgTemperature;
    }

    public void setAvgTemperature(double avgTemperature) {
        this.avgTemperature = avgTemperature;
    }

    @Override
    public String toString() {
        return String.format("In group %c, also known as %s, the average temperature is %f celcius.", getGroupLetter(), getGroupName(), getAvgTemperature());
    }

    @Override
    public int compareTo(ClimateGroup climateGroup) {
        if (this.avgTemperature < climateGroup.getAvgTemperature()) {
            return -1;
        } else if (this.avgTemperature > climateGroup.getAvgTemperature()) {
            return 1;
        }
        return 0;
    }
}
