package com.intuit.driver.model;

import java.time.LocalDateTime;

public class UserProfile {
    String userId;
    String name;
    String age;
    String mobileNumber;
    String emailId;
    Address address;
    LocalDateTime creationTime;
    PaymentProfile paymentProfile;
    LoginProfile loginProfile;

    public UserProfile() {
    }

    public UserProfile(String name, String age, String mobileNumber, String emailId, Address address) {
        this.name = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public PaymentProfile getPaymentProfile() {
        return paymentProfile;
    }

    public void setPaymentProfile(PaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    public LoginProfile getLoginProfile() {
        return loginProfile;
    }

    public void setLoginProfile(LoginProfile loginProfile) {
        this.loginProfile = loginProfile;
    }
}
