package com.intuit.driver.model;

import java.util.List;

public class DriverProfile {
    List<DocumentDetail> uploadedDocuments;
    boolean isBackgroundVerified;
    boolean isAccountActivated; // if (BGV && cab.isCertified)

}
