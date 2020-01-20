package com.example.driver03.model;

public class LoginResponse {
    private String message;
    private boolean isUserRight;
    private String driverId;
    private String driverFirstName;
    private String driverLastName;
    private String driverMail;
    private String driverContact;
    private boolean driverIsVertify;
    private String driverlicenceNumber;
    private int driverOverAllScore;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isUserRight() {
        return isUserRight;
    }

    public void setUserRight(boolean userRight) {
        isUserRight = userRight;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDriverFirstName() {
        return driverFirstName;
    }

    public void setDriverFirstName(String driverFirstName) {
        this.driverFirstName = driverFirstName;
    }

    public String getDriverLastName() {
        return driverLastName;
    }

    public void setDriverLastName(String driverLastName) {
        this.driverLastName = driverLastName;
    }

    public String getDriverMail() {
        return driverMail;
    }

    public void setDriverMail(String driverMail) {
        this.driverMail = driverMail;
    }

    public String getDriverContact() {
        return driverContact;
    }

    public void setDriverContact(String driverContact) {
        this.driverContact = driverContact;
    }

    public boolean isDriverIsVertify() {
        return driverIsVertify;
    }

    public void setDriverIsVertify(boolean driverIsVertify) {
        this.driverIsVertify = driverIsVertify;
    }

    public String getDriverlicenceNumber() {
        return driverlicenceNumber;
    }

    public void setDriverlicenceNumber(String driverlicenceNumber) {
        this.driverlicenceNumber = driverlicenceNumber;
    }

    public int getDriverOverAllScore() {
        return driverOverAllScore;
    }

    public void setDriverOverAllScore(int driverOverAllScore) {
        this.driverOverAllScore = driverOverAllScore;
    }
}
