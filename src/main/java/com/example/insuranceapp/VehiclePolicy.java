package com.example.insuranceapp;

public class VehiclePolicy {
    private String client;
    private String maker;
    private String model;
    private String type;
    private String regNumber;
    private String vinNumber;
    private String engineCapacity;
    private String fuelType;
    private String color;

    public VehiclePolicy(String client, String maker, String model, String type, String regNumber, String vinNumber, String engineCapacity, String fuelType, String color) {
        this.client = client;
        this.maker = maker;
        this.model = model;
        this.type = type;
        this.regNumber = regNumber;
        this.vinNumber = vinNumber;
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.color = color;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
