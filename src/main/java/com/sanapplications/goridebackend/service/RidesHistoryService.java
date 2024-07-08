package com.sanapplications.goridebackend.service;

import com.sanapplications.goridebackend.model.RidesHistoryModel;
import com.sanapplications.goridebackend.repository.RidesHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RidesHistoryService {
    
    private final RidesHistoryRepository ridesHistoryRepository;

    public RidesHistoryService(RidesHistoryRepository ridesHistoryRepository) {
        this.ridesHistoryRepository = ridesHistoryRepository;
    }

    public List<RidesHistoryModel> getAllTripsHistory() {
        return ridesHistoryRepository.findAll();
    }

    public List<RidesHistoryModel> getTripsHistoryDriver(Long driverId) {
        return ridesHistoryRepository.findByDriverId(driverId);
    }

    public List<RidesHistoryModel> getTripsHistoryUser(Long userId) {
        return ridesHistoryRepository.findByUserId(userId);
    }
}
