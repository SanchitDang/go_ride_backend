package com.sanapplications.goridebackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "rides_history")
public class RidesHistoryModel {
    @Id
    @SequenceGenerator(
            name= "rides_history_sequence",
            sequenceName = "rides_history_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "rides_history_sequence"
    )
    private long id;
    private long userId;
    private long driverId;
    private String date;
    private String time;
    private String startLocationName;
    private String dropLocationName;
    private int givenRatings;
    private String rideStatus;

    public RidesHistoryModel() {
    }

    public RidesHistoryModel(long id, long userId, long driverId, String date, String time, String startLocationName, String dropLocationName, int givenRatings, String rideStatus) {
        this.id = id;
        this.userId = userId;
        this.driverId = driverId;
        this.date = date;
        this.time = time;
        this.startLocationName = startLocationName;
        this.dropLocationName = dropLocationName;
        this.givenRatings = givenRatings;
        this.rideStatus = rideStatus;
    }

    public RidesHistoryModel(long userId, long driverId, String date, String time, String startLocationName, String dropLocationName, int givenRatings, String rideStatus) {
        this.userId = userId;
        this.driverId = driverId;
        this.date = date;
        this.time = time;
        this.startLocationName = startLocationName;
        this.dropLocationName = dropLocationName;
        this.givenRatings = givenRatings;
        this.rideStatus = rideStatus;
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

    public String getStartLocationName() {
        return startLocationName;
    }

    public void setStartLocationName(String startLocationName) {
        this.startLocationName = startLocationName;
    }

    public String getDropLocationName() {
        return dropLocationName;
    }

    public void setDropLocationName(String dropLocationName) {
        this.dropLocationName = dropLocationName;
    }

    public int getGivenRatings() {
        return givenRatings;
    }

    public void setGivenRatings(int givenRatings) {
        this.givenRatings = givenRatings;
    }

    public String getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(String rideStatus) {
        this.rideStatus = rideStatus;
    }

    @Override
    public String toString() {
        return "RidesHistory{" +
                "id=" + id +
                ", userId=" + userId +
                ", driverId=" + driverId +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", startLocationName='" + startLocationName + '\'' +
                ", dropLocationName='" + dropLocationName + '\'' +
                ", givenRatings=" + givenRatings +
                ", rideStatus='" + rideStatus + '\'' +
                '}';
    }
}
