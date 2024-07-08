package com.sanapplications.goridebackend.repository;


import com.sanapplications.goridebackend.model.RoutesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutesRepository extends JpaRepository<RoutesModel, Long> {
    
}
