package com.sanapplications.goridebackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @SequenceGenerator(
            name= "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;
    private String email;
    private String password;
    private String phone;
    private String firstName;
    private String lastName;
    private String imagePath;
    private String emergencyContact;
    private String route;
    private String token;
    private int gotRating;
    private int totalRating;
    private int noOfRating;
    private double distanceTraveled;
    private String accStatus;


    // use @Transient if we want any value that we do not want to put inside as a column

    public UserModel() {
    }

    public UserModel(String accStatus, double distanceTraveled, String email, String emergencyContact, String firstName, int gotRating, String imagePath, String lastName, int noOfRating, String password, String phone, String route, String token, int totalRating) {
        this.accStatus = accStatus;
        this.distanceTraveled = distanceTraveled;
        this.email = email;
        this.emergencyContact = emergencyContact;
        this.firstName = firstName;
        this.gotRating = gotRating;
        this.imagePath = imagePath;
        this.lastName = lastName;
        this.noOfRating = noOfRating;
        this.password = password;
        this.phone = phone;
        this.route = route;
        this.token = token;
        this.totalRating = totalRating;
    }

    public UserModel(String accStatus, double distanceTraveled, String email, String emergencyContact, String firstName, int gotRating, Long id, String imagePath, String lastName, int noOfRating, String password, String phone, String route, String token, int totalRating) {
        this.accStatus = accStatus;
        this.distanceTraveled = distanceTraveled;
        this.email = email;
        this.emergencyContact = emergencyContact;
        this.firstName = firstName;
        this.gotRating = gotRating;
        this.id = id;
        this.imagePath = imagePath;
        this.lastName = lastName;
        this.noOfRating = noOfRating;
        this.password = password;
        this.phone = phone;
        this.route = route;
        this.token = token;
        this.totalRating = totalRating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getGotRating() {
        return gotRating;
    }

    public void setGotRating(int gotRating) {
        this.gotRating = gotRating;
    }

    public int getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(int totalRating) {
        this.totalRating = totalRating;
    }

    public int getNoOfRating() {
        return noOfRating;
    }

    public void setNoOfRating(int noOfRating) {
        this.noOfRating = noOfRating;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public String getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(String accStatus) {
        this.accStatus = accStatus;
    }

    @Override
    public String toString() {
        return "UserModel [id=" + id + ", email=" + email + ", password=" + password + ", phone=" + phone
                + ", firstName=" + firstName + ", lastName=" + lastName + ", imagePath=" + imagePath
                + ", emergencyContact=" + emergencyContact + ", route=" + route + ", token=" + token + ", gotRating="
                + gotRating + ", totalRating=" + totalRating + ", noOfRating=" + noOfRating + ", distanceTraveled="
                + distanceTraveled + ", accStatus=" + accStatus + "]";
    }

}
