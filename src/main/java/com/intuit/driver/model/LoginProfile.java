package com.intuit.driver.model;


public class LoginProfile {
    String username;
    String password;

    public LoginProfile() {
    }

    public LoginProfile(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
