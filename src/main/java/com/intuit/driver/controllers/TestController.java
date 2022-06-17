package com.intuit.driver.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity hello(String name) {
        String msg = "hi there! " + name;
        return ResponseEntity.ok(msg);
    }
}
