package com.sanapplications.goridebackend.controller;

import com.sanapplications.goridebackend.service.SettingsService;
import com.sanapplications.goridebackend.model.SettingsModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/settings")
public class SettingsController {
    
    private final SettingsService settingsService;

    public SettingsController(SettingsService settingsService) {
        this.settingsService = settingsService;
    }

    @GetMapping("getSettings")
    public SettingsModel getSettings(){
        return settingsService.getSettings();
    }

}
