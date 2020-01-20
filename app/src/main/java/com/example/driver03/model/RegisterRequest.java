package com.example.driver03.model;

public class RegisterRequest {
    private String first_name;
    private String last_name;
    private String licence_number;
    private String driver_mail;
    private String password;
    private String birthday;
//    private String password;
    //    private String birthday;
    private String contact_no;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLicence_number() {
        return licence_number;
    }

    public void setLicence_number(String licence_number) {
        this.licence_number = licence_number;
    }

    public String getDriver_mail() {
        return driver_mail;
    }

    public void setDriver_mail(String driver_mail) {
        this.driver_mail = driver_mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }
}
