package com.sanapplications.goridebackend.model;

import jakarta.persistence.*;


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
//    @Embedded
//    private LocationModel startLocation;
//    @Embedded
//    private LocationModel dropLocation;
    private int pkgUsed;
    private String ride;
    private String route;

    public AvailableRidesModel() {
    }

    public AvailableRidesModel(long id, long userId, long driverId, String date, String time, String token, String otp, String driverStatus,
//                          LocationModel startLocation, LocationModel dropLocation,
                               int pkgUsed, String ride, String route) {
        this.id = id;
        this.userId = userId;
        this.driverId = driverId;
        this.date = date;
        this.time = time;
        this.token = token;
        this.otp = otp;
        this.driverStatus = driverStatus;
//        this.startLocation = startLocation;
//        this.dropLocation = dropLocation;
        this.pkgUsed = pkgUsed;
        this.ride = ride;
        this.route = route;
    }

    public AvailableRidesModel(long userId, long driverId, String date, String time, String token, String otp, String driverStatus,
//                          LocationModel startLocation, LocationModel dropLocation,
                               int pkgUsed, String ride, String route) {
        this.userId = userId;
        this.driverId = driverId;
        this.date = date;
        this.time = time;
        this.token = token;
        this.otp = otp;
        this.driverStatus = driverStatus;
//        this.startLocation = startLocation;
//        this.dropLocation = dropLocation;
        this.pkgUsed = pkgUsed;
        this.ride = ride;
        this.route = route;
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

//    public LocationModel getStartLocation() {
//        return startLocation;
//    }
//
//    public void setStartLocation(LocationModel startLocation) {
//        this.startLocation = startLocation;
//    }
//
//    public LocationModel getDropLocation() {
//        return dropLocation;
//    }
//
//    public void setDropLocation(LocationModel dropLocation) {
//        this.dropLocation = dropLocation;
//    }

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
        return "AvailableRides{" +
                "id=" + id +
                ", userId=" + userId +
                ", driverId=" + driverId +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", token='" + token + '\'' +
                ", otp='" + otp + '\'' +
                ", driverStatus='" + driverStatus + '\'' +
//                ", startLocation=" + startLocation +
//                ", dropLocation=" + dropLocation +
                ", pkgUsed=" + pkgUsed +
                ", ride='" + ride + '\'' +
                ", route='" + route + '\'' +
                '}';
    }
}
