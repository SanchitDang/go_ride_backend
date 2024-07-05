package com.sanapplications.goridebackend.repository;

import com.sanapplications.goridebackend.model.RidesHistoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RidesHistoryRepository extends JpaRepository<RidesHistoryModel, Long> {

    List<RidesHistoryModel> findByUserId(Long userId);
    List<RidesHistoryModel> findByDriverId(Long driverId);
}
