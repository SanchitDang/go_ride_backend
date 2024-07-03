package com.sanapplications.goridebackend.service;

import com.sanapplications.goridebackend.model.UserModel;
import com.sanapplications.goridebackend.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public List<UserModel> getUsers(){
        return userRepository.findAll();
    }

    public UserModel addUser(UserModel userModel) {
        Optional<UserModel> userByEmail = userRepository.findUserByEmail(userModel.getEmail());
        if (userByEmail.isPresent()) {
            throw new IllegalStateException("Email is already taken");
        }

        String encodedPassword = bCryptPasswordEncoder.encode(userModel.getPassword());
        userModel.setPassword(encodedPassword);

        userRepository.save(userModel);
        return userModel;
    }

    public void deleteUser(Long userId) {
            boolean exists = userRepository.existsById(userId);
            if(!exists){
                throw new IllegalStateException("User with id " + userId + " does not exists.");
            }
            userRepository.deleteById(userId);
    }

    @Transactional
    public void updateUser(Long userId, String name, String email) {
        UserModel user = userRepository.findById(userId).orElseThrow(()-> new IllegalStateException(
                "User with id " + userId + " does not exists."
        ));
        if(name != null && name.length() > 0 && !Objects.equals(user.getFirstName(), name)){
            user.setFirstName(name);
        }
    }

    public boolean login(String email, String password) {
        Optional<UserModel> optionalUser = userRepository.findUserByEmail(email);
        if (optionalUser.isPresent()) {
            UserModel user = optionalUser.get();
            if (bCryptPasswordEncoder.matches(password, user.getPassword())) {
                // Password matches, login successful
                return true;
            }
        }
        // Login failed
        return false;
    }

    public UserModel register(String email, String password, String phone, String firstName, String lastName) {
        // Check if the email is already in use
        if (userRepository.findUserByEmail(email).isPresent()) {
            throw new IllegalStateException("Email is already taken");
        }

        // Encrypt the password
        String encodedPassword = bCryptPasswordEncoder.encode(password);

        // Create a new User object
        UserModel newUser = new UserModel();
        newUser.setEmail(email);
        newUser.setPassword(encodedPassword);
        newUser.setPhone(phone);
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);

        // Save the user to the repository
        return userRepository.save(newUser);
    }
}
