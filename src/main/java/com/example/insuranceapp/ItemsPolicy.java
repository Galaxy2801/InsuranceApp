package com.example.insuranceapp;

public class ItemsPolicy {
    private String client;
    private String name;
    private String cost;
    private String propCondition;
    private String compensation;

    public ItemsPolicy(String client, String name, String cost, String propCondition, String compensation) {
        this.client = client;
        this.name = name;
        this.cost = cost;
        this.propCondition = propCondition;
        this.compensation = compensation;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getPropCondition() {
        return propCondition;
    }

    public void setPropCondition(String propCondition) {
        this.propCondition = propCondition;
    }

    public String getCompensation() {
        return compensation;
    }

    public void setCompensation(String compensation) {
        this.compensation = compensation;
    }
}
