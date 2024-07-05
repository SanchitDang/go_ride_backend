package com.sanapplications.goridebackend.service;

import com.sanapplications.goridebackend.model.AvailableRidesModel;
import com.sanapplications.goridebackend.model.RidesHistoryModel;
import com.sanapplications.goridebackend.repository.AvailableRidesRepository;
import com.sanapplications.goridebackend.repository.RidesHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TripService {

    private static final Logger logger = LoggerFactory.getLogger(TripService.class);

    private final AvailableRidesRepository availableRidesRepository;
    private final RidesHistoryRepository ridesHistoryRepository;

    @Autowired
    public TripService(AvailableRidesRepository availableRidesRepository, RidesHistoryRepository ridesHistoryRepository) {
        this.availableRidesRepository = availableRidesRepository;
        this.ridesHistoryRepository = ridesHistoryRepository;
    }

    public List<AvailableRidesModel> getAllTrips() {
        logger.info("Fetching all trips");
        return availableRidesRepository.findAll();
    }

    public List<AvailableRidesModel> getAllTripsUser(Long userId) {
        logger.info("Fetching all trips for user with ID: {}", userId);
        return availableRidesRepository.findByUserId(userId);
    }

    public List<AvailableRidesModel> getAllTripsDriver(Long driverId) {
        logger.info("Fetching all trips for driver with ID: {}", driverId);
        return availableRidesRepository.findByDriverId(driverId);
    }

    @Transactional
    public void createTrip(AvailableRidesModel data) {
        logger.info("Creating a new trip");
        availableRidesRepository.save(data);
    }

    @Transactional
    public void assignTrip(Long rideId) {
        logger.info("Assigning trip with ID: {}", rideId);
        Optional<AvailableRidesModel> rideOptional = availableRidesRepository.findById(rideId);
        if (rideOptional.isPresent()) {
            AvailableRidesModel ride = rideOptional.get();
            ride.setDriverStatus("assigned");
            availableRidesRepository.save(ride);
        } else {
            logger.error("Ride with ID: {} not found", rideId);
            throw new IllegalStateException("Ride not found");
        }
    }

    @Transactional
    public void completeTrip(Long rideId) {
        logger.info("Completing trip with ID: {}", rideId);
        Optional<AvailableRidesModel> rideOptional = availableRidesRepository.findById(rideId);
        if (rideOptional.isPresent()) {
            AvailableRidesModel ride = rideOptional.get();
            RidesHistoryModel history = new RidesHistoryModel();
            history.setUserId(ride.getUserId());
            history.setDriverId(ride.getDriverId());
            // Copy other fields

            ridesHistoryRepository.save(history);
            availableRidesRepository.delete(ride);
        } else {
            logger.error("Ride with ID: {} not found", rideId);
            throw new IllegalStateException("Ride not found");
        }
    }
}

