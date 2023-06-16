package com.example.sampleapplication;

public class Region {

    private String Region_Name;
    private int Number_of_Reports;

    public Region(String region_Name, int number_of_Reports) {
        Region_Name = region_Name;
        Number_of_Reports = number_of_Reports;
    }

    public Region(){

    }

    public String getRegion_Name() {
        return Region_Name;
    }

    public void setRegion_Name(String region_Name) {
        Region_Name = region_Name;
    }

    public int getNumber_of_Reports() {
        return Number_of_Reports;
    }

    public void setNumber_of_Reports(int number_of_Reports) {
        Number_of_Reports = number_of_Reports;
    }

    @Override
    public String toString() {
        return "Region{" +
                "Region_Name='" + Region_Name + '\'' +
                ", Number_of_Reports=" + Number_of_Reports +
                '}';
    }
}
