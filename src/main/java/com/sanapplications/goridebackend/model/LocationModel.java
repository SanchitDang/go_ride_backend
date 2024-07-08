package com.sanapplications.goridebackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "locations")
public class LocationModel {
    @Id
    @SequenceGenerator(
            name= "locations_sequence",
            sequenceName = "locations_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "locations_sequence"
    )
    private long id;
    private long userId;
    private double name;
    private double latitude;
    private double longitude;
    private String location;

    public LocationModel() {
    }

    public LocationModel(double latitude, String location, double longitude, double name, long userId) {
        this.latitude = latitude;
        this.location = location;
        this.longitude = longitude;
        this.name = name;
        this.userId = userId;
    }

    public LocationModel(long id, double latitude, String location, double longitude, double name, long userId) {
        this.id = id;
        this.latitude = latitude;
        this.location = location;
        this.longitude = longitude;
        this.name = name;
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

    public double getName() {
        return name;
    }

    public void setName(double name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationModel{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", location=").append(location);
        sb.append('}');
        return sb.toString();
    }

}
