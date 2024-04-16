package com.example.insuranceapp;

public class User {
    private String firstName;
    private String secondName;
    private String thirdName;
    private String userName;
    private String password;
    private String permission;

    public User(String firstName, String secondName, String thirdName, String userName, String password, String permission) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.userName = userName;
        this.password = password;
        this.permission = permission;
    }

    public User() {

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

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
