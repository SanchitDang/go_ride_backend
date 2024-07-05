package com.sanapplications.goridebackend.repository;

import com.sanapplications.goridebackend.model.AvailableRidesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvailableRidesRepository extends JpaRepository<AvailableRidesModel, Long> {

    List<AvailableRidesModel> findByUserId(Long userId);
    List<AvailableRidesModel> findByDriverId(Long driverId);

}
