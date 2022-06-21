package com.intuit.driver.controllers;

import com.intuit.driver.model.PaymentProfile;
import com.intuit.driver.model.UserProfile;
import com.intuit.driver.services.DriverAccountsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class DriverRegistrationController {

    DriverAccountsService accountsService;

    public DriverRegistrationController(DriverAccountsService accountsService) {
        this.accountsService = accountsService;
    }

    @PutMapping("/accounts/{userId}")
    public ResponseEntity registerDriverProfile(@PathParam("userId") String userId, @RequestBody UserProfile userProfile) {
        accountsService.addUser(userId, userProfile);
        return ResponseEntity.ok("UserProfile successfully registered");
    }

    @PatchMapping("/accounts/{userId}/payments")
    public ResponseEntity addPaymentProfile(@PathParam("userId") String userId, @RequestBody PaymentProfile paymentProfile) {
        accountsService.addUser(userId, userProfile);
        return ResponseEntity.ok("UserProfile successfully registered");
    }

}
