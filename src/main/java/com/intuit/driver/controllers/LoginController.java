package com.intuit.driver.controllers;

import com.intuit.driver.model.LoginProfile;
import com.intuit.driver.services.DriverAccountsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    DriverAccountsService accountsService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestParam LoginProfile loginProfile) {
        
    }
}
