package model;

import jakarta.persistence.*;

@Entity
@Table(name = "settings")
public class SettingsModel {
    @Id
    @SequenceGenerator(
            name= "setting_sequence",
            sequenceName = "setting_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "setting_sequence"
    )
    private Long id;
    private double appVersion;
    private double driverFare;
    private double passengerFare;

    public SettingsModel() {
    }

    public SettingsModel(Long id, double appVersion, double driverFare, double passengerFare) {
        this.id = id;
        this.appVersion = appVersion;
        this.driverFare = driverFare;
        this.passengerFare = passengerFare;
    }

    public SettingsModel(double appVersion, double driverFare, double passengerFare) {
        this.appVersion = appVersion;
        this.driverFare = driverFare;
        this.passengerFare = passengerFare;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(double appVersion) {
        this.appVersion = appVersion;
    }

    public double getDriverFare() {
        return driverFare;
    }

    public void setDriverFare(double driverFare) {
        this.driverFare = driverFare;
    }

    public double getPassengerFare() {
        return passengerFare;
    }

    public void setPassengerFare(double passengerFare) {
        this.passengerFare = passengerFare;
    }

    @Override
    public String toString() {
        return "SettingsModel{" +
                "id=" + id +
                ", appVersion=" + appVersion +
                ", driverFare=" + driverFare +
                ", passengerFare=" + passengerFare +
                '}';
    }
}
