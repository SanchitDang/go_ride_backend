package com.sanapplications.goridebackend.service;

import com.sanapplications.goridebackend.repository.SettingsRepository;
import com.sanapplications.goridebackend.model.SettingsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingsService {
    private final SettingsRepository settingsRepository;

    @Autowired
    public SettingsService(SettingsRepository settingsRepository) {
        this.settingsRepository = settingsRepository;
    }

    public SettingsModel getSettings(){
        return settingsRepository.findById(1L).orElseThrow(()-> new IllegalStateException(
                "Settings with ID 1 does not exists."
        ));
    }
}
