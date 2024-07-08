package com.sanapplications.goridebackend.service;

import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.sanapplications.goridebackend.model.AdminModel;
import com.sanapplications.goridebackend.repository.AdminRepository;

@Service
public class AdminService {
    
    private final AdminRepository adminRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public AdminService(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.adminRepository = null;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @GetMapping("/admin/login")
    public boolean login(String email, String password) {
        Optional<AdminModel> optionalAdmin = adminRepository.findAdminByEmail(email);
        if (optionalAdmin.isPresent()) {
            AdminModel admin = optionalAdmin.get();
            if (bCryptPasswordEncoder.matches(password, admin.getPassword())) {
                // Password matches, login successful
                return true;
            }
        }
        // Login failed
        return false;
    }
}
