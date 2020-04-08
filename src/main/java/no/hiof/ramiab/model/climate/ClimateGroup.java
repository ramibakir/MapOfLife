package no.hiof.ramiab.model.climate;

import java.util.ArrayList;

public class ClimateGroup {

    /*Simplified Köppen climate classification*/
    private char group;
    private String groupName;
    private double avgTemperature;
    private ArrayList<ClimateSubGroup> subGroups = new ArrayList<>();

    public ClimateGroup(char group, String groupName, double avgTemperature) {
        this.group = group; //A
        this.groupName = groupName; //Tropical climate
        this.avgTemperature = avgTemperature;
    }

    /*Remember that this returns a copy of observations*/
    public ArrayList<ClimateSubGroup> getAllSubGroups(){
        return new ArrayList<>(subGroups);
    }

    public ClimateSubGroup getASubGroup(String name){
        for(ClimateSubGroup cSG : subGroups){
            if(cSG.getSubGroupName().equals(name)){
                return cSG;
            }
        }
        return null;
    }

    public void addSubGroups(ClimateSubGroup c){
        subGroups.add(c);
    }

    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
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
        return String.format("In group %c, also known as %s, there ");
    }
}
