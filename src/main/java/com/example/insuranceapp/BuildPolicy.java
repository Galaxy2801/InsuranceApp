package com.example.insuranceapp;

public class BuildPolicy {
    private String client;
    private String address;
    private String area;
    private String areaUnit;
    private String buildType;
    private String numOfRooms;
    private String cost;

    public BuildPolicy(String client, String address, String area, String areaUnit, String buildType, String numOfRooms, String cost) {
        this.client = client;
        this.address = address;
        this.area = area;
        this.areaUnit = areaUnit;
        this.buildType = buildType;
        this.numOfRooms = numOfRooms;
        this.cost = cost;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreaUnit() {
        return areaUnit;
    }

    public void setAreaUnit(String areaUnit) {
        this.areaUnit = areaUnit;
    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public String getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(String numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
