package com.anycompany.anybackend.model;

// Gute Erholung Naëmi!

import java.util.Date;

public class User {

    private int userId;
    private String firstName;
    private String lastName;
    private String address;
    private int phoneNumber;
    private String email;
    // private Cart cart; // todo
    private Date registrationDate;
    private Date lastLogin;
    private String userType;

    public User(int userId, String firstName, String lastName, String address, int phoneNumber, String email, Date registrationDate, Date lastLogin, String userType) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.registrationDate = registrationDate;
        this.lastLogin = lastLogin;
        this.userType = userType;
    }

    // constructor for guests
    public User (int userId, String userType) {
        this.userId = userId;
        this.userType = userType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
