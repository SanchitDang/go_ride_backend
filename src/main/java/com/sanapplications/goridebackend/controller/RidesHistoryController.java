package com.sanapplications.goridebackend.controller;

import com.sanapplications.goridebackend.model.RidesHistoryModel;
import com.sanapplications.goridebackend.service.RidesHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/rides-history")
public class RidesHistoryController {
    private final RidesHistoryService ridesHistoryService;

    @Autowired
    public RidesHistoryController(RidesHistoryService ridesHistoryService) {
        this.ridesHistoryService = ridesHistoryService;
    }

    @GetMapping("getAllTripsHistory")
    public List<RidesHistoryModel> getAllTripsHistory() {
        return ridesHistoryService.getAllTripsHistory();
    }

    @GetMapping("getTripsHistoryDriver/{driverId}")
    public List<RidesHistoryModel> getTripsHistoryDriver(@PathVariable Long driverId) {
        return ridesHistoryService.getTripsHistoryDriver(driverId);
    }

    @GetMapping("getTripsHistoryUser/{userId}")
    public List<RidesHistoryModel> getTripsHistoryUser(@PathVariable Long userId) {
        return ridesHistoryService.getTripsHistoryUser(userId);
    }
}
