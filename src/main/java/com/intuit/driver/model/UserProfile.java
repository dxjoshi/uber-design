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
}
