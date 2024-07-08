package com.sanapplications.goridebackend.controller;

import com.sanapplications.goridebackend.model.AvailableRidesModel;
import com.sanapplications.goridebackend.service.TripService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/trip")
public class TripController {

    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping("getAllTrips")
    public List<AvailableRidesModel> getAllTrips() {
        return tripService.getAllTrips();
    }

    @GetMapping("getAllTripsUser/{userId}")
    public List<AvailableRidesModel> getAllTripsUser(@PathVariable Long userId) {
        return tripService.getAllTripsUser(userId);
    }

    @GetMapping("getAllTripsDriver/{driverId}")
    public List<AvailableRidesModel> getAllTripsDriver(@PathVariable Long driverId) {
        return tripService.getAllTripsDriver(driverId);
    }

    @PostMapping("createTrip")
    public void createTrip(@RequestBody AvailableRidesModel data) {
        tripService.createTrip(data);
    }

    @PostMapping("acceptTrip/{rideId}")
    public void acceptTrip(@PathVariable Long rideId) {
        tripService.assignTrip(rideId);
    }

    @PostMapping("completeTrip/{rideId}")
    public void completeTrip(@PathVariable Long rideId) {
        tripService.completeTrip(rideId);
    }
}
