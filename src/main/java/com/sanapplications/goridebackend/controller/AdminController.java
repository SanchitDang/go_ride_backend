package com.sanapplications.goridebackend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanapplications.goridebackend.service.AdminService;

@RestController

@RequestMapping(path = "api/v1/admin")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("login")
    public boolean login(@RequestParam String email, @RequestParam String password) {
        return adminService.login(email, password);
    }

}