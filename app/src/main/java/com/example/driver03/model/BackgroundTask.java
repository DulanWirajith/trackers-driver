package com.example.driver03.model;


public class BackgroundTask {
    private static BackgroundTask backgroundTask;
    private static String driverId;
    private static String driverFirstName;
    private static String driverLastName;
    private static String driverMail;
    private static String driverContact;
    private static boolean driverIsVertify;
    private static String driverlicenceNumber;
    private static int driverOverAllScore;


    private BackgroundTask(String driverId, String driverFirstName, String driverLastName, String driverMail, String driverContact, boolean driverIsVertify, String driverlicenceNumber, int driverOverAllScore) {
        this.driverId = driverId;
        this.driverFirstName = driverFirstName;
        this.driverLastName = driverLastName;
        this.driverMail = driverMail;
        this.driverContact = driverContact;
        this.driverIsVertify = driverIsVertify;
        this.driverlicenceNumber = driverlicenceNumber;
        this.driverOverAllScore = driverOverAllScore;
    }

    public static String getDriverId() {
        return driverId;
    }

    public static void setDriverId(String driverId) {
        BackgroundTask.driverId = driverId;
    }

    public static String getDriverFirstName() {
        return driverFirstName;
    }

    public static void setDriverFirstName(String driverFirstName) {
        BackgroundTask.driverFirstName = driverFirstName;
    }

    public static String getDriverLastName() {
        return driverLastName;
    }

    public static void setDriverLastName(String driverLastName) {
        BackgroundTask.driverLastName = driverLastName;
    }

    public static String getDriverMail() {
        return driverMail;
    }

    public static void setDriverMail(String driverMail) {
        BackgroundTask.driverMail = driverMail;
    }

    public static String getDriverContact() {
        return driverContact;
    }

    public static void setDriverContact(String driverContact) {
        BackgroundTask.driverContact = driverContact;
    }

    public static boolean isDriverIsVertify() {
        return driverIsVertify;
    }

    public static void setDriverIsVertify(boolean driverIsVertify) {
        BackgroundTask.driverIsVertify = driverIsVertify;
    }

    public static String getDriverlicenceNumber() {
        return driverlicenceNumber;
    }

    public static void setDriverlicenceNumber(String driverlicenceNumber) {
        BackgroundTask.driverlicenceNumber = driverlicenceNumber;
    }

    public static int getDriverOverAllScore() {
        return driverOverAllScore;
    }

    public static void setDriverOverAllScore(int driverOverAllScore) {
        BackgroundTask.driverOverAllScore = driverOverAllScore;
    }

    public static BackgroundTask setBackgroundTask(String driverId, String driverFirstName, String driverLastName, String driverMail, String driverContact, boolean driverIsVertify, String driverlicenceNumber, int driverOverAllScore) {
        if (backgroundTask == null) {
            backgroundTask = new BackgroundTask(driverId, driverFirstName, driverLastName, driverMail, driverContact, driverIsVertify, driverlicenceNumber, driverOverAllScore);
        }
        return backgroundTask;
    }

    public static BackgroundTask getBackgroundTask() {
        return backgroundTask;
    }
}