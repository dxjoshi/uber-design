package com.intuit.driver.model;

public class Cab {
    String id;
    Trip currentTrip;
    Location currentLocation;
    Vehicle vehicle;
    boolean isAvailable;
    boolean isCertified; // if it is equiped with all necessary equipments
    CabStatus cabStatus;
}
