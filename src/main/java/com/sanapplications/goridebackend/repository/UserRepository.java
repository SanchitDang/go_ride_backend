package com.sanapplications.goridebackend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanapplications.goridebackend.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

    Optional<UserModel> findUserByEmail(String email);
    Optional<UserModel> findUserByPhone(String phone);

}
