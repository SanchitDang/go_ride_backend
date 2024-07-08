package com.sanapplications.goridebackend.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanapplications.goridebackend.model.AdminModel;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel, Long>{

    Optional<AdminModel> findAdminByEmail(String email);
    
}
