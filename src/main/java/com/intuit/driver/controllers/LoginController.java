package com.intuit.driver.controllers;

import com.intuit.driver.model.LoginProfile;
import com.intuit.driver.services.DriverAccountsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    DriverAccountsService accountsService;

    public LoginController(DriverAccountsService accountsService) {
        this.accountsService = accountsService;
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody LoginProfile loginProfile) {
        accountsService.signup(loginProfile.getUsername(), loginProfile.getPassword());
        return ResponseEntity.ok("User signed up successfully");
    }

    @PostMapping("/signin")
    public ResponseEntity<String> signin(@RequestBody LoginProfile loginProfile) {
        String username = loginProfile.getUsername();
        boolean isSignedIn = accountsService.signin(username, loginProfile.getPassword());
        if (!isSignedIn) {
            return ResponseEntity.badRequest().body("Login attempt failed!!");
        }
        return ResponseEntity.ok("User signed in successfully");
    }

}
