package com.sanapplications.goridebackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "available_rides")
public class AvailableRidesModel {
    @Id
    @SequenceGenerator(
            name= "available_rides_sequence",
            sequenceName = "available_rides_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "available_rides_sequence"
    )
    private long id;
    private long userId;
    private long driverId;
    private String date;
    private String time;
    private String token;
    private String otp;
    private String driverStatus;
    private String startLocation;
    private double startLatitude;
    private double startLongitude;
    private String dropLocation;
    private double dropLatitude;
    private double dropLongitude;
    private int pkgUsed;
    private String ride;
    private String route;

    public AvailableRidesModel() {
    }

    public AvailableRidesModel(String date, long driverId, String driverStatus, double dropLatitude, String dropLocation, double dropLongitude, String otp, int pkgUsed, String ride, String route, double startLatitude, String startLocation, double startLongitude, String time, String token, long userId) {
        this.date = date;
        this.driverId = driverId;
        this.driverStatus = driverStatus;
        this.dropLatitude = dropLatitude;
        this.dropLocation = dropLocation;
        this.dropLongitude = dropLongitude;
        this.otp = otp;
        this.pkgUsed = pkgUsed;
        this.ride = ride;
        this.route = route;
        this.startLatitude = startLatitude;
        this.startLocation = startLocation;
        this.startLongitude = startLongitude;
        this.time = time;
        this.token = token;
        this.userId = userId;
    }

    public AvailableRidesModel(String date, long driverId, String driverStatus, double dropLatitude, String dropLocation, double dropLongitude, long id, String otp, int pkgUsed, String ride, String route, double startLatitude, String startLocation, double startLongitude, String time, String token, long userId) {
        this.date = date;
        this.driverId = driverId;
        this.driverStatus = driverStatus;
        this.dropLatitude = dropLatitude;
        this.dropLocation = dropLocation;
        this.dropLongitude = dropLongitude;
        this.id = id;
        this.otp = otp;
        this.pkgUsed = pkgUsed;
        this.ride = ride;
        this.route = route;
        this.startLatitude = startLatitude;
        this.startLocation = startLocation;
        this.startLongitude = startLongitude;
        this.time = time;
        this.token = token;
        this.userId = userId;
    }

    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getDriverId() {
        return driverId;
    }

    public void setDriverId(long driverId) {
        this.driverId = driverId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(String driverStatus) {
        this.driverStatus = driverStatus;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(double startLongitude) {
        this.startLongitude = startLongitude;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public double getDropLatitude() {
        return dropLatitude;
    }

    public void setDropLatitude(double dropLatitude) {
        this.dropLatitude = dropLatitude;
    }

    public double getDropLongitude() {
        return dropLongitude;
    }

    public void setDropLongitude(double dropLongitude) {
        this.dropLongitude = dropLongitude;
    }

    public int getPkgUsed() {
        return pkgUsed;
    }

    public void setPkgUsed(int pkgUsed) {
        this.pkgUsed = pkgUsed;
    }

    public String getRide() {
        return ride;
    }

    public void setRide(String ride) {
        this.ride = ride;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AvailableRidesModel{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", driverId=").append(driverId);
        sb.append(", date=").append(date);
        sb.append(", time=").append(time);
        sb.append(", token=").append(token);
        sb.append(", otp=").append(otp);
        sb.append(", driverStatus=").append(driverStatus);
        sb.append(", startLocation=").append(startLocation);
        sb.append(", startLatitude=").append(startLatitude);
        sb.append(", startLongitude=").append(startLongitude);
        sb.append(", dropLocation=").append(dropLocation);
        sb.append(", dropLatitude=").append(dropLatitude);
        sb.append(", dropLongitude=").append(dropLongitude);
        sb.append(", pkgUsed=").append(pkgUsed);
        sb.append(", ride=").append(ride);
        sb.append(", route=").append(route);
        sb.append('}');
        return sb.toString();
    }

}
