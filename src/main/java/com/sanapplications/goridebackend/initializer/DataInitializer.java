package com.sanapplications.goridebackend.initializer;

import com.sanapplications.goridebackend.repository.SettingsRepository;
import model.SettingsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private SettingsRepository settingsRepository;

    @Override
    public void run(String... args) throws Exception {
        if (settingsRepository.count() == 0) {
            SettingsModel initialSettings = new SettingsModel(0.9, 2.6, 10.0);
            settingsRepository.save(initialSettings);
        }
    }
}

