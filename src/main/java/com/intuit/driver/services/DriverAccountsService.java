package com.intuit.driver.services;

import com.intuit.driver.model.UserProfile;

import java.util.HashMap;
import java.util.Map;

public class DriverAccountsService {

    private final Map<String, String> userPwdMap;
    private final Map<String, UserProfile> userProfileMap;

    public DriverAccountsService() {
        userPwdMap = new HashMap<>();
        userProfileMap = new HashMap<>();
    }

    public void signup(String username, String password) {
        if (userPwdMap.containsKey(username)) {
            throw new RuntimeException("User Already Created!");
        }
        userPwdMap.put(username, password);
    }

    public boolean signin(String username, String password) {
        if (!userPwdMap.containsKey(username)) {
            throw new RuntimeException("User or Password incorrect!");
        }
        String pwd = userPwdMap.get(username);
        return pwd.equals(password);

    }

}
