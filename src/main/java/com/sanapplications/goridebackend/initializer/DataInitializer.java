package com.sanapplications.goridebackend.initializer;

import com.sanapplications.goridebackend.repository.SettingsRepository;
import com.sanapplications.goridebackend.model.RoutesModel;
import com.sanapplications.goridebackend.model.SettingsModel;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sanapplications.goridebackend.model.AdminModel;
import com.sanapplications.goridebackend.repository.AdminRepository;
import com.sanapplications.goridebackend.repository.RoutesRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private final SettingsRepository settingsRepository;
    private final RoutesRepository routesRepository;
    private final AdminRepository adminRepository;

    public DataInitializer(SettingsRepository settingsRepository, RoutesRepository routesRepository, AdminRepository adminRepository) {
        this.settingsRepository = settingsRepository;
        this.routesRepository = routesRepository;
        this.adminRepository = adminRepository;
    }
    
    @Override
    public void run(String... args) throws Exception {
        // Initialize settings if not present
        if (settingsRepository.count() == 0) {
            SettingsModel initialSettings = new SettingsModel(0.9, 2.6, 10.0);
            settingsRepository.save(initialSettings);
        }

        // Initialize routes if not present
        if (routesRepository.count() == 0) {
            List<RoutesModel> routes = Arrays.asList(
                    new RoutesModel("Rohini to Gurugram_RG1"),
                    new RoutesModel("Pitampura to Gurugram_PG1"),
                    new RoutesModel("Shalimar Bagh to Gurugram_SBG1"),
                    new RoutesModel("Punjabi Bagh to Gurugram_PBG1"),
                    new RoutesModel("Pashchim Vihar to Gurugram_PVG1"),
                    new RoutesModel("Rajouri Garden to Gurugram_RGG1"),
                    new RoutesModel("Vikas Puri to Gurugram_VPG1"),
                    new RoutesModel("Janak Puri to Gurugram_JPG1"),
                    new RoutesModel("Dwarka to Gurugram_DG1")
            );
            routesRepository.saveAll(routes);
        }

        // Initialize admins if not present
        if (adminRepository.count() == 0) {
            // username: admin@admin.com, password: 12345678
            AdminModel admin = new AdminModel("admin@admin.com", "$2a$10$SFZZzjLVLr2xnNEr11b73uWUl7CyFoJPUIGj8c1L65TDMFHSw4eTS");
            adminRepository.save(admin);
        }
    }
}
