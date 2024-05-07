package com.example.insuranceapp;

public class HumanPolicy {
    private String id;
    private String client;
    private String firstName;
    private String secondName;
    private String middleName;
    private String age;
    private String gender;
    private String health;

    public HumanPolicy(String id, String client, String firstName, String secondName, String age, String middleName, String gender, String health) {
        this.id = id;
        this.client = client;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.middleName = middleName;
        this.gender = gender;
        this.health = health;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }
}
