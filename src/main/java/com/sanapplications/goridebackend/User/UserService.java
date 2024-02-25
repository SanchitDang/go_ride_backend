package com.sanapplications.goridebackend.User;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserModel> getUsers(){
        return userRepository.findAll();
    }

    public void addUser(UserModel userModel) {
        Optional<UserModel> userByEmail = userRepository.findUserByEmail(userModel.getEmail());
        if(userByEmail.isPresent()){
            throw new IllegalStateException("email taken");
        }
        userRepository.save(userModel);
        System.out.println(userModel);
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
}
