package com.example.insuranceapp;

public class BusinessPolicy {
    private String client;
    private String name;
    private String servIndustries;
    private String businessCost;
    private String profitPerYear;
    private String compensation;
    private String respons;

    public BusinessPolicy(String client, String name, String servIndustries, String businessCost, String profitPerYear, String compensation, String respons) {
        this.client = client;
        this.name = name;
        this.servIndustries = servIndustries;
        this.businessCost = businessCost;
        this.profitPerYear = profitPerYear;
        this.compensation = compensation;
        this.respons = respons;
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

    public String getServIndustries() {
        return servIndustries;
    }

    public void setServIndustries(String servIndustries) {
        this.servIndustries = servIndustries;
    }

    public String getBusinessCost() {
        return businessCost;
    }

    public void setBusinessCost(String businessCost) {
        this.businessCost = businessCost;
    }

    public String getProfitPerYear() {
        return profitPerYear;
    }

    public void setProfitPerYear(String profitPerYear) {
        this.profitPerYear = profitPerYear;
    }

    public String getCompensation() {
        return compensation;
    }

    public void setCompensation(String compensation) {
        this.compensation = compensation;
    }

    public String getRespons() {
        return respons;
    }

    public void setRespons(String respons) {
        this.respons = respons;
    }
}
