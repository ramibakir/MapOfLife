package no.hiof.ramiab.model;

public class Climate {

    /*Köppen climate classification*/
    private char group, subGroup;
    private String climateType, groupName;
    private double avgColdestTemperature;
    private double avgHottestTemperature;
    //nedbør
    private boolean precipitation;

    public Climate(char group, char subGroup, String climateType, String groupName, double avgColdestTemperature, double avgHottestTemperature, boolean precipitation) {
        this.group = group;
        this.subGroup = subGroup;
        this.climateType = climateType;
        this.groupName = groupName;
        this.avgColdestTemperature = avgColdestTemperature;
        this.avgHottestTemperature = avgHottestTemperature;
        this.precipitation = precipitation;
    }

    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
    }

    public char getSubGroup() {
        return subGroup;
    }

    public void setSubGroup(char subGroup) {
        this.subGroup = subGroup;
    }

    public String getClimateType() {
        return climateType;
    }

    public void setClimateType(String climateType) {
        this.climateType = climateType;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public double getAvgColdestTemperature() {
        return avgColdestTemperature;
    }

    public void setAvgColdestTemperature(double avgColdestTemperature) {
        this.avgColdestTemperature = avgColdestTemperature;
    }

    public double getAvgHottestTemperature() {
        return avgHottestTemperature;
    }

    public void setAvgHottestTemperature(double avgHottestTemperature) {
        this.avgHottestTemperature = avgHottestTemperature;
    }

    public boolean isPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(boolean precipitation) {
        this.precipitation = precipitation;
    }
}
