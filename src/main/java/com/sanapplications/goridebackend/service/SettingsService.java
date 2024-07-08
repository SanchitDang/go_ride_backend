package com.sanapplications.goridebackend.service;

import java.util.List;

import com.sanapplications.goridebackend.repository.SettingsRepository;
import com.sanapplications.goridebackend.model.SettingsModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanapplications.goridebackend.model.RoutesModel;
import com.sanapplications.goridebackend.repository.RoutesRepository;

@Service
public class SettingsService {
    private final SettingsRepository settingsRepository;
    private final RoutesRepository routesRepository;

    @Autowired
    public SettingsService(SettingsRepository settingsRepository, RoutesRepository routesRepository) {
        this.settingsRepository = settingsRepository;
        this.routesRepository = routesRepository;
    }

    public SettingsModel getSettings(){
        return settingsRepository.findById(1L).orElseThrow(()-> new IllegalStateException(
                "Settings with ID 1 does not exists."
        ));
    }

    public List<RoutesModel> getRoutes(){
        return routesRepository.findAll();
    }
}
