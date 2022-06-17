#Ride Management Application    
You are responsible for the driver onboarding module.        

### Details:    
As part of this module you are required to build an interface that will allow a driver to sign-up as a driver partner. 
The driver onboarding module should:        
a) Allow a driver to sign-up and enter their profile information.            
b) Trigger onboarding processes like document collection, background verification, shipping of tracking device, etc.,           
c) Allow a driver to mark when they are ready to take a ride        

### TODO:   
Please create a list of the API interfaces you will expose to support these requirements and also come up with choices of data stores, tech stacks, etc.,       
Instructions to the candidate:
1. We are interested in your approach to the problem. It is alright if you don’t have a beautiful PPT.           
2. You can even use pen/paper to draw your design and take a pic of that and share it as part of your craft demo.            
3. Do take the time to clearly define the data models and the API interfaces.           


###APIs
POST /register {Driver Profile}
PATCH /active {isActive: true}
POST /drivers/{driverId}/document/{docName}
GET /drivers/{driverId}/bgv
POST /drivers/{driverId}/ship-device

### Data Model:

class UserProfile {
    String userId;
    String name;
    String age;
    String mobileNumber;
    String emailId;
    Address address;
    Date creationDate;
    PaymentProfile paymentProfile;
    LoginProfile loginProfile; 
}

class LoginProfile {
    String loginId;
    String password;
}

class PaymentProfile {
    String panId;
    List<Account> accounts;
}

class Account {
    String accountId;
    PaymentSourceType type;
    Double currentBalance;   
}

enum PaymentSourceType {
    DEBIT_CARD, CREDIT_CARD, UPI, DIGITAL_WALLET;
}

class Address {
    String houseNumber;
    String street;
    String city;
    String state;
    String country;
    String pinCode;
}

class DriverProfile extends UserProfile {
    List<DocumentDetail> uploadedDocuments;
    boolean isBackgroundVerified;
    boolean isAccountActivated; // if (BGV && cab.isCertified)    
}

class DocumentDetail {
    String documentUrl; //byte[] documentBlob;
    DocumentType documentType;
    boolean isVerified;
}

enum DocumentType {
    PROFILE_PHOTO, 
    DRIVING_LICENSE, 
    PAN_CARD, 
    VEHICLE_REGISTRATION_CERTIFICATE, 
    VEHICLE_HEALTH_CERTIFICATE, 
    VEHICLE_INSURANCE, 
    VEHICLE_PERMIT;
}


class Cab {
    String id;
    Trip currentTrip;
    Location currentLocation;
    Vehicle vehicle;
    boolean isAvailable;
    boolean isCertified; // if it is equiped with all necessary equipments
    CabStatus cabStatus;
    String registrationId;
}

class Vehicle {
    String name;
    Color color;
    String brandName;
    String modelName;
    CarType type;
}

enum CabStatus {
    OFFLINE, AVAILABLE, BOOKED;
}

enum Color {
    RED, BLUE, GREEN, WHITE;
}

enum CarType {
    SEDAN, SUV, HATCHBACK;
}

class Trip {
    
}

class Location {
    Double longitude;
    Double latitude;
}

