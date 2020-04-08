package no.hiof.ramiab.model.climate;

import no.hiof.ramiab.model.climate.ClimateGroup;

public class ClimateSubGroup extends ClimateGroup {
    private String climateType, subGroupName;
    private double precipitation; //= nedbør

    public ClimateSubGroup(char group, String groupName, double avgTemperature, String climateType, String subGroupName, double precipitation) {
        super(group, groupName, avgTemperature);
        this.climateType = climateType;
        this.subGroupName = subGroupName;
        this.precipitation = precipitation;
    }

    public String getClimateType() {
        return climateType;
    }

    public void setClimateType(String climateType) {
        this.climateType = climateType;
    }

    public String getSubGroupName() {
        return subGroupName;
    }

    public void setSubGroupName(String subGroupName) {
        this.subGroupName = subGroupName;
    }

    public double Precipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }
}
