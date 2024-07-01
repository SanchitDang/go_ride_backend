package com.sanapplications.goridebackend.repository;

import model.SettingsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingsRepository extends JpaRepository<SettingsModel, Long> {

}
